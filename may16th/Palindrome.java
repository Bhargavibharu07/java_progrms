//29. WAP to check whether a number is palindrome or not.
import java.util.Scanner;
public class Palindrome{
  public static void main(String[] args){
    Number sn= new Number();
    sn.palindrome();
  }
}
class Number{
  public void palindrome(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    int sum=0,temp=n,r;
    while(n>0){
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
    if(temp==sum)
      System.out.println("palindrome number");
    else
      System.out.println(" not palindrome number");
      
  
  }
}