package com.company;
import java.util.Scanner;
public class CWH_07 {
     public static void main(String[] args) {
          System.out.println("Find Your Percentage");
         Scanner sc = new Scanner(System.in);
       int a1,a2,a3,b1,b2,b3;
         System.out.println("Enter marks you got in sub 1");
         a1 = sc.nextInt();
         System.out.println("Out of how many");
         b1 = sc.nextInt();
         System.out.println("Enter marks you got in sub 2");
         a2 = sc.nextInt();
         System.out.println("Out of how many");
         b2 = sc.nextInt();
         System.out.println("Enter marks you got in sub 3");
         a3 = sc.nextInt();
         System.out.println("Out of how many");
         b3 = sc.nextInt();
         int percentage;
         percentage = (a1+a2+a3)*100/(b1+b2+b3);
         System.out.println("You got "+ percentage+ " percentage");
     }
}
