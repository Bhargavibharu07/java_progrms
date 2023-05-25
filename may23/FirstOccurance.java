//WAP to find first occurrence of a character in a given string.
import java.util.Scanner;
public class FirstOccurance{
  public static void main(String[]args){
    FirstOccurence co = new FirstOccurence();
    co.find();
  }
}
class FirstOccurence{
  public void find(){
    char charecter;
    boolean found=false;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    System.out.println("Enter a charecter");
    char ch=sc.next().charAt(0);
    for(int i=0;i<str.length();i++){
      charecter=str.charAt(i);
      if(ch==charecter){
        found=true;
        System.out.println("First occurence of"+ch+"is at index"+i);
        break;
        
      }     
    }
    if(found==false)
      System.out.println(ch+"is not found in string");
  }
}