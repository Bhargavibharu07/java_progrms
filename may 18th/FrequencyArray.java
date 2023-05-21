//program to find the frequency of array elements

import java.util.Scanner;
public class FrequencyArray{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter total number of array elements:");
    int n=sc.nextInt();
    int arry[]=new int[n];
    System.out.println("enter the array elements:");
    for(int i=0;i<n;i++)
      arry[i]=sc.nextInt();
      int count;
      System.out.println("element\t\t count");
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
        System.out.println(arry[i]+"\t\t"+count);
      }
  }
}