//write a java program to find the largest, second largest and third largest element of the one dimensional array
import java.util.Scanner;
public class Largest_Element{
  public static void main(String[]args){
    Array a=new Array();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of an array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements:");
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    System.out.println("array is:");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
    System.out.println();
    a.sortArray(arr);
    
  }
}
class Array{
  public void sortArray(int[]arr){
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          int temp=arr[j];
          arr[j]=arr[i];
          arr[j]=temp;
          
        }
      }
    }
    System.out.println("First largest element is:"+arr[0]);
    System.out.println("Second largest element is:"+arr[1]);
    System.out.println("Third largest element is:"+arr[2]);
  }
}
  