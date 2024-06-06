package Q2;

public class test {
    public static void main(String[] args) {
        int d1 = (int) (Math.random() * 6) + 1;
        int d2 = (int) (Math.random() * 6) + 1;
        System.out.printf("First dice roll = %d\n", d1);
        System.out.printf("Second dice roll = %d\n", d2);
        System.out.printf("Total dice roll = %d", d1 + d2);
    }

}