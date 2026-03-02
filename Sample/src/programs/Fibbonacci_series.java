package programs;

public class Fibbonacci_series {

	public static void main(String[] args) {
		
		int number =10; // how many numbers you want
		
		int a=0,b=1;
		
        System.out.println("Fibonacci Series:");

		
		System.out.println(a);
		System.out.println(b);

		
		for(int i=2;i<number;i++) {
			
			int c = a+b;
			
			System.out.println(c);
			
			a=b;
			b=c;
			
			
		}
		
		
		

		
	}

}
