package com.company;

import java.util.Scanner;

class Employee {
    int salary;
    String name;



    public String getName() {

        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class CWH_34 {
    public static void main(String[] args) {
        Employee shri = new Employee();
        shri.setName("shri");
        System.out.println(shri.getName());

    }
}
