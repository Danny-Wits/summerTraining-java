package Q5;

import java.util.Scanner;

public class testD {
    public static void main(String[] args) {
        int numEgg,dozens,gross,leftover;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of eggs you have : ");
        numEgg= scanner.nextInt();
        gross=numEgg/144;
        leftover=numEgg%144;
        dozens=leftover/12;
        leftover=leftover%12;
        System.out.printf("You have a %d gross, %d dozens and %d eggs.", gross,dozens,leftover);
        scanner.close();
    }
}
