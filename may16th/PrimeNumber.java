//40.WAP to print all Prime numbers between 1 to n.
import java.util.Scanner;
public class PrimeNumber{
  public static void main(String[]args){
    Number sn = new Number();
    sn.prime();
  }
}
class Number{
  public void prime(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    System.out.println("prime number between 1 to "+n+ "are:");
    for(int i=2;i<=n;i++){
       int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0)
        {
          count++;
          
        }
      }
      if(count==2)
        System.out.println(i+"");
    }
    
  }
}