import java.util.Scanner;
public class Unique{
  public static void main(String[]args){
    Elements e=new Elements();
    e.array();
  }
}
class Elements{
  public void array(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n no.of elements:");
    int n=sc.nextInt();
    int arry[]=new int[n];
    System.out.println("Enter n elements:");
    for(int i=0;i<n;i++){
      arry[i]=sc.nextInt();
    }
    int count;
    boolean visited[]=new boolean[n];
    for(int i=0;i<n;i++)
      {
        if(visited[i]==true){
          continue;
        }
        count=1;
        for(int j=i+1;j<n;j++){
          if(arry[i]==arry[j]){
            count=count+1;
            visited[j]=true;
          }
          
        }
        if(count==1){
          System.out.println("Unique value is:"+arry[i]);
        }
      }
    
  }
}