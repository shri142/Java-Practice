package com.company;

class MyEmploye1 {
    private int id;
    private String name;

    public void setId(int i) {
        id = i;    // or id or this.id both are same
    }

    public int getId() {
        return id;
    }
    public MyEmploye1() {
        id = 57;
    }
}

public class CWH_37 {
    public static void main(String[] args) {
        MyEmploye1 shri = new MyEmploye1();
//        shri.setId(57);
//        System.out.println(shri.getId());
        System.out.println(shri.getId());// now no error even there is private


    }
}//why nt getting 57 as output
