//write a java program to find multiplication of two matrices
import java.util.Scanner;
public class MultipicationOfMatrix{
  public static void main(String[]args){
    Array sn=new Array();
    sn.multiplication();
  }
  }
class Array{
  public void multiplication(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no.of rows in a matrix:");
    int m=sc.nextInt();
    System.out.print("Enter the no of columns in a matrix:");
    int n=sc.nextInt();
    System.out.print("Enter the no of rows in b matrix:");
    int p=sc.nextInt();
    System.out.print("Enter the no of columns in b matrix:");
    int q=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[p][q];
    if(n==p){
      int c[][]=new int[m][q];
      System.out.println("Enter a array elements:");
      for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
          a[i][j]=sc.nextInt();
      System.out.println("Enter b array elements:");
      for(int i=0;i<p;i++)
        for(int j=0;j<q;j++)
          b[i][j]=sc.nextInt();
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          c[i][j]=0;
          for(int k=0;k<n;k++)
            c[i][j]+=(a[i][k]*b[k][j]);
        }
      }
      System.out.println("multiplication matrix is:");
      for(int i=0;i<m;i++){
        for(int j=0;j<q;j++)
          System.out.println(c[i][j]+"\t");
        System.out.println();
      }
    }
    else
      System.out.println("invalid matrix");
      
    
    
    
    
  }
}