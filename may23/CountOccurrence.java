//WAP to count occurrences of a character in given string.
import java.util.Scanner;
public class CountOccurrence{
  public static void main(String[]args){
    OccurrenceCount oc =new OccurrenceCount();
    oc.occurrence();   
    
  }
}
class OccurrenceCount{
  public void occurrence(){
    char charecter;
    int count=0;
    boolean found=false;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    System.out.println("Enter a charecter");
    char ch=sc.next().charAt(0);
    for(int i=0;i<str.length();i++){
      charecter=str.charAt(i);
      if(ch==charecter){
        found=true;
        count++;
      }
    }
    System.out.println(ch+" is occure in "+count+" times");
  }
}