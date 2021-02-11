public class test {
    public static void main(String[] args) {
        System.out.println("Java is back again.Don't worry tanvir!");


        String message = "Hello world!";                    // 11 is last index
        String newMessage = message.substring(6, 12)        // 12 excluded
                + message.substring(12, 6);                 // 12 included
        System.out.println(newMessage);




    }
}
