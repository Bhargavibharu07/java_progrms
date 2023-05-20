import java.util.Scanner;
class ArthimaticOperator
  {
    public static void main(String[] args)
    {
      Scanner test = new Scanner(System.in);
      int a,b;
      System.out.println("enter the integer values");
      a=test.nextInt();
      b=test.nextInt();
      System.out.println("a+b="+(a+b));
      System.out.println("a-b="+(a-b));
      System.out.println("a%b="+(a%b));
      System.out.println("a/b="+(a/b));
      
    }
  }