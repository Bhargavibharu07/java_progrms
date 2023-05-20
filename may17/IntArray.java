//program to declare and initialize the array elements and printing the array elements
import java.util.Scanner;
public class IntArray{
  public static void main(String[]args){
    Array a=new Array();
    a.num();
  }
}
class Array{
  public void num(){
    Scanner sc =new Scanner(System.in);
      int marks[]=new int[5];
    System.out.println("Enter elements of array:");
    for(int i=0;i<marks.length;i++){
      marks[i]=sc.nextInt();
    }
    System.out.println(" elements we entered are:");
    for(int j=0;j<marks.length;j++){
      System.out.println(marks[j]);
    }
  }
}
  