package programs;

import java.util.Arrays;

public class Sort_the_characters {

	public static void main(String[] args) {

	String ch = "goodday";
	char a[] = ch.toCharArray();
	
	for(int i =0; i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				
				char temp = a[i];
				a[i]=a[j];
				
				a[j] = temp;
			}
			
		}
		
		
	}
	
	System.out.println("Sort the character : "+ new String(a));
	
	}

}
