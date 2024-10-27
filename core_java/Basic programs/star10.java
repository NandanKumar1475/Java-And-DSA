class star10{
	public static void main(String[]args){
		int n = 5;
		char  val = 'a';
		for(int i = 0 ; i<n ; i++){  // outer row is row
			
			for(int j = 0 ; j < n ; j++){ // inner loop is column 
				
				if(j%2==0){
					System.out.print(1 + " ");
				}else
				{
					System.out.print(0 + " ");
				}
				

			
		}
		System.out.println();
		
		
	}
}
}