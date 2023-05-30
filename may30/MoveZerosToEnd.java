/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/
import java.util.Scanner;
public class MoveZerosToEnd{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    MoveZero mz=new MoveZero();
    int n;
    System.out.print("Enter size of an array :");
    n=sc.nextInt();
    int arry[]=new int[n];
    System.out.print("Enter array Elements:");
    for(int i=0;i<n;i++)
      arry[i]=sc.nextInt();
    mz.orderOfNonZero(arry);  
  }
}
class MoveZero{
  public void orderOfNonZero(int arr[]){
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0)
        continue;
      else{
        for(int j=i+1;j<arr.length;j++){
          if(arr[j]!=0){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            break;
          }    
        }
      }
    }
    for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
    
    
  }
}