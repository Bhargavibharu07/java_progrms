//WAP to check whether a string is palindrome or not.
import java.util.Scanner;
public class PalindromeString{
  public static void main(String[]args){
    CheckPalindromeOrNot cpn =new CheckPalindromeOrNot();
    cpn.palindrome();
  }
}
class CheckPalindromeOrNot{
  public void palindrome(){
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String s1=sc.nextLine();
    String s2="";
    for(j=(s1.length()-1);j>=0;j--){
      s2=s2+s1.charAt(j);
    }
    if(s1.equals(s2))
      System.out.println(s1+"is palindrome");
    else
      System.out.println(s1+"is not palindrome");
 }
}