
public class Group {
	static String getAnthonysName() {
	String message= "Anthony Smith";
	return message;
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
		
		return names;
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
		System.out.println(getAnthonysName);

		// Kayla's addition
		Group g = new Group();
		String names[] = g.getGroupMembers();
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}


