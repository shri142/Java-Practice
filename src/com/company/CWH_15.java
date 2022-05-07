package com.company;
import java.util.Scanner;
public class CWH_15 {
    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println("original string\n"+a+" thank you");
        String b=a.toLowerCase();
        System.out.println(a.indexOf("  "));

    }
}
