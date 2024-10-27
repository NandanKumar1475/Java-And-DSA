class CalSimpleIntrest{
	public static void main(String[]args){
	    double principal= 100000.0;
		int year =  2 ;
		double rate = 12.5;
		double simpleIntrest =  (principal * rate * year) /100;
		double revenue = principal + simpleIntrest ;
		double emi = revenue/24;
		System.out.println("The simpleIntrest  = " + simpleIntrest);
		System.out.println("The emi  = " + emi);
		
	}


}