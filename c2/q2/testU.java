package c2.q2;

public class testU {
    public static void main(String[] args) {
        int temp = 0;
        int max = 0;
        int var = 0;
        for (int i = 2; i < 10000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                temp = count;
            }
            if (temp > max) {
                max = temp;
                var = i;
            }

        }
        System.out.println("Number with greatest divisors is " + var + " and no of divisors it have is " + max);
    }
}
