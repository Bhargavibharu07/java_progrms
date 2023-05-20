import java.util.Scanner;
public class PosiNegiNumber
{
public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a  number");
  int num=sc.nextInt();
  if(num>0){
    System.out.println("num is positive"+num);
  }
  else if(num<0)
  {
    System.out.println("num is negative"+num);
  }
  else{
    System.out.println("Zero");
  }
}
}