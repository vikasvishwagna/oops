package com.ExceptionHandling;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {

        try {
            methodcalling();

            int[] arr = new int[5];
            int n = arr.length;
            for (int i = 0; i <5; i++) {
                System.out.println(arr[6]);
            }
        } catch (ArithmeticException e){
            System.out.println("Arthematic exception");//this is a child exception
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound");//this is a child exception
        }
        catch (Exception e){
            System.out.println("catch every exception");//this is a parent exception
        }
        finally {
            System.out.println("finally block");
        }
        //we cant catch parent exception before child exception it will throw compaile error
    }
    public static void methodcalling()throws Exception{

        Scanner sc = new Scanner(System.in);
        int div = sc.nextInt();
        int a = 10/div;

    }
}