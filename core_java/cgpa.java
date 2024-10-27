class cgpa{
	public static void main(String[] args){
		double cgp = 7.5 ;
		if(cgp >= 8.5){
			System.out.println("Distiction");
		}else if(cgp>=7.5 && cgp <8.5){
			System.out.println("first class");
		}else if(cgp >=6.5 && cgp <7.5){
			System.out.println("Second class");
		}else if(cgp>=5.5 && cgp<6.5){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	}
}