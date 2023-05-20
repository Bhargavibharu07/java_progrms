//20. WAP to print all even numbers between 1 to 100. - using while loop
import java.util.Scanner;
public class WhileEven{
  public static void main(String[]args){
    Even se=new Even();
    se.even();
  }
}
class Even{
  public void even(){
    int n=100,i;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the limit:");
    n=sc.nextInt();
    i=2;
    System.out.println("List of even numbers:");
    while(i<=100){
      System.out.println(i);
      i=i+2;
    }
    
  }
}
  