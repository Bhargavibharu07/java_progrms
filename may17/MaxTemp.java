//write a java program to find the max temperature in a week
import java.util.Scanner;
public class MaxTemp{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double Temp[]=new double[7];
    System.out.println("Enter the Temperature");
    for(int i=0;i<7;i++){
      Temp[i]=sc.nextInt();
    }
    double max=Temp[0];
    for(int i=0;i<7;i++){
      if(max<Temp[i])
        max=Temp[i];
    }
    System.out.println("Maximum temperature is:"+max);
  }
}