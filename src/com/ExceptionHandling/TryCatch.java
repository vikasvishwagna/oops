package com.ExceptionHandling;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int div = sc.nextInt();
            //critical statement 1
            int a =15/div;

            //critical statement 2
            int [] arr = new int[5];
            for(int i=0; i<5;i++){
                System.out.println(arr[5]);
            }

        }catch (ArithmeticException e){
            System.out.println("Arithematic exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("this is array index out of bound");
        }
        finally {
            System.out.println("no matter what this finally block will be excuted");
        }
    }
}
