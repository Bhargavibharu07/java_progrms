//32. WAP to enter a number and print its reverse.
import java.util.Scanner;
public class ReverseNumber{
  public static void main(String[] args){
    Reverse sr=new Reverse();
    sr.number();
  }
}

class Reverse{
  public void number(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n= sc.nextInt();
    int reverse=0;
    while(n!=0){
      int remainder=n%10;
      reverse=reverse*10+remainder;
      n=n/10;
    }
    System.out.println("Reverse of given number is:"+reverse);
  }
}