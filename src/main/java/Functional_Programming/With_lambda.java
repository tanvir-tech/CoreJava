package Functional_Programming;
//lambda -> java 1.8

@FunctionalInterface
interface People{
    void eat();             // SAM -> Single Abstract Method

    default void speak(){
        System.out.println("Default method is for that time when Method-Implementation may or may not found");
    }
}

public class With_lambda {
    public static void main(String[] args) {

        People people = ()->{ System.out.println("People eat to live");};       // no annonymous class

        people.eat();           // method call
    }
}
