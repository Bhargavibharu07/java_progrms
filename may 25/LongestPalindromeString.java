import java.util.Scanner;
public class LongestPalindromeString{
  public static void main(String[]args){
    LongestPalindrome lp= new LongestPalindrome();
    lp.find();
  }  
}
class LongestPalindrome{
  public void find(){
    String larg_palindrome="";
    int length=0;
    String word="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String str=sc.nextLine();
    String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
      String reverse_word="";
      word=words[i];
      for(int j=word.length()-1;j>=0;j--){
        reverse_word=reverse_word+word.charAt(j);
        
      }
      if(reverse_word.equals(word)){
        if(length<word.length())
        {
          length=word.length();
          larg_palindrome=word;
        }
      }
      
    }
    System.out.println("Largest palindrome word is: "+larg_palindrome);
    
  }  
}