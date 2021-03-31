package Functional_Programming;
//lambda -> java 1.8

@FunctionalInterface
interface Citizen{
    boolean vote(int id, String choice);             // SAM -> Single Abstract Method

    default void doWork(){
        System.out.println("Default method is for that time when Method-Implementation may or may not found");
    }
}

public class With_lambda_returnType {
    public static void main(String[] args) {

        Citizen citizen_MethodBody = (id,choice)->{
            System.out.println("ID-"+id+" has successfully voted ->"+choice);
            return true;
        };

        System.out.println(citizen_MethodBody.vote(1,"tanvir"));
    }
}
