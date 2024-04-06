
public class Group {
	static String getAnthonysName() {
	String message = "Anthony Smith";
	return message;
   	}

	public String eliAmeshie() {
		return "Eli Ameshie";
	}

	public String kaylaKeplinger() {
		return "Kayla Keplinger";
	}

	// please add your own names :)
	public String[] getGroupMembers() {
		String names[] = new String[5];
		
		names[0] = kaylaKeplinger();
		names[2] = eliAmeshie();
		
		return names;
	}
	
	double Multiply (int num1, int num2)
  	{
  		int result=0;
  			for(int i =0; i < num1;i++) {
  			result=result+num2;
  			}
  		return result;
  	}

	static int power(int num1, int num2) {

		int result = 1;

		for (int exponent = num2; num2 != 0; num2--) {
			result = result * num1;
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

		// Power Function - Eli
		System.out.println("Power " + power(2, 4));


	}
}


