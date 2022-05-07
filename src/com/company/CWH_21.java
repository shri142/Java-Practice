package com.company;
import java.util.Scanner;
public class CWH_21 {
    public static void main(String[] args) {
        int fac=1;
        System.out.println("Enter no of columns do you want to print ");
        Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
       for (int i=a;i>0;i--){
         for (int j=i;j>0;j--) {
             System.out.print("*");
         }
           System.out.println("");
       }

       for (int k=0;k<a;k++) {

           fac=fac*(a-k);

       }
        System.out.println("factorial is "+ fac);
    }

}
