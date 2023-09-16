package com.oops;

public class student {
    //created a object accesed a object
     int rollno;  //instance variable
     String name; //instance variable
   static String school; //static variable

    public static void main(String[] args) {
        student s1 = new student(); //initalizaing a object
        student s2 = new student();

        s1.rollno=11; // initalizing rpllno
        s2.rollno=22;

        s1.name="ajay"; // ini name
        s2.name="vijay";

        school="panchavati"; //with out object creation i.e..  s1.school we have ini school

        System.out.println(s1.rollno+" "+s1.name+" "+school);
        System.out.println(s2.rollno+" "+s2.name+" "+school);
    }

}
