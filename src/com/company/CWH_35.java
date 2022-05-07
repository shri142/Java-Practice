package com.company;

class square {
    int length ;
    public int area(int n){
      return n*n;
    }
    public int peri(int m){
        return m*4;
    }
}

public class CWH_35 {
    public static void main(String[] args) {

        square sq = new square();
        sq.length=5;
        System.out.println("area of square is "+ sq.area(sq.length));
        System.out.println("perimeter of square is "+ sq.peri(sq.length));
    }
}
