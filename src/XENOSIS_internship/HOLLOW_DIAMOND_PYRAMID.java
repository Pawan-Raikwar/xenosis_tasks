package XENOSIS_internship;

public class HOLLOW_DIAMOND_PYRAMID {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // space

            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        for (int i = 4; i >= 1; i--) {
            //space
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    }
