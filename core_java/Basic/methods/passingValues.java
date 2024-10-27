class passingValues{
	// 
	 static void test(int a){
			System.out.println("values of " +a);
		}
		// passing the double value in to formal  double
	 static void play(double b){
		 System.out.println("values " + b);
	 }
	public static void main(String[] args){
		
		System.out.println("program started");
		test(50);
		play(2.75);
		play(3.76);
		play(4.76);
		System.out.println("program ended");
		
	}
}