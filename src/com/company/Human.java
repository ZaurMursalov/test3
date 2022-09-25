package com.company;

public class Human {
   /* static {
        String a = new String("Language");
        String a1 = "Language";
        String a2 = "Language";
        String a3 = " Language";
        a3.trim();

        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
        System.out.println(a.equals(a1));
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a3));
        System.out.println(a==a1);
        System.out.println(a1==a2);
        System.out.println(a2==a3);


    }*/
    public static void main(String[] args) {
        String name = new String("Human");
        String name1 = "Human";
        String name2 = "Human";
        String name3 = "Human";
        System.out.println("name=" + name.hashCode());
        System.out.println("name1=" + name1.hashCode());
        System.out.println("name2=" + name2.hashCode());
        System.out.println("name3=" + name3.hashCode());
        System.out.println("==:"+(name == name1));
        System.out.println("==:"+(name1 == name2));
        System.out.println("==:"+(name2 == name3));
        System.out.println("equals:"+name.equals(name1));
        System.out.println("equals:"+name.equals(name2));
        System.out.println("equals:"+name1.equals(name3));

        String ad=new String("Man");
        String ad1="Man";
        String ad2="Man";
        String ad3="Man";
        String ad4="Man";
        System.out.println("ad="+ad.hashCode());
        System.out.println("ad1="+ad1.hashCode());
        System.out.println("ad2="+ad2.hashCode());
        System.out.println("ad3="+ad3.hashCode());
        System.out.println(ad.equals(ad1));
        System.out.println(ad1.equals(ad2));
        System.out.println(ad3.equals(ad4));
        System.out.println(ad==ad1);
        System.out.println(ad1==ad2);
        System.out.println(ad2==ad3);
        System.out.println(ad3==ad4);


    }
}
