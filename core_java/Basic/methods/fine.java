class fine{
	static boolean checkSpeed(int speed){
		if(speed>60){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		System.out.println("Inited fine " + checkSpeed(50));
		System.out.println("Inited fine " + checkSpeed(150));
	}
}