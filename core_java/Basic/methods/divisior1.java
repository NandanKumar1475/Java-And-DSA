class divisior1{
	
	public static void main(String[] args){
		int n = 12 ;
	    int a = 1;
		int sum = 0;
	
		while(a<=n/2){
			if(n%2==0){
				sum = sum + a;	
			}
			
			a++;
		}
		if(sum==n){
			System.out.println("perfect Number");
	}
	
}