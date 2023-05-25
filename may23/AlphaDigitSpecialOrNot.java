//WAP to count total alphabets,digits and spl characters in a string
import java.util.Scanner;
public class AlphaDigitSpecialOrNot{
  public static void main(String[]args){
    TotalCount tc=new TotalCount();
    tc.findcound();
    
  }
}
class TotalCount{
  public void findcound(){
    Scanner sc=new Scanner(System.in);
    int countalphabets=0,countdigits=0,countspecialsymbols=0;
    System.out.println("enter a string");
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if((ch>='a'&&ch<='z')||(ch>='A'&& ch<='z'))
        countalphabets++;
      else if(ch>='0'&& ch<='9')
        countdigits++;
      else
        countspecialsymbols++;
        
        
        
    }
    
    System.out.println("Total Digits="+countdigits);
    System.out.println("Total Digits="+countdigits);
    System.out.println("Total special symbols="+countspecialsymbols);
  }
}
