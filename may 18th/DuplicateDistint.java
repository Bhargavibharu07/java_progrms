// programme to find dublicate and distint elements in an array
import java.util.Scanner;
public class DuplicateDistint{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter total number of elements in array:");
    int n=sc.nextInt();
    int arry[]=new int[n];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++)
      arry[i]=sc.nextInt();
    int count;
    boolean visited[]=new boolean[n];
    for(int i=0;i<n;i++){
      if(visited[i]==true)
        continue;
      count=1;
      for(int j=i+1;j<n;j++){
        if(arry[i]==arry[j]){
          count=count+1;
          visited[j]=true;
        }
      }
      if(count>1){
        System.out.println("Duplicate elements are:"+arry[i]);
      }
      if(count==1)
        System.out.println("Distint elements are:"+arry[i]);
    }
    
    
  }
}