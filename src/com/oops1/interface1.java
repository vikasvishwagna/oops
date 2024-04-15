package com.oops;

interface electronics{
    void phone();
    }
    interface vehicle
    {
        void bike();
    }

   public class  interface1 implements electronics,vehicle{

        @Override
        public void phone() {
            System.out.println("used for calling");
        }

        @Override
        public void bike() {
            System.out.println("used for travelling");
        }

        public static void main(String[] args) {
            interface1 p1 = new interface1();
            p1.bike();
            p1.phone();
        }
    }