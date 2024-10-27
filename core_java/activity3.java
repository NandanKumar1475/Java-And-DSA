class activity3{
	public static void main(String[] args){
		int ticketPrice = 100 ;
		int age = 15 ;
		if(age<=3)
		{
			System.out.println("The ticket price is free No price");
		}else if(age>3 && age<=10)
		{
			System.out.println("The price of ticket is " + ticketPrice/2);
		}
		else if(age>10 && age<60){
			System.out.println("the price of ticket is " + ticketPrice);
		}else
		{
			System.out.println("Senior citizen" + ticketPrice/3);
		}
	}
}