
public class Group {
	static String getAnthonysName() {
	return "Anthony Smith";
   	}

	public String kaylaKeplinger() {
		return "Kayla Keplinger";
	}

	// method obtained from craigpardey.com
	public int divide(int num1, int num2) {
    	if (num2 == 0){
     		throw new IllegalArgumentException("Denonimnator cannot be zero");
    	}
    	int i = 1;
    	while(num2 * i <= num1){
      		i++;
    	}
    		return i - 1;
  	}

	// please add your own names :)
	public String[] getGroupMembers() {
		String names[] = new String[5];
		
		names[0] = kaylaKeplinger();
		names[1]=getAnthonysName();
		return names;
	}
	
	int power(int num1, int num2){
		if(num2==0){
			return 1;
		}
		int result = num1;
		 for(int i=1; i < num2;i++){
			 int tmp=0;
			 for(j=0;i < num1;i++){
				tmp+=result;
			 }
			 result=tmp;
		 }
			 
		
		return result;
	}
	double Multiply (int num1,int num2)
  	{
  		int result=0;
  			for(int i =0; i < num1;i++) {
  			result=result+num2;
  			}
  		return result;
  	}
	public static void main(String[] args) {
		

		// Kayla's addition
		Group g = new Group();
		String names[] = g.getGroupMembers();
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}


