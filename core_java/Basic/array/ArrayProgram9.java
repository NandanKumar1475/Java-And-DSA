class ArrayProgram9{
	public static void main(String[] args){
		int[] num= {12,15,13,16,14,17};
		int sum =0;
		for(int i = 0;i<num.length;i++){
			
				if(num[i]%2!=0){
					sum = sum+ num[i];
				}

		}
		System.out.print("Sum = "+sum);
	}
	
}