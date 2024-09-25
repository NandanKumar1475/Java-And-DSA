class ifStatement{
	public static void main(String[] args)
	{
		System.out.println("==============control statement===========");
		
		// if statement
		System.out.println("=======version 1 if statement========");
		if(true){
			System.out.println("====condition is true the this is printing =======");
		}
		if(false){
			System.out.println("not print");  // this code does not executed 
		}
		
		
		System.out.println("=========example 2===========");
		
		int a = 7 ;
		if(a<9)
		{
			System.out.println("Developer");
		}	
		System.out.println("=========example 3===========");
		
		int b = 7 ;
		
		if(b>5 && b<15){
			System.out.println("Chicken Biryani with chicken Gills");
			
		}
		System.out.println("=========example 4===========");

		int c = 13 ;
		
		if(c%2==0 && b%2==15){
			System.out.println("Chicken Biryani with chicken Gills");
			
		}
		int k = 10 ;
		if(k%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd Number");
		}
			
		
	}

}