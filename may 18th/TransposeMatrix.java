// write a java program to find transpose of the matrix
import java.util.Scanner;
public class TransposeMatrix{
  public static void main(String[]args){
    Transpose t=new Transpose();
    t.matrix();
  }
}
class Transpose{
  public void matrix(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no.of rows in matrix:");
    int m=sc.nextInt();
    System.out.print("Enter no of columns in matrix:");
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int t[][]=new int[n][m];
    System.out.println("Enter array elements:");
    for(int i=0;i<a.length;i++)
      for(int j=0;j<a[i].length;j++)
        a[i][j]=sc.nextInt();
    System.out.println("Matrix is:");
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++)
        System.out.println(a[i][j]+"\t");
      System.out.println();
    }
    for(int i=0;i<a.length;i++)
      for(int j=0;j<a[0].length;j++)
        t[i][j]=a[i][j];
        System.out.println("Transpose matrix is:");
    for(int i=0;i<t.length;i++){
      for(int j=0;j<t[0].length;j++)
        System.out.println(t[i][j]+"\t");
      System.out.println();
    }
    
      
        
    
    
        
    
           
  }
}