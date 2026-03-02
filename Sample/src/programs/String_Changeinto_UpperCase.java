package programs;

public class String_Changeinto_UpperCase {

	public static void main(String[] args) {

		String name = "raj kumar";
		
		String [] splitname = name.split(" ");
		
		for(String ch : splitname) {
			
			String upper = ch.substring(0, 1).toUpperCase();
			
			System.out.println(upper+ch.substring(1));
			
		}
		
		
	}

}
