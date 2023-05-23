//write a java program to read the array elements and then display the following menu.1. find the sum of array elements2. find the maximum and minimum elements3. reverse the array elements 4. find the prime elements of the array. now read the choice from the user and perform appropriate action.
import java.util.Scanner;
public class ArrayMenu{
  public static void main(String[]args){
    Method_Array m=new Method_Array();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements in array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.println("******MENU*******");
    System.out.println("1. find the sum of array elements\n 2. find the maximum and minimum elements\n 3. reverse the array elements\n 4. find the prime elements of the array.");
    int choice;
    System.out.println("Enter your choice");
    choice=sc.nextInt();
    switch (choice){
      case 1:
        int result_sum=m.sum(arr);
        System.out.println("sum of array elements is:"+result_sum);
        break;
      case 2:
        int max=m.maximum(arr);
        int min=m.minimum(arr);
        System.out.println("Maximum elements is"+max+"Minimum elements is"+min);
        break;
      case 3:
        int[]a1=m.reverseArray(arr,n);
        System.out.println("Reversed Array Elements are:");
        for(int j=0;j<arr.length;j++)
          System.out.println(arr[j]+"");
        break;
      case 4:
        for(int i=0;i<arr.length;i++){
          boolean b=m.isPrime(arr[i]);
          
          if(b)
            System.out.println(arr[i]);
        }
        break;
      default:
        System.out.println("Invalid choice");
        
    }

        
 }
    
}
class Method_Array{
  public int sum(int a[]){
    int result_sum=0;
    for(int i=0;i<a.length;i++)
      result_sum=result_sum+a[i];
    return result_sum;
  }
  public int maximum(int a[]){
    int max;
    max=a[0];
    for(int i=1;i<a.length;i++)
      if(max<a[i]){
        max=a[i];
      }
    return max;
  }
  public int minimum(int a[]){
    int min;
    min=a[0];
    for(int i=1;i<a.length;i++)
      if(min>a[i]){
        min=a[i];
      }
    return min;
    
  }
  public int[] reverseArray(int[]arr,int n){
    int i,j,temp;
    for( i=0,j=(n-1);i<j;i++,j--){
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    return arr;
  }
  public boolean isPrime(int num){
    if(num<=1)
      return false;
    else {
      for(int j=2;j<num;j++)
        if(num%j==0)
          return false;
      return true;
    }
  }
}
