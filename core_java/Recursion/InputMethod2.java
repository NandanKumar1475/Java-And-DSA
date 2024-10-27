import java.util.Scanner ;
class InputMethod2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Number");
		int val = sc.nextInt();
		
		if(val%2==0){
			System.out.println("even Number");

		}else{
			System.out.println("odd Number");
		}
	}
}
