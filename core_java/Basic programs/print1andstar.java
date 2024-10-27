class print1andstar {
	public static void main(String[] args)
	{
		int val =1 ;
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