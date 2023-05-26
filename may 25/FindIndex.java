//WAP to read string and character and find the index of the character in a string

import java.util.Scanner;
public class FindIndex{
  public static void main(String[]args){
    IndexOfChar ioc=new IndexOfChar();
    ioc.find();
  }
}
class IndexOfChar{
  public void find(){
    char character;
    int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    System.out.println("Enter a character");
    char ch=sc.next().charAt(0);
    for(int i=0;i<str.length();i++){
      character = str.charAt(i);
      if(ch==character){
        count++;
        System.out.println(ch+"is found in string"+str+"at index"+i);
      }
    }
    if(count==0)
      System.out.println(ch+"is not found in string"+str);
  }
}