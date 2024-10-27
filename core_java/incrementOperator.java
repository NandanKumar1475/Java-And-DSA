class incrementOperator{
	public static void main(String[] args){
		int a = 4;
		System.out.println(a++);
		System.out.println(a);
		
		// decrement
		int b= 7;
		System.out.println(b--);
		System.out.println(b);
		
		int x = 13 ;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x);
		
		int y = 18 ;
		System.out.println(y--);
		System.out.println(y--);
		System.out.println(y);
		
		System.out.println("addition on incrementOperator");
		int r = 5 ;
		int k = r++ + r++ ;
		System.out.println(k);
		
		System.on.println("addition on decrement operatot");
		int t = 9;
		int g = t-- + t-- ;
		System.out.println(g);
		
	}
}