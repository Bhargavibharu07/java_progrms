//Finding the number of positive and negative elements in a array
import java.util.Scanner;
public class PositiveNegativeArray{
  public static void main(String[] args){
    Both b=new Both();
    b.array();
  }
}
class Both{
  public void array(){
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of elements");
    int n=sc.nextInt();
    double arr[]=new double[n];
    int negi_count=0,posi_count=0;
    System.out.println("Enter elements of array:");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextDouble();
    }
    for(int i=0;i<n;i++){
      if(arr[i]<0)
         negi_count++;
        else
        posi_count++;
        
    }
      
      System.out.println("Number of Positive elements are:"+posi_count);
      System.out.println("Number of Negative elements are:"+negi_count);
  }
    
}
