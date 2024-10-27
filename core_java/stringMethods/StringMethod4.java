class StringMethod4{
	public static void main(String[] args){
		String str = "Developer" ;
		int a = str.indexOf('e');
		//System.out.println(a);
		
		while(a!=-1){
			System.out.println(a);
			a = str.indexOf('e' , a+1);
		}
		
	}
}