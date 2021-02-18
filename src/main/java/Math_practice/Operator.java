package Math_practice;

public class Operator {
    public static void main(String[] args) {

        int x = 0;
        int y = x++;            //y = x

        System.out.println(x);  //x+1
        System.out.println(y);  //x

        int z = --x;            //z = x = x-1
        System.out.println(z);


        int a = 4;
        int b = 5;
        int c = a & b;
        System.out.println("Logical result : "+c);

    }
}
