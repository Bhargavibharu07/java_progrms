//21. WAP to print all odd number between 1 to 100.
import java.util.Scanner;
public class OddNumber{
  public static void main(String[]args){
    Odd so=new Odd();
    so.num();
  }
}
class Odd{
  public void num(){
    int n=100,i;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the limt:");
    n=sc.nextInt();
    i=1;
    System.out.println("List of odd numbers:");
    while(i<=100){
      System.out.println(i);
      i=i+2;
    }
  }
}