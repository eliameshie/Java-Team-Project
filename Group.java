
public class Group {
	static String getAnthonysName() {
	String message= "Anthony Smith";
	return message;
   	}

	public String kaylaKeplinger() {
		return "Kayla Keplinger";
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


