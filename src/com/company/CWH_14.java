package com.company;

import java.util.Locale;

public class CWH_14 {
    public static void main(String[] args) {
        String a="SHRI\tkrishkna   ";
        System.out.println(a.trim());
        int value =a.length();
        System.out.println(value);
        String b=a.toUpperCase();
        System.out.println(b.trim());
        System.out.println(a.substring(0,4));
        System.out.println(a.replace("SHRI","krishna" ));
        System.out.println(a.startsWith("S"));
        System.out.println(a.charAt(7));
        System.out.println(a.indexOf('k',8));
        System.out.println(a.equalsIgnoreCase("shrikrishkna"));
        System.out.println("hello\"");
    }
}
