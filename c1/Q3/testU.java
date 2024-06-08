package Q3;

import java.util.Scanner;

public class testU {
    public static void main(String[] args) {
        System.out.println("Enter your name here : ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String name = text.toUpperCase();
        System.out.println("Hello "+ name);
        in.close();
    }

}