class method3{
	static void test(){
		System.out.println("test() start");	
		System.out.println("test() end");
	}
	static void disp(){
		System.out.println("disp() start");	
		test();
		System.out.println("disp() end");
	}
	
	public static void main(String[] args){
		System.out.println("main start");
         disp();		
		System.out.println("main end");
	}
}