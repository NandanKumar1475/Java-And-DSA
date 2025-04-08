public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 2*n-1;row++) {
            for(int col = 1 ; col <=n-row;col++){
                System.out.print(" ");
            }
            if(row<=n){
                for(int star = 1 ; star<=2*row-1;star++){
                    System.out.print("* ");
                }
               
            }else if (row>n && row<= 2*row-1) {
                for(int star = 1 ; star<=row-1;star++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
