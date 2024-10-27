class StringMethodsSplit{
	public static void main(String[] args){
		String str =  "Jspyder software development Training Center" ;
		String [] arr =  str.split(" ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println("With split  method at index  = " + i +"  " + arr[i]);
		}
		
		
	}
}