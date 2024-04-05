
public class Group {
	static String getAnthonysName() {
	String message= "Anthony Smith";
	return message;
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
		
	
	double Multiply (int num1,int num2){
  		int result=0;
  			for(int i =0; i < num1;i++) {
  			result=result+num2;
  			}
  		return result;
  	}
	public static void main(String[] args) {
		System.out.println(getAnthonysName));
	}
}
