package com.company;

public class Tur {
    String name;
    String surName;
    int age;
    int pinCode;

    public Tur(String name, String surName, int age, int pinCode) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Tur{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", pinCode=" + pinCode +
                '}';
    }

   static void sum() {
        String str = new String("Azer");
        String str1 = "Azer";
        String str2 = "Azer";
        String str3 = "Azer";
        System.out.println("equals: "+str.equals(str1)+" |== "+(str==str1));
        System.out.println("equals: "+str.equals(str3)+" |== "+(str==str3));
        System.out.println("equals: "+str2.equals(str3)+" |== "+(str2==str3));
        System.out.println(str);
        Tur tr=new Tur("Arda","Guler",17,12345);
        Tur tr1=new Tur("Arda","Guler",17,12345);
        Tur tr2=new Tur("Arda","Guler",17,12345);
        System.out.println(tr);
        System.out.println(tr1);
        System.out.println(tr2);
    }

    public static void main(String[] args) {
        sum();
    }
}
