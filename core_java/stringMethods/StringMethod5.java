class StringMethod5{
	public static void main(String[] args){
		String str = "Developer" ;
		int a = str.lastIndexOf('e');
		//System.out.println(a);
		
		while(a!=-1){
			System.out.println(a);
			a = str.lastIndexOf('e',a-1);
		}
		
	}
}