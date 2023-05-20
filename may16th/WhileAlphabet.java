//19. WAP to print all alphabets from a to z. - using while loop
import java.util.Scanner;
public class WhileAlphabet{
  public static void main(String[]args){
    Alphabet sa= new Alphabet();
    sa.atoz();
  }
}
class Alphabet{
  public void atoz(){
    char ch='a';
    while(ch<='z'){
      System.out.print(ch);
      ch++;
    }
    
  }
  
}
  