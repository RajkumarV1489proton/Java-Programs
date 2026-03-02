package programs;

public class ReverseOfEachWord {

	public static void main(String[] args) {
		
		 String str = "Welcome to java class";
	        String[] words = str.split(" ");
	        
	        for(String word: words) {
	        	
	        		for(int i=word.length()-1;i>=0;i--) {
	        			
	        			char ch = word.charAt(i);
	        			
	        			System.out.print(ch);

	        		}
	        		
	        		System.out.print(" ");

	        }
		

	}

}


// output : emocleW ot avaj ssalc 