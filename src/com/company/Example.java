package com.company;

import java.util.Objects;

public class Example {
    int pincode;
    int id;
    String name;
    String surName;

    public Example(int pincode, int id, String name, String surName) {
        this.pincode = pincode;
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Example{" +
                "pincode=" + pincode +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return pincode == example.pincode && id == example.id && Objects.equals(name, example.name) && Objects.equals(surName, example.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pincode, id, name, surName);
    }

    public static void main(String[] args) {
        Example example = new Example(12345,12,"Zaur","Mursalov");
        Example example1 = new Example(12345,12,"Zaur","Mursalov");
        Example example2 = new Example(12345,12,"Zaur","Mursalov");
        System.out.println(example+"hascode="+example.hashCode());
        System.out.println(example1+"hascode="+example1.hashCode());
        System.out.println(example2+"hascode="+example2.hashCode());
        System.out.println("equals:"+example.equals(example1)+"|==:"+(example==example1));
        System.out.println("equals:"+example.equals(example2)+"|==:"+(example==example2));
        System.out.println("equals:"+example1.equals(example2)+"|==:"+(example1==example2));

    }
}
