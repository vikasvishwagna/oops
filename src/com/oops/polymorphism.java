package com.oops;
//discussed about method overriding method overloading
public class polymorphism {
    //method overriding or run time
    public static void main(String[] args) {
        sports s1 = new sports();
        s1.virat();

        sports s2 = new cricket();
            s2.virat();

        cricket s3 = new cricket();
        s3.virat();

//        cricket s4 = new sports();//error because here sports is a parent class of cricket
//        s4.virat();


        //method overloading or compile time.

        car c1 = new car();
        c1.colour();
        c1.colour(5);
        c1.colour(2,8);
    }
}
class sports{
   void virat(){
       System.out.println("plays odi cricket");
    }

}
class cricket extends sports{
    void virat(){
        System.out.println("plays test crisket aswell");
    }
}


class car{
    void colour(){
        System.out.println("blue");
    }
    void colour(int a) {
        System.out.println("orange");
    }
        void colour(int a,int b){
            System.out.println("black");
        }

}
