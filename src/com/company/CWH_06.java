package com.company;
import java.util.Scanner;
public class CWH_06 {
    public static void main(String[] args) {
        System.out.println("input");
        String str;
        Scanner sc = new Scanner(System.in) ;
            System.out.println("enter no 1");
            int a = sc.nextInt();
            System.out.println("enter no 2");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(sum);
            boolean b1 = sc.hasNextFloat();
            System.out.println(b1);
            str = sc.nextLine();

        System.out.println(str);

    }
}
