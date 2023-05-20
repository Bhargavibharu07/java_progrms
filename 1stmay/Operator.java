import java.util.Scanner;
public class Operator{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int age,income;
    System.out.println("enter the age and income");
    age = sc.nextInt();
    income = sc.nextInt();
    if(age>=20&&income>=5000){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}