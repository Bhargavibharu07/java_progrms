import java.util.Scanner;
class FindRetireAge{
  public void retAge() {
    Scanner sc=new Scanner(System.in);
    int age;
    System.out.println("enter age");
    age = sc.nextInt();
    if(age<65)
      System.out.println("You will be retire after "+(65-age)+" years");
    else
      System.out.println("You are already retired ");
  }
}
public class RetireAge{
public static void main(String[] args){
  FindRetireAge fre = new FindRetireAge();
  fre.retAge();
}
}