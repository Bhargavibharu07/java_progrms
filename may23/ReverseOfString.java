//WAP to find reverse of a string
import java.util.Scanner;
public class ReverseOfString{
  public static void main(String[]args){
    ReverseString rs=new ReverseString();
    rs.findReverse();
  }
}
class ReverseString{
  public void findReverse(){
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String s1=sc.nextLine();
    String s2="";
    for(j=(s1.length()-1);j>=0;j++){
      s2=s2+s1.charAt(j);
    }
    System.out.println(s2);
    
    
  }
}

