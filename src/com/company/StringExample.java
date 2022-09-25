package com.company;

import java.util.Objects;

public class StringExample {
    int id;
    String name;
    String surName;
    int pincode;

    public StringExample(int id, String name, String surName, int pincode) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "StringExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringExample that = (StringExample) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        StringExample str = new StringExample(123456, "Zaur", "Murselov", 123);
        StringExample str1 = new StringExample(123456, "Zaur", "Murselov", 123);
        StringExample str2 = new StringExample(123456, "Murad", "Musayevv", 123);
        StringExample str3 = new StringExample(1234789, "Zaur", "Murselov", 123);
        System.out.println("str->"+str+"->"+str.hashCode());
        System.out.println("str1->"+str1+"->"+str1.hashCode());
        System.out.println("str2->"+str2+"->"+str2.hashCode());
        System.out.println("str3->"+str3+"->"+str3.hashCode());
        System.out.println("-----------");
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
        System.out.println("-----------");
        System.out.println(str == str1);
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
    }
}
