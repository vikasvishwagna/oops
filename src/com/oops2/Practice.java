package com.oops2;

public class Practice {

}
class human{
    int age ;
    String name;

    human(int age,String name){
        this.age=age;
        this.name=name;
    }
    void job(){
        System.out.println("farmer");
    }

    public static void main(String[] args) {
        human h1 = new human(22, "jay");
        h1.job();

        virat v1 = new virat(35,"vk",74,24000);
        v1.job();


    }
}
class virat extends human{
int centuries;
int runs;
virat(int age,String name,int centuries,int runs) {
    super(age, name);
    this.centuries = centuries;
    this.runs = runs;
}
void job(){
    System.out.println("pro cricketer");
}
}
