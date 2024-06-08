package c2.q3;

import java.util.Scanner;

public class testD {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        char operator;
        while (true) {
            System.out.println("Start Entering  the Expression : ");
            number1 = scanner.nextDouble();
            if (number1==0) {
                scanner.close();
                break;
            }
            operator = scanner.next().charAt(0);
            number2 = scanner.nextDouble();
            double result = calculate(number1, operator, number2);
            System.out.println("The evaluation of the expression is "+ result);  
        }
        scanner.close();
       
    }
    static double calculate(double number1, char operator, double number2) {
        switch (operator) {
            case '+': return number1+number2;
            
            case '-':return number1-number2;
    
            case '*':return number1*number2;

            case '/':return ((number2!=0)?(number1/number2):0);

            default:return 0;
        }

    }
}
