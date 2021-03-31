package Functional_Programming;

interface Animal{
    void live();
}

public class Pre_lambda {
    public static void main(String[] args) {

        Animal animal = new Animal() {                  // extra annonymoyous class is created
            @Override
            public void live() {
                System.out.println("I am a simply living animal.");
            }
        };

        animal.live();
    }
}
