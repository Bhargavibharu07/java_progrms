import java.util.Scanner;
public class AssignmentOperator
{ 
    public static void main(String[] args) 
    {
        int num1 = 10, num2 = 20; 
        int res;
        System.out.println("Initial value of num1 = " + num1); 
        System.out.println("Initial value of num2 = " + num2); 
        // Adding & Assigning values 
        num1 += num2;  
        System.out.println("Value of num1 after += is " + num1);
        // Subtracting & Assigning values 
        num1 -= num2; 
        System.out.println("Value of num1 after -= is " + num1);
        // Multiplying & Assigning values 
        num1 *= num2;  
        System.out.println("Value of num1 after *= is " + num1);
        // Dividing & Assigning values 
        num1 /= num2; 
        System.out.println("Value of num1 after /= is " + num1);
        // Moduling & Assigning values 
        num1 %= num2; 
        System.out.println("Value of num1 after %= is " + num1); 
    } 
} 