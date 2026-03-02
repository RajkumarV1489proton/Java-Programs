package programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance_AAABBC_3A2B1C {

	public static void main(String[] args) {
		
		String name = "AAABBC";
		
		LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
		
		char S1 [] = name.toCharArray();
		
		for(Character ch : S1) {
			
			System.out.println("" ); //////////////
			
			if(mp.containsKey(ch)) {
				
				Integer i = mp.get(ch);

				
				mp.put(ch, i+1);
			} else {
				
				mp.put(ch, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
		
		
		System.out.print(entry.getKey()+""+entry.getValue());
		
		}
	}

}
