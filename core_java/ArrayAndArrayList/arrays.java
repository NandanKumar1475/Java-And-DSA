package swaparrayNumber;
import java.util.*;
public class swaparrayNumber {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			 arr[i]= sc.nextInt();
		}
		System.out.println("Original array : ");
		for(int num : arr) {
			System.out.println(num);
		}
		
		// function to swap the array of particular index ;
		System.out.println("Enter the first index");
		int firstindex = sc.nextInt();
		System.out.println("Enter the second index");
		int secondindex = sc.nextInt();
		
		swap(arr,firstindex,secondindex);
		
		// array after swaping
		System.out.println("After Swaping the Number");
		for(int num : arr) {
			System.out.println(num+ " ");
		}
		
		
	}
	
	static void swap(int arr[],int index1,int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] =  temp; 
		
	}
	
	

}
