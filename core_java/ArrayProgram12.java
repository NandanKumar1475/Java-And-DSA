class ArrayProgram12{
	public static void main(String[] args){
		
		int[] num= {14,17,15,18,16};
		int large = num[0];
		for(int i =  0;i< num.length; i++){
			    
			if(large<num[i])
			{
			large = num[i];
			}

		}
		System.out.print("large array "+large);
	}
	
}