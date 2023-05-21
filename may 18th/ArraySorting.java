//write a java program to sort the elements of one dimensional array in ascending order
import java.util.Scanner;
public class ArraySorting{
  public static void main(String[]args){
    Array a=new Array();
    a.ascending();
  }
}
class Array{
  public void ascending(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of elements in array:");
    int n=sc.nextInt();
    int arr[]=new int[5];
    System.out.println("Enter Array elements:");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
  for(int j=i+1;j<arr.length;j++){
    if(arr[i]>arr[j]){
      int temp=0;
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    
  }
    }
System.out.println();
System.out.println("Elements of array sorted in ascending order:");
for(int i=0;i<arr.length;i++)
  System.out.println(arr[i]+"");
    


    
  }
}
