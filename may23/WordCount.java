import java.util.Scanner;
public class WordCount{
  public static void main(String[]args){
    Words nw=new Words();
    nw.numWords();    
  }
}
class Words{
  public void numWords(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string");
    String s1=sc.nextLine();
    String words[]=s1.split("");
    int num_of_words=words.length;
    System.out.println("Number of words are:"+num_of_words);
  }
}
