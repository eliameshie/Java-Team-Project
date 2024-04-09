
public class Group {
	public String getAnthonysName() {
		return "Anthony Smith";
   	}

	public String eliAmeshie() {
		return "Eli Ameshie";
	}

	public String kaylaKeplinger() {
		return "Kayla Keplinger";
	}

	public String AssaadAlAssaad() {
		return "Assaad AlAssaad";
	}

	// please add your own names :)
	public String[] getGroupMembers() {

		String names[] = new String[5];

		names[0] = kaylaKeplinger();
		names[1] = getAnthonysName();
		names[2] = eliAmeshie();
		names[3] = AssaadAlAssaad();

		return names;
	}

	// method obtained from craigpardey.com
	static int divide(int num1, int num2) {

    	if (num2 == 0) {
     		throw new IllegalArgumentException("Denonimnator cannot be zero");
    	}

    	int i = 1;

    	while (num2 * i <= num1) {
      		i++;
    	}

		return i - 1;
  	}

	static double power (int num1,int num2) {
		if(num2==0){
			return 1;
		}
		int result = num1;
		 for(int i=0; i < num2;i++){
		int tmp=0;
			 for(j=0;i < num1;i++){
				tmp+=result;
			 }
			 result=tmp;
		 }
		 return result;
	}

	static double Multiply (int num1, int num2) {
  		int result=0;
  			for (int i =0; i < num1; i++) {
  				result = result + num2;
  			}
  		return result;
  	}


	//static int power(int num1, int num2) {

	//	int result = 1;

	//	for (int exponent = num2; num2 != 0; num2--) {
	//		result = result * num1;
	//	}

	//	return result;
	//}


	public static void main(String[] args) {



		// Kayla's addition
		Group g = new Group();
		String names[] = g.getGroupMembers();
		
		for (String name : names) {
			System.out.println(name);
		}


		// Power Function - Eli
		System.out.println("Power: " + power(4, 2));
		System.out.println("Divide: " + Divide(4, 2));
		System.out.println("Divide: " + Multiply(4, 2));


	}
}


