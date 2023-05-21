//write a java program to find the trace of a matrix
import java.util.Scanner;
public class TraceOfMatrix{
  public static void main(String[]args){
    Trace t=new Trace();
    t.matrix();
    
  }
}
class Trace{
  public void matrix(){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter no.of rows in martix:");
    int p=sc.nextInt();
    System.out.print("Enter no of columns in matrix:");
    int q=sc.nextInt();
    int arr[][]=new int[p][q];
    if(p==q){
      int sum=0;
      System.out.println("Enter matrix:");
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
          arr[i][j]=sc.nextInt();
        }
      }
      System.out.println("Entered Matrix is:");
      for (int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
          System.out.println(arr[i][j]+"");
        }
        System.out.println("");
        
      }
      for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr.length;j++){
          if(i==j)
            sum=sum+arr[i][j];
          
        }
      System.out.println("trace of matrix A is:"+sum);
    }
    else
      System.out.println("it is not a squre matrix");
  }
}