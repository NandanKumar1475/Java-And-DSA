public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 2 * n - 1; row++) {
            if (row <= 5) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*" + " ");
                }
            } else if (row > 5 && row <=  2 * n - 1) {
                
                for (int col = 1; col <= 2*n - row; col++) {
                    System.out.print("*" + " ");
                }

            }
            System.out.println();
        }
    }
}
