 //write a java program to find the maximum and minimum element of two dimensional array along with index values
import java.util.Scanner;
public class MaxMin_Array{
  public static void main(String[]args){
    Maximum_Minimuum mm=new  Maximum_Minimuum();
    mm.array();
  }
}
class  Maximum_Minimuum{
  public void array(){
    Scanner sc=new Scanner(System.in);
    int a,b;
    int max_a=0,min_a=0,max_b=0,min_b=0;
    System.out.println("Enter no of rows:");
    a=sc.nextInt();
    System.out.println("Enter no of columns:");
    b=sc.nextInt();
    int arr[][]=new int[a][b];
    System.out.println("Enter array elements:");
    for(int i=0;i<arr.length;i++)
      for(int j=0;j<arr.length;j++)
        arr[i][j]=sc.nextInt();
    int max=arr[0][0];
    int min=arr[0][0];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(max<arr[i][j]){
          max=arr[i][j];
          max_a=i;
          max_b=j;
        }
        if(min>arr[i][j]){
          min=arr[i][j];
          min_a=i;
          max_b=j;
        }
      }
    }
    System.out.println("Maximum array elements is"+max+"At row index" +max_a+ "and column index" +max_b);
    System.out.println("Minimum array elements is"+min+"At row index" +min_a+ "and column index" +min_b);
    
  
    
  }
}