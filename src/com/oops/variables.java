package com.oops;

public class variables {

    //local,static,instance com.oops.variables in java

    //code starts

  public int a = 10;//instance variable we can use access modifiers
  public static int b = 20;//static variable we can use access modifiers

    public static void main(String[] args) {

        variables obj1 = new variables(); // obj1 is called as referance variable
        variables obj2 = new variables();

        // instance variable
        System.out.println(obj1.a );//10  printing a instance variable with object declaration obj.a

        //static variable
        System.out.println(b);//20  for printing a static variable no obj declaration is req.

        //local variable
        int a = 200;//for local var  we cannot use access modifiers
        int b = 300;
        System.out.println( a + b);//500

        System.out.println("---------------");
        System.out.println(a);//200
        System.out.println(obj1.a );//takes instance var of val 10
        System.out.println(obj1.a+b );//10+300
        System.out.println(obj1.a+obj2.b );//10+20
    }

}
