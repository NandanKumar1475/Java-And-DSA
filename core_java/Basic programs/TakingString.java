import java.util.Scanner;

class TakingString {
	static String GetFullName(){
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		return fname ;
	}
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.next();
		System.out.println("String = " +str);
		// printing the fullname with using nextLine methods 
		System.out.println("fullname = " + GetFullName());
		

	}
       
    
}
