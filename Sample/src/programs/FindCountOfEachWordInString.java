package programs;
import java.util.Map;
import java.util.LinkedHashMap;

public class FindCountOfEachWordInString {

	public static void main(String[] args) {
		
		String word =  "java sql java python";
		String[] ch = word.split(" ");
		Map<String,Integer> emp =new LinkedHashMap<>();
		for(String c:ch) {
			if(emp.containsKey(c)) {
				int count=emp.get(c);
				emp.put(c, count+1);
			}else {
				emp.put(c,1);
			}
		}
		System.out.println("output :"+emp);
		
		
		
		
		

	}

}
