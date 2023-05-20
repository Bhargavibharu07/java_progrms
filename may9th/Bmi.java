import java.util.Scanner;
public class Bmi
  {
  public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    double weight,height,bmi;
    System.out.println("Enter the weight");
    weight=sc.nextDouble();
    System.out.println("Enter the height");
    height=sc.nextDouble();
    bmi=weight/(height*height);
    if(bmi<18)
    {
      System.out.println("Underweight");
    }
    else if(bmi>=18 && bmi<25)
    {
      System.out.println("Healthy");
    }
    else if(bmi>=25 && bmi<30)
    {
      System.out.println("Overweight");
    }
    else if(bmi>=30)
    {
      System.out.println("Obessity");
    }
      else
    {
      System.out.println("Enter valid values");
    }
  }
}