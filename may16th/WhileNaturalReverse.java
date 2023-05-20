//18. WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
public class WhileNaturalReverse{
  public static void main(String[]args){
    Natural sn=new Natural();
    sn.reverse();
  }
}
class Natural{
  public void reverse(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value:");
    int n =sc.nextInt();
    while(n>=1){
      System.out.println(n);
      n--;
    }
  }
}