//using Methods
import java.util.Scanner;
public class CalBMI{
public static void main(String[] args){
  BMIClass bc = new BMIClass();
  bc.bmi();
}
}
 class BMIClass{
  public void bmi() {
    Scanner sc = new Scanner(System.in);
    double height,weight,bmi;
    System.out.println("enter your height in metres");
    height = sc.nextDouble();
    System.out.println("enter your weight in kilograms");
    weight = sc.nextDouble();
    bmi = (weight/(height*height));
    if (bmi<18)
      System.out.println("you are underweight");
    else if ( bmi<25)
      System.out.println("you are healthy");
    else if (bmi<30)
      System.out.println("you are overweight");
    else
      System.out.println("you are obessity");
  }
}
