class ArrayProgram3{
	public static void main(String[] args){
		double[] dArr = {6.4,4,5,8.3,5.7,7.4,9.6};
		// modifiying the value
		dArr[1]=7.89;
		dArr[4]=9.9 ;
		dArr[3]=5.6;
		


		for(int i = 0 ; i < dArr.length ; i++){
			System.out.println(dArr[i]);
		}
	}
	
}