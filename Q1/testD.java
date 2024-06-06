package Q1;
//Write a program that will print your initials to standard output in letters that are nine

// lines tall. Each big letter should be made up of a bunch of *’s.

public class testD {
    private static int[][] Dmap = {
            { 1, 1, 1, 1, 1, 1 },
            { 1, 1, 0, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 0, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 0, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 0, 1, 1 },
            { 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1 },
    };

    public static void main(String[] args) {
        print(Dmap);
    }

    static void print(int[][] map) {
        for (int[] x : map) {
            for (int i : x) {
                if (i == 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
