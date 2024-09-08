package Dsa_Question;
import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		
		for(int i = 0 ; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original Array");
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("Reversed Array");
		reverseAray(arr);
		
		for(int num1 : arr) {
			System.out.println(num1);
		}
	}
	static void reverseAray(int arr[]) {
		int start = 0 ;
		int end = arr.length - 1;
		while(start  <end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp ;
			start++;
			end--;
		}
	}

	

}
