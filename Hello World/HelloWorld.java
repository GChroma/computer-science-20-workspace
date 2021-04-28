import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World! Enter your name please: \n");

        Scanner myObj = new Scanner(System.in);
        String userInput = myObj.nextLine();
        System.out.println("Hello " + userInput);
        
    }

}