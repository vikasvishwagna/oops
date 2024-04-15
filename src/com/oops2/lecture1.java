package com.oops2;
class Bankacc{
    int accNo ;
    String name;
    int phNo;
    int balance;

    Bankacc(int newaccNo, String newNAME, int newphNo,int nbalance){
       this.accNo = newaccNo;
         name = newNAME;
        phNo = newphNo;
        balance = nbalance;
    }

    public void Withdraw(int Money){
        balance = balance - Money;
        System.out.println("your current balance is "+ balance);
    }
    public void AddMoney(int Money){
        balance = balance + Money;
        System.out.println("your current balance is "+balance);
    }
}

public class lecture1 {
    //lecture 1 of Thusar has discussed the  class,obj,method,constructor.

    public static void main(String[] args) {

        Bankacc b1 = new Bankacc(456,"vikas",456789,15000);
        System.out.println(b1.name);
        b1.Withdraw(12000 );
        b1.AddMoney(7000);

        Bankacc b2 = new Bankacc(759,"sahana",87984,20048);
        System.out.println(b2.name);
        b2.Withdraw(48);
        b2.AddMoney(548);

//        b1.accNo = 123;
//        b1.name = "vikas";
//        b1.phNo = 123456;
//
//        System.out.println(b1.accNo);
//        this method is very long method because if u have n attributes we have to call b1.name,b1.age,...
//        for that constructors has introduced


    }
    }


