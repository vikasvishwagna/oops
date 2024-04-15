package com.Collections;

import java.util.Vector;

public class VectorInterface {
    public static void main(String[] args) {
        //1.creating a vector
        System.out.println("creating a vector");
        Vector v1 = new Vector();
        System.out.println("This is v1"+v1);// empty vector.
        Vector v2 = new Vector();
        System.out.println("This is v2"+v2);

        //2.adding (we can perform add operation in diff ways)
        System.out.println("adding a vector");
        v1.add("vikas");//way 1 of adding
        v1.add("sahana");
        v2.add("code");
        v2.add("max");
        System.out.println("This is v1" + v1);
        System.out.println("This is v2" + v2);

        v1.add(0,"accio");//way 2 of adding
        System.out.println("This is v1" + v1);

        v2.addAll(1,v1);//way 3
        System.out.println("This is v2  from idx 1 is v1" + v2);

        v2.addAll(v1);//way 4
        System.out.println("This is v2" + v2);

//        v1.addElement(v2);//way 5
//        System.out.println("This is v1" + v1);


        //3.retreve(get)
        System.out.println("retreving a vector");
        System.out.println(v1.get(1));

        //4.remove operation(it is also performed in diff ways)
        //1.remove(value),2.remove(idx),3.v1.clear() this are the 3 main operations

        System.out.println("delete operation");
        v2.remove("vikas");//removes vikas
        System.out.println(v2);
        v2.remove(3);//delets at idx 3
        System.out.println("this is v2"+v2);
//        v2.removeAll(v1);//delets all v1 elements from v1
//        System.out.println(v2);
//        v1.clear();//clears v1 total
//        System.out.println(v1);

        //5.verification
        System.out.println("verification operation");
        System.out.println(v2.contains("code"));
        System.out.println(v2.contains("ajay"));

        System.out.println(v2.containsAll(v1));
        System.out.println(v1.containsAll(v2));

        //6.update
        System.out.println("update operation");
        v1.set(0,"update");
        System.out.println(v1);
    }
}
