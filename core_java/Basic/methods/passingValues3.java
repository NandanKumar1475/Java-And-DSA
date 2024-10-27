class passingValues3{
	static int test(){
		return 10;
	}
	
	// returning double value 
	static double play(){
		return 7.87;
	}
	
	public static void main(String[] args){
		// first method
		int val = test();
		System.out.println("values" +val);
		
		// second method
		System.out.println("returning values" + test());
		
		double d = play();
		System.out.println("Returning Double values= " +d);
		
		// second method
		System.out.println("returning double values= " + play());
		
	}
}