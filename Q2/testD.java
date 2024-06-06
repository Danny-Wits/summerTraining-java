package Q2;

public class testD {
    public static void main(String[] args) {
        int x1 = (int) (Math.random() * 6.0) + 1;
        int x2 = (int) (Math.random() * 6.0) + 1;
        System.out.printf("First Roll : %d\n", x1);
        System.out.printf("Second Roll : %d\n", x2);
        System.out.printf("Total Roll : %d\n", x1 + x2);
    }
}
