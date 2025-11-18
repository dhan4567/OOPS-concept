package Inheritance;


import java.sql.SQLOutput;

class Fruit{
    void determination(){
        System.out.println("we all having different colors");
    }

}
class Mango extends Fruit{
    void determination(){
        System.out.println("i am orange");
    }
}
class Banana extends Fruit{
    void determination(){
        System.out.println("i am yellow");
    }

}
class Strawberry extends Fruit{
    void determination(){
        System.out.println("i am red");
    }

}
public class HeirarchyInherit {
    public static void main(String[] args) {
        Strawberry fruit = new Strawberry();
        Banana banana = new Banana();
        banana.determination();
        fruit.determination();

    }
}
