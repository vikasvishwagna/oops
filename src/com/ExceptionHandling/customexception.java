package com.ExceptionHandling;

import java.util.Scanner;

public class customexception {
    public static void main(String[] args) {
        try{
            checkagefordriving();
        }
        catch(invalidAgeexception e){//custom exception
            System.out.println("the execption is" + " " + e.getMessage());
        }
    }
    public static void checkagefordriving()throws invalidAgeexception{//custom exception
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age<18) {
            throw new invalidAgeexception ("Hey Kid You are Under Age");//custom exception
        }
        System.out.println("You are an adult");

    }
}
