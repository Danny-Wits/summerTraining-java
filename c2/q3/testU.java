package c2.q3;

import java.util.Scanner;

public class testU {

    public static void main(String[] args) {
        float num1;
        char op;
        float num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Start entering expression(enter 0 to exit) : ");
        while (true) {
            num1 = scan.nextInt();
            if (num1 == 0) {
                break;
            }
            op = scan.next().charAt(0);
            num2 = scan.nextInt();
            switch (op) {
                case '+':
                    System.out.println("Sum = " + num1 + num2);
                    break;
                case '-':
                    System.out.println("Difference = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Product= " + num1 * num2);
                    break;
                case '/':
                    System.out.println("Division= " + num1 / num2);
                    break;
            }
        }

    }

}