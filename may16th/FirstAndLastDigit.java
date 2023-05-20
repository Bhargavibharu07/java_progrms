//27. WAP to find first and last digit of a number.
import java.util.Scanner;
public class FirstAndLastDigit{
  public static void main(String[]args){
    Firstlast fl = new Firstlast();
    fl.digit();
    
  }
}
class Firstlast{
  public void digit(){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter Any Number:");
    int n=sc.nextInt();
    int First_digit=0,Last_digit=0;
    Last_digit=n%10;
    System.out.println("Last Digit  :"+Last_digit);
    while(n!=0){
      First_digit=n%10;
      n=n/10;
    }
    System.out.println("First Digit "+First_digit);

    
  }
}