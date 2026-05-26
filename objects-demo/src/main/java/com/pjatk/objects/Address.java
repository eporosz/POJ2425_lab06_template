package com.pjatk.objects;

import java.util.ArrayList;

public class Address {
    private int id;
    private String city;
    private String postalCode;
    private ArrayList<String> addressLines = new ArrayList<>();

    public Address(int id, String city, String postalCode) {
        this.id = id;
        this.city = city;
        this.postalCode = postalCode;
    }

    public ArrayList<String> getAddressLines() {
        return addressLines;
    }

    private String displayAddressLines() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (String line : addressLines) {
            sb.append(line).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "(" + this.id + ", " + this.city + ", " + this.postalCode + ", " + displayAddressLines() + ")";
    }
}
