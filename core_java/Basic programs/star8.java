class star8{
	public static void main(String[]args){
		int n = 5;
		int val = 5;
		for(int i = 0 ; i<n ; i++){  // outer row is row
			
			for(int j = 0 ; j < n ; j++){ // inner loop is column 
				
				System.out.print(val +" ");
				val--;

			
		}
		System.out.println();
		val= 5;
		
	}
}
}