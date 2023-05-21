import java.util.Scanner;
public class MatrixAddition{
  public static void main(String[]args){
    Array sn=new Array();
    sn.addition();
  }
  }
class Array{
  public void addition(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of rows in A matrix:");
    int m=sc.nextInt();
    System.out.println("Enter the no of columns in A matrix:");
    int n=sc.nextInt();
    int A[][]=new int[m][n];
    System.out.println("Enter the no of rows in B matrix:");
    int p=sc.nextInt();
    System.out.println("Enter the no of clumns in B matrix:");
    int q=sc.nextInt();
    int B[][]=new int[p][q];
    int result[][]=new int[p][q];
    System.out.println("Enter the A matrix elements:");
      for(int i=0;i<m;i++)
      for(int j=0;j<n;j++){
        A[i][j]=sc.nextInt();
      }
    System.out.println("Enter the B matrix elements:");
    for(int i=0;i<p;i++)
      for(int j=0;j<q;j++){
        B[i][j]=sc.nextInt();
      }
    if(m==p && n==q){        //adding of matrix
      for(int i=0;i<p;i++){
        for(int j=0;j<q;j++){
          result[i][j]=A[i][j]+B[i][j];
        }
      }
        
    }
    for(int i=0;i<p;i++){
      for(int j=0;j<q;j++)
        System.out.println("Addition of 2 matrixes are:"+result[i][j]);
      System.out.println();
    }
    
    
  }
}
