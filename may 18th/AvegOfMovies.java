///find average rating and max review for movie1.
import java.util.Scanner;
public class AvegOfMovies{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double sum=0,average;
    int a[][]=new int[3][4];
    System.out.println("Enter the array elements:");
    for(int i=0;i<3;i++)
      for(int j=0;j<4;j++)
        a[i][j]=sc.nextInt();
    System.out.println("Enter elements are:");
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        System.out.print(a[i][j]+"");
        System.out.println();
        
      }
      for( i=0;i<a.length;i++)
        for(int j=0;j<a.length;j++)
          sum=sum+a[i][j];
      average=sum/12;
      System.out.println("Average"+average);
      int max=a[0][1];
      for(i=1;i<a.length;i++){
        if(max<a[i][1])
          max=a[i][1];
      }
      System.out.println("max"+max);
      
      
      
      
    }
    
    
  }
}