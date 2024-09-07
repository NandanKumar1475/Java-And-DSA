package arrays2D;
import java.util.*;
public class arrays2D {
	public static void main(String[]args) {
		
		// declaring 2d arryas
		int twoDarray [][] = new int[3][] ;
		int twoDarray1[][] = {
				{1,2,4},
				{3,4,5},
				{7,8,9}
				
		};
		System.out.println(Arrays.toString(twoDarray)); 
		System.out.println(Arrays.toString(twoDarray1));
		
		Scanner sc = new Scanner(System.in);
		int row,col;
		row = sc.nextInt();
		col = sc.nextInt();
		int arr3[][] = new int[row][col];
		
		// taking the input 
		for(int i = 0 ; i<row;i++)
		{
			for(int j = 0 ; j < col ; j++)
			{
				arr3[i][j] = sc.nextInt();
			}
		}
		
		// printing the output
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j <col ;j++) {
				System.out.println(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
