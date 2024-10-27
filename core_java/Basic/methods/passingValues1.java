class passingValues1{
	// 
	 static void play(char ch){
			System.out.println("values of " +ch);
		}
		// passing the boolea value in to formal  argument
	 static void send(boolean b){
		 System.out.println("argsumnent " + b);
	 }
	public static void main(String[] args){
		
		System.out.println("program started");
		play('j');
		send(true);
		play('k');
		send(false);
		System.out.println("program ended");
		
	}
}