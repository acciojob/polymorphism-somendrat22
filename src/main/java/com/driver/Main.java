package com.driver;

public class Main {

   public static class Product{
       // Non Static class
       public int product(int x, int y) {
           return x*y;
       }
       public int product(int x, int y, int z) {
           return x*y*z;
       }

       public double product(double x, double y) {
           return x*y;
       }

   }

    public static void main(String[] args) {
        // Java : You can access static variables directly inside static methods
        // if you want to access instance variable inside static method then you need to
        // create object of the class and then you can access the instance variable inside static method
        // static method
        Product p = new Product();
        p.product(2, 3);
        p.product(2,3,5);
        p.product(3.0, 4.0);

    }


    // If you want to access static variable inside non static method
    // You can access static variables with the name of the class

    public void help(){
        Somendra s = new Somendra();
    }

}