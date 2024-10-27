class ArrayProgram10{
	public static void main(String[] args){
		int[] num= {12,15,13,16,18,17};
		int sum =0;
		int avg = 0 ;
		for(int i =num.length-1  ; i>=0; i--){
			    
			sum = sum + num[i];
				//avg = sum/num.length;
			avg = sum/ 2;

		}
		System.out.print("sum = "+sum);
		System.out.print("average = "+avg);
	}
	
}