package com.company;

public class CWH_26 {
   static void change(int[] x){
      x[0]=100;

   }


    public static void main(String[] args) {
   int[] marks={32,45,87,56};
        System.out.println(marks[0]);
        change(marks);
        System.out.println(marks[0]);
        //its like call by refrence,,

    }
}
