/*Given an integer n, return the number of prime numbers that are strictly less than n.
 
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.*/

import java.util.Scanner;
public class PrimeNumbersArray{
  public static void main(String[]args){
    Prime p = new Prime();
    p.findCount();
  }
} 
class Prime{
  public void findCount(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value :");
    int n=sc.nextInt();
    int count1=0;
    for(int i=2;i<=n;i++){
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0)
          count++;
      }
      if(count==2)
        count1++;
    }
    System.out.println(" there are " +count1+ " prime numbers less than " +n);
    
  }
}