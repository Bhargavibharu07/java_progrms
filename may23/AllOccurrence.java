// WAP to search all occurrences of a character in given string.
import java.util.Scanner;
public class AllOccurrence{
  public static void main(String[]args){
    SearchOccurrence so=new SearchOccurrence();
    so.search();
  }
}
class  SearchOccurrence{
  public void search(){
    char charecter;
    int i;
    boolean found=false;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string");
    String str=sc.nextLine();
    System.out.println("Enter charecter");
    char ch=sc.next().charAt(0);
    int c=0;
    for(i=0;i<str.length();i++);{
       char character = str.charAt(i);
      if(ch==character){
        found=true;
        c++;
        if(c==1){
          System.out.println("All occurrence of charecter"+ch+"is at the index:");
          System.out.println(i);     
        }       
      }
      if(found=false)
        System.out.println(ch+"is not found in string");
      
  
    }
}
}
