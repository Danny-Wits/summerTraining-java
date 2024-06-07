package c2.q1;

public class testU {
    public static void main(String[] args) {
        int count = 0;
        int d1, d2;
        do {

            d1 = (int) (Math.random() * 6) + 1;
            d2 = (int) (Math.random() * 6) + 1;
            count++;
            if (d1 == 1 && d2 == 1) {
                System.out.println("No of turns to get the snake eye = " + count);
                break;
            }

        } while (true);

    }

}
