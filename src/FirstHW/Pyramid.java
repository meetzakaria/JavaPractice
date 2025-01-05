package FirstHW;

public class Pyramid {

    public static void main(String[] args) {
        int row = 5, col = 0;

        for (int i = 1; i <= row; ++i, col = 0) {
            for (int space = 1; space <= row - i; ++space) {
                System.out.print("  ");
            }

            while (col != 2 * i - 1) {
                System.out.print("* ");
                ++col;
            }

            System.out.println();
        }
    }
}