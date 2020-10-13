package Primitives;
// 8 wrapper classes ------ N6,C,B
// toString() is overriden in wrapper class
// hashcode() in wrapper cls retuns value not memory hash

//Byte
//Short
//Integer
//Long
//Float
//Double

//Character
//Boolean

public class WC_Byte {
    public static void main(String[] args) {
        //Byte constructor takes String or Byte
        Byte byte1 = new Byte("127");
        Byte byte2 = new Byte((byte)-128);

        // valueOf() is the best way of creating Byte using cach memory
        Byte byte3 = Byte.valueOf("127");
        Byte byte4 = Byte.valueOf("101",2); // radix range 2-36
        Byte byte5 = Byte.valueOf((byte)127);

        System.out.println("Bytes are :"+byte1+byte2+byte3);

        Byte bt = (byte)450;
        String s = bt.toString();       // toString() is overriden in wrapper class
        System.out.println(bt);

        




    }
}
