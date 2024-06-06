package Q3;

import java.util.Scanner;

public class testD {
    public static void main(String[] args) {
       System.out.println("Enter Your Name Please : ");
       Scanner s = new Scanner(System.in);
       String name=s.nextLine();
       System.out.println("Hello "+name.toUpperCase().trim()+".");
       s.close();
    }
}
