//17. WAP to print all natural numbers from 1 to n. - using while loop

import java.util.Scanner;
public class WhileNatural{
  public static void main(String[]args){
    Natural sn=new Natural();
    sn.number();
  }
}
class Natural{
  public void number(){
    int i=1,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    n=sc.nextInt();
    while(i<=n){
      System.out.println(i);
      i++;
    }
    
  }
}