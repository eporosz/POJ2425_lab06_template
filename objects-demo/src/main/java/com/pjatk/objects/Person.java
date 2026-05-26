package com.pjatk.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Person(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = birthDate;
    }

    public Person copy() {
        return new Person(this.id, this.name, this.dateOfBirth);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(addresses, person.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirth, addresses);
    }

    @Override
    public String toString() {
        return "(" + this.id + ", " + this.name + ", " + this.dateOfBirth + ")\n" + "Adresy:\n" + this.addresses;
    }
}
