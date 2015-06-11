import java.util.Scanner;

public class Driver {
	public static void main(String [] args){
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter n values to calculate of f(n): ");
		long size = keys.nextLong();
		long startTime = System.currentTimeMillis();
		
		long a = 1, b = 2, c = 7;
		long current = 0;
		long i=0;
		
		for (i=4; i<=size ;i++){
			current = a*b-c;
			a=b; b=c; c=current;
			//System.out.println("f(" + i + ") = " + current);
			//38500 calculations a second, 10^6 = 26 seconds while printing each
		}
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println("f(" + (i-1) + ") = " + current);
		System.out.println("Run Time: " + estimatedTime/1000 + " seconds");
	}
}
