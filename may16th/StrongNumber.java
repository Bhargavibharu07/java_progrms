//48. WAP to print all Strong numbers between 1 to n.
import java.util.Scanner;
public class StrongNumber{
  public static void main(String[]args){
    Strong ss=new Strong();
    ss.number();
    
  }
    
  }
class Strong{
  public void number(){
    int n,temp,remainder,sum=0,i,factorial;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number:");
    n=sc.nextInt();
    temp=n;
    while(temp>0){
      factorial=1;
      i=1;
      remainder=temp%10;
      while(i<=remainder)
        {
          factorial=factorial*i;
          i++;
        }
      System.out.println("the factorial of"+remainder+ "="+factorial);
      sum=sum+factorial;
      temp=temp/10;
    }
    System.out.println("the sum of factorial of a given number"+n+"="+sum);
    if(n==sum){
      System.out.println(n+"is a strong number");
    }
    else{
      System.out.println(n+"is not strong number");
    }
      
  }
}
