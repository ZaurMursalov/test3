package foot;

import java.util.Objects;

public class Fener {
    String name;
    String surName;
    int age;
    int pinCode;

    public Fener(String name, String surName, int age, int pinCode) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Fener{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", pinCode=" + pinCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fener fener = (Fener) o;
        return age == fener.age && pinCode == fener.pinCode && Objects.equals(name, fener.name) && Objects.equals(surName, fener.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age, pinCode);
    }

    public static void main(String[] args) {
        Fener fb =new Fener("Altay","Bayindir",23,12345);
        Fener fb1 =new Fener("Altay","Bayindir",23,12346);
        Fener fb2 =new Fener("Altay","Bayindir",23,12345);
        Fener fb3 =new Fener("Altay","Bayindir1",23,12346);
        System.out.println("fb="+fb.hashCode());
        System.out.println("fb1="+fb1.hashCode());
        System.out.println("fb2="+fb2.hashCode());
        System.out.println("fb3="+fb3.hashCode());
        System.out.println("equals="+fb.equals(fb1));
        System.out.println("equals="+fb1.equals(fb2));
        System.out.println("equals="+fb.equals(fb2));
        System.out.println(fb==fb1);
        System.out.println(fb1==fb2);
    }
   /* {
        String b=new String("Aze");
        String f= "Aze";
        String d="Aze";
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(b==f);
        System.out.println(f==d);
        System.out.println(f.equals(d));
        System.out.println(b.equals(f));
        System.out.println(f.hashCode());
        System.out.println(d.hashCode());
        System.out.println(b.hashCode());
    }*/
}
