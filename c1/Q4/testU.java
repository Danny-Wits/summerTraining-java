package Q4;

import java.util.Scanner;

public class testU {
    public static void main(String[] args) {
        System.out.println("How many quarters you have ?");
        Scanner scan = new Scanner(System.in);
        float q = scan.nextInt();
        System.out.println("How many dimes you have ?");
        float d = scan.nextInt();
        System.out.println("How many nickles you have ?");
        float n = scan.nextInt();
        System.out.println("How many pennies you have ?");
        float p = scan.nextInt();
        float total = (q * 25 + d * 10 + n * 5 + p * 1) / 100;
        System.out.printf("Your total change is %f dollars", total);
        scan.close();
    }
}
