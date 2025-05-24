class Test{

	public static void main(String[] args) {
		String str = "Nidhi";
		int count = 0;

		char[] ch = str.toCharArray();

		for(int i=0; i<ch.length; i++){
			 for(int j=i+1; j<ch.length; j++){
			 	if(ch[i]==ch[j]){
			 		System.out.pritnln("Duplicate characters in string are: "+ch[j]);
			 	count++;
			 	}

			 }
		
			}
			System.out.pritnln("duplicate characters count: "+count);
		}


}