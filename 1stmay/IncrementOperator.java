import java.util.Scanner;
class IncrementOperator {
	public static void main (String[] args) {
		//1. Post-Increment Operator
	int a = 5;
	int b = 7;
	
	int c = a++ + b; 
	
	System.out.println("Post- Increment \n c = "+ c);
	
	//2. Pre-Increment Operator
	
	int A = 5;
	int B = 7;
	int C = ++A + B; 
	
	System.out.println("Pre- Increment \n C = "+ C);
	
	}
}
