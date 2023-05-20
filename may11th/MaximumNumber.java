import java.util.Scanner;
public class MaximumNumber
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int a,b;
      System.out.println("Enter the value of a");
      a= sc.nextInt();
      System.out.println("Enter the value of b");
      b= sc.nextInt();
      if(a>b)
      {
        System.out.println("Maximum Number is " +a);  
      }
      else
      {
        System.out.println("Maximum Number is " +b); 
        
      }
        
      
    }
  }