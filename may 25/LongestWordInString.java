import java.util.Scanner;
public class LongestWordInString{
  public static void main(String[]args){
    LongestWord lw= new LongestWord();
    lw.returns();
  }
}
class LongestWord{
  public void returns(){
    int longest_length=0,longest;
    String long_word="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    String words[]=str.split(" ");
    for(int i=0;i<words[i].length();i++){
      longest=words[i].length();
      if(longest_length<longest)
      {
        longest_length=longest;
        long_word=words[i];
      }
    }
    System.out.println("longest word is"+long_word+"with length"+longest_length);
  }
}