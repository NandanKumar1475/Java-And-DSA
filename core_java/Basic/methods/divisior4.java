class divisior4{
	
	public static void main(String[] args){
		int n = 11 ;
	    int a = 1;
		int count= 0;
		while(a<=n/2){
			if(n%a==0){
				count++;
			}
			
			a++;
		}
		if(count==1){
			System.out.println("prime number");
		}
	}
	
}