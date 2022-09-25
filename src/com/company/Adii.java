package com.company;

import java.util.Objects;

public class Adii {
    int id;
    int pincode;
    String name;
    String surName;

    public Adii(int id, int pincode, String name, String surName) {
        this.id = id;
        this.pincode = pincode;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Adii{" +
                "id=" + id +
                ", pincode=" + pincode +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adii adii = (Adii) o;
        return pincode == adii.pincode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pincode);
    }

    public static void main(String[] args) {
        Adii adi=new Adii(1234,12345,"Leo","Messi");
        Adii adi1=new Adii(1234,12346,"Leo","Messi");
        Adii adi2=new Adii(1234,12348,"Leo","Messi");
        System.out.println(adi+"Hascode="+adi.hashCode());
        System.out.println(adi1+"Hascode="+adi1.hashCode());
        System.out.println(adi2+"Hascode="+adi2.hashCode());
        System.out.println("equals:"+adi.equals(adi1)+"|==|"+(adi==adi1));
        System.out.println("equals:"+adi.equals(adi2)+"|==|"+(adi==adi2));
        System.out.println("equals:"+adi1.equals(adi2)+"|==|"+(adi1==adi2));


    }
}
