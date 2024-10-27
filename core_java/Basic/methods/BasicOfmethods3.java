class BasicOfmethods3{
	// methods or function
	static void play(){
		 System.out.println("executing play().......");
	 }
	 static void send(){
		 System.out.println("executing send().......");
	 }	
	 static void push(){
		 System.out.println("executing push().......");
	 }
	 // we can create a multiple methods inside a class
	public static void main(String[] args)
	{
		System.out.println("program started");
		play();
		send();
		push();    //order does not matter fpr calling the function
		send();
		push();
		play();
		System.out.println("program end");
	}
	
}