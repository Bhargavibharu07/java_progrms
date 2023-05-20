import java.util.Scanner;
public class LinearSearch{
  public static void main(String[] args){
    Linear l=new Linear();
    l.array();
    
  }
}
class Linear{
  public void array(){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter the Elements of Array:");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(" Enter key  to search");
    int key=sc.nextInt();
    int count=0;
    for(int i=0;i<5;i++){
      if(key==arr[i]){
        System.out.println("key is found at:" +i);
        count=count+1;
        break;
      }
    }
    if(count==0){
      System.out.println("key element is not in Array");
    }
    
  }
}