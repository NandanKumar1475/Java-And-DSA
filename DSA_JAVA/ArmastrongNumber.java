package Dsa_Question;
import java.util.*;
public class ArmastrongNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int n = sc.nextInt();
		boolean ans= isArmastrong(n);
		System.out.println(ans);
	}
	
	static boolean isArmastrong(int n) {
		int original = n ;
		int sum = 0 ;
		if(n<0) {
			return false ;
		}
		while(n>0) {
			int rem = n%10;
			
			sum = sum + rem * rem * rem ;
			n = n/10 ;
			
			
		}
		if(original==sum) {
			return true ;
		}
		return false ;
	}

}
