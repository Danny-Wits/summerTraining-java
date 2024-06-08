package c2.q2;

public class testD {
    public static void main(String[] args) {
        int maxNo = 0, maxDiv = 0;
        for (int i = 1; i < 10000; i++) {
            if (divisor(i) > maxDiv) {
                maxDiv = divisor(i);
                maxNo = i;
            }
        }
        System.out.printf("The number %d has the maximum number of divisor ,%d to be exact", maxNo, maxDiv);
    }
    /** 
     * The function `divisor` calculates the number of divisors of a given input number.
     * 
     * @param number The `number` parameter in the `divisor` function represents the integer for which
     * we want to find the number of divisors. The function calculates and returns the count of
     * divisors of the given number.
     * @return The `divisor` function returns the number of divisors of the input `number`.
     */
    static int divisor(int number) {
        int numberOfDivisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }
}
