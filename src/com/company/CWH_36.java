package com.company;

class MyEmploye {
    private int id;
    private String name;

    public void setId(int i) {
        id = i;    // or id or this.id both are same
    }

    public int getId() {
        return id;
    }
}

public class CWH_36 {
    public static void main(String[] args) {

        MyEmploye shri = new MyEmploye();
//        shri.id=45;
//        shri.name= "shri"; throws error due to private class
        shri.setId(45);
        System.out.println(shri.getId());

    }
}
