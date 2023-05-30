/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/

import java.util.Scanner;

public class MissingNumberInArray {
  public static void main(String[] args) {
    MissingNumber mn = new MissingNumber();
    mn.findMissing();
  }
}

class MissingNumber {
  public void findMissing() {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter range of an array :");
    int n =sc.nextInt();
    int arry[]=new int[n];
    System.out.print("Enter range numbers in an array:");
    for(int i=0;i<n;i++){
      arry[i]=sc.nextInt();
    }
    System.out.println("Entered array is:");
    for(int i=0;i<n;i++){
      System.out.println(arry[i]);
    }
    int sum1=0;
      for(int i=0;i<arry.length;i++){
      sum1=sum1+arry[i];
      }
    int sum2=0;
    for(int i=0;i<n;i++){
      sum2=sum2+i;
    }
    int Missing_number=sum2-sum1;
    System.out.println("Missing number is:"+Missing_number); 

  }
}