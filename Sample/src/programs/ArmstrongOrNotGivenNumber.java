package programs;

public class ArmstrongOrNotGivenNumber {

	public static void main(String[] args) {
		
		int num = 153;
		
		int rev=0, rem=0, n =num;
		
		while(num>0) {
			
			rem = num%10;
			
			rev = rev+(rem*rem*rem);
			
			num = num/10;
			
			
		}
		
		if(n==rev) {
			
			System.out.println("Given number is Anagram :" +rev);
		}else {
			
			System.out.println("Given number is Not Anagram :" +rev);

		}
	
	}

}
