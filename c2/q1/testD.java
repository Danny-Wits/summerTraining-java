package c2.q1;

public class testD {
    public static void main(String[] args) {
        int i=0;
        while (rollPair(i)!=2) {
            System.out.println("");
            i++;
        }
        System.out.println("\nIt took "+i+" tries to get a snakes eye");
    }
    /**
     * Dice
     */
    static int rollPair(int x ) {
        System.out.println("Roll no. : "+x);
        return roll() + roll();
    }

    static int roll() {
        int result = (((int)(Math.random() * 6)) + 1);
        System.out.printf("Rolled : %d\t",result);
        return result;
    }
}
