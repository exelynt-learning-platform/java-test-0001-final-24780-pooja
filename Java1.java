public class Pattern {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for(int i = 1; i <= n; i++) {

            // spaces before first star
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // spaces between stars
            if(i > 1) {
                for(int j = 1; j <= 2*i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for(int i = n-1; i >= 1; i--) {

            // spaces before first star
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // spaces between stars
            if(i > 1) {
                for(int j = 1; j <= 2*i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}