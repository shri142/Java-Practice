package com.company;

class Employe{
    int id;
    int salary;
    String name;
    public void detail(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }
}
public class CWH_33 {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employe harry =new Employe(); //instantiating
        harry.id=1;
        harry.name="garry";
        harry.salary=67000;
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.detail();

    }
}
