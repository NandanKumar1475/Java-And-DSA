class star11{
	public static void main(String[]args){
		int n = 5;
		char  val = 'a';
		for(int i = 0 ; i<n ; i++){  // outer row is row
			
			for(int j = 0 ; j < n ; j++){ // inner loop is column 
				
				if(i==0 || j==0|| j== n-1 || i ==   n-1){
					System.out.print("*" + " ");
				}else
				{
					System.out.print("-"+ " ");
				}
				

			
		}
		System.out.println();
		
		
	}
}
}