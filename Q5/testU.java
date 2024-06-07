package Q5;

import java.util.Scanner;

public class testU {
    public static void main(String[] args) {
        System.out.println("How many eggs you have ?");
        Scanner scan = new Scanner(System.in);
        int eggs = scan.nextInt();
        int gross = eggs / 144;
        int r1 = eggs % 144;
        int dozen = r1 / 12;
        int left = r1 % 12;
        System.out.printf("Your number of eggs is %d gross , %d dozen and %d", gross, dozen, left);
        scan.close();
    }
}
