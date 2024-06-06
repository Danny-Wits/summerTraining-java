package Q3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
  
       // This Java code prompts the user to enter their name, reads the input using a `Scanner`
       // object, converts the input to uppercase, trims any leading or trailing white spaces, and then
       // prints a greeting message with the modified name. Finally, it closes the `Scanner` object to
       // release system resources.
       System.out.println("Enter Your Name Please : ");
       Scanner s = new Scanner(System.in);
       String name=s.nextLine();
       System.out.println("Hello "+name.toUpperCase().trim()+".");
       s.close();
    }
}
