package Q4;

import java.util.Scanner;

// Write a program that helps the user count his change. The program should ask how many
// quarters the user has, then how many dimes, then how many nickels, then how many
// pennies. Then the program should tell the user how much money he has, expressed in
// dollars
public class testD {
    public static void main(String[] args) {
        double quatres,dimes,nickels,pennies,dollars;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the amount of Quatres you have :");
        quatres=scanner.nextInt();
        System.out.println("Enter the amount of Dimes you have :");
        dimes=scanner.nextInt();
        System.out.println("Enter the amount of Nickels you have :");
        nickels=scanner.nextInt();
        System.out.println("Enter the amount of Pennies you have :");
        pennies=scanner.nextInt();
        dollars = quatres/4+dimes/10+(nickels*20+pennies)/100;
        System.out.println("You have a total of "+Double.toString(dollars)+" dollars.");
        scanner.close();
    }
}
