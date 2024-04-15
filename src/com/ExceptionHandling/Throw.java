package com.ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        try{
            checkagefordriving();
        }
        catch(Exception e){
            System.out.println("the execption is" + " " + e.getMessage());
        }
    }
    public static void checkagefordriving()throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age<18) {
            throw new Exception ("Hey Kid You are Under Age");//we can throw our own exception
        }
        System.out.println("You are an adult");

    }
}
