// write a java program to find whether matrix is symmetric or not
import java.util.Scanner;
public class SymentricOrNot{
  public static void main(String[]args){
    Matrix m=new Matrix();
    m.array();
  }
}
class Matrix{
  public void array(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of rows:");
    int m=sc.nextInt();
    System.out.print("Enter no of columns:");
    int n=sc.nextInt();
    if(m==n){
      int a[][]=new int[m][n];
      int t[][]=new int[m][n];
      int count=0;
      System.out.println("enter array elements");
      for(int i=0;i<a.length;i++)
        for(int j=0;j<a[i].length;j++)
          a[i][j]=sc.nextInt();
      System.out.println("matrix a is ");
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++)
          System.out.print(a[i][j]+"\t");
        System.out.println();
        
      }
      for (int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++)
          t[j][i]=a[i][j];
      System.out.println("transpose matrix is");
      for(int i=0;i<t.length;i++){
        for(int j=0;j<t[0].length;j++)
          System.out.print(t[i][j]+"\t");
        System.out.println();
        
      }
      for (int i=0;i<t.length;i++){
        for(int j=0;j<t[0].length;j++){
          if(a[i][j]==t[i][j])
            count++;
        }
      }
      if(count==(m*n))
        System.out.println("matrix a is symmetrix");
      else
        System.out.println("matrix a is not symmetrix");           
}
    else
      System.out.println("it is not a symmetrix matrix");
    }
  }
  
    

  
