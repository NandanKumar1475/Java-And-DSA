class atm{
	public static void main(String[] args){
		int accbal = 15000;
		int amt = 1000;
		if(amt<accbal){
			if(amt%100 == 0)
			{
				System.out.println("Witrwal succes");
			}else{
				System.out.println("invalid input");
			}
		}else{
			System.out.println("insuusicent balance");
		}
	}
}