//26. WAP to count number of digits in a number.
import java.util.Scanner;
public class CountDigit{
  public static void main(String[]args){
    Count c=new Count();
    c.digit();
  }
}
class Count{
  public void digit(){
    int n,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
     n=sc.nextInt();
    while(n!=0){
      n=n/10;
      count++;
    }
    System.out.print("number of digits="+count);
      
      
  }
}