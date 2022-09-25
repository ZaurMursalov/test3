package foot;

import java.util.Objects;

public class Transfer {
    String name;
    String surName;
    int pincode;

    public Transfer(String name, String surName, int pincode) {
        this.name = name;
        this.surName = surName;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfer transfer = (Transfer) o;
        return pincode == transfer.pincode && Objects.equals(name, transfer.name) && Objects.equals(surName, transfer.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, pincode);
    }

    public static void main(String[] args) {
        Transfer tr = new Transfer("Aslan","Aslanov",123456);
        Transfer tr1 = new Transfer("Aslan","Aslanov",123456);
        System.out.println(tr);
        System.out.println(tr1);
        System.out.println(tr.equals(tr1));
        System.out.println(tr.hashCode());
        System.out.println(tr1.hashCode());
    }
}
