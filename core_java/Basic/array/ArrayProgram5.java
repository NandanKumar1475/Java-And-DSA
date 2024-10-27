class ArrayProgram5{
	public static void main(String[] args){
		int[] ch= {12,15,13,16,14,17};
		for(int i = 0 ; i < ch.length ; i++){
			if(ch[i]%2==0 || ch[i]%3==0){
				System.out.println(ch[i]);
			}
			
		}
	}
	
}