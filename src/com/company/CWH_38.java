package com.company;
class base{
  public  int x;

    public int getX() {
        System.out.println("i  m  in  base ");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
class Derives extends base{
  public  int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class CWH_38 {
    public static void main(String[] args) {
      base b = new base();
      b.setX(4);
        System.out.println(b.getX());


        Derives c= new Derives();
        c.setX(43);
        System.out.println(c.getX());
    }
}
