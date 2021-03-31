package Functional_Programming;
//lambda -> java 1.8

@FunctionalInterface
interface People{
    void eat();
}

public class With_lambda {
    public static void main(String[] args) {

        People people = ()->{ System.out.println("People eat to live");};       // no annonymous class

        people.eat();           // method call
    }
}
