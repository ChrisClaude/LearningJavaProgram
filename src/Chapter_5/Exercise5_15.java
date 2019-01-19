package ChapterFive;

/**
 * Printing patterns
 *
 * @author Claude C DE-TCHAMBILA
 */
public class Exercise5_15 {

    public static void main(String[] args) {
        // fig.1
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // fig.2
        for (int i = 0; i < 10; i++) {
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
            }

            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // fig.3
        for (int k = 0; k < 10; k++) {
            for (int l = 10; l > k; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // fig.4
        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                for (int j = 10 - 1; j > i; j--) {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
