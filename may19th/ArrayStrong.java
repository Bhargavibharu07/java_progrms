//WAP to take an array that reads an array of integers and print all the Strong numbers of that array
import java.util.Scanner;
public class ArrayStrong{
  public static void main(String[] args){
    Strong s = new Strong();
    s.number();
    
  }
}
class Strong{
  public void number(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of elements:");
    int n=sc.nextInt();
    int array[]=new int[n];
    System.out.println("Enter elements of array:");
    for(int i=0;i<array.length;i++)
      array[i]=sc.nextInt();
    for(int i=0;i<array.length;i++){
      int digit;
      int sum=0;
      int temp=array[i];
      while(temp!=0){
        digit=temp%10;
        int j=1,factorial=1;
        while(j<=digit)
          {
            factorial=factorial*j;
            j++;
          }
        sum=sum+factorial;
        temp=temp/10;
      }
      if(sum==array[i])
        System.out.println("\n"+array[i]+"is a strong number");
    }
  
  }
    
    
  
}
