class print1and{
	public static void main(String[] args)
	{
		char val = 'a'; ;
		int n =  5 ;
		for(int i = 0 ; i < n ; i++ )
		{
		   if(i%2==0){
			   System.out.print(val + " ");
			   val++;
		   }else
		   {
			   System.out.print("*"+ " ");
		   }
		}
	}
}