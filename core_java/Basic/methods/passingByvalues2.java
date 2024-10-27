class passingByvalues2{
	static void sum(int a ,int b){
		int sum = a + b;
		System.out.println("sum = " +sum);
	}
	
	static void sub(int a ,int b){
		int sub = a - b;
		System.out.println("sub = " +sub);
	}
	
	public static void main(String[] args)
	{
		sum(10,20);
		sub(20,10);
	}
}