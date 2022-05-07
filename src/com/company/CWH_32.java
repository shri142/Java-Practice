package com.company;
import java.util.Scanner;
public class CWH_32 {
   static int star_pattern(int a) {
       a = 0;
       if (a<1) {
           return star_pattern(a - 1);

       }
           while (a < 5) {
               System.out.print("*");
               a++;

           }
           return 0;


   }
    public static void main(String[] args) {
//        star pattern with recursion
        System.out.println("Enter no of stars you want...");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        star_pattern(4);


    }
}
