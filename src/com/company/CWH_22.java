package com.company;

public class CWH_22 {
    public static void main(String[] args) {
        int marks[]=new int[5];
        //or int[] marks = {2,3,4,3,2,2};
        marks[0]=199;
        marks[1]=199;
        marks[2]=199;
        marks[3]=199;
        marks[4]=199;
        System.out.println(marks[1]);
        System.out.println(marks.length);

        //using for  each  loop
        for (int a :marks){
            System.out.println(a);
        }


    }
}
