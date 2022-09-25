package com.company;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        System.out.println("Cevirmek istediyin sozu yazin:::");
        String club="Fenerbagca";
        int lengt=club.length();
        String reverse="";
        for (int i=lengt-1;i>=0;i--){
            reverse= reverse+club.charAt(i);
        }
        System.out.println(reverse );
    }
}
