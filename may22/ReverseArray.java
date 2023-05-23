//WAP to reverse array using method
import java.util.Scanner;
public class ReverseArray{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n array");
    int n=sc.nextInt();
    int arr[]=new int[6];
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    Reverse_Array ra =new Reverse_Array();
    ra.method(arr);
    System.out.println("reverse array is");
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);
  }
}
class Reverse_Array{
  public int[] method(int a[]){
    int temp=0;
    for(int i=0,j=a.length-1;i<j;i++,j--){
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
    return a;
  }
}