/*You are working on a text editor application that allows users to write sentences. As part of an enhancement to the application, you need to implement a feature that automatically capitalizes the first letter of each word in a sentence. This will make the text appear more visually appealing and adhere to standard writing conventions. You are tasked with writing a program in Java to accomplish this.
For example, if the user enters "the quick brown fox jumps over the lazy dog", the program should output "The Quick Brown Fox Jumps Over The Lazy Dog".*/

import java.util.Scanner;
public class TextEditorApplication{
  public static void main(String[]args){
    CapitalizeFirstLetter cfl=new CapitalizeFirstLetter();
    cfl.firstletter();
  }
}
class CapitalizeFirstLetter{
  public void firstletter(){
    Scanner sc=new Scanner(System.in);
    String given_string="";
    String word="";
    String Final_string="";
    System.out.println("Enter the sentance");
    String str=sc.nextLine();
    String words[] = str.split(" ");
    for(int i=0;i<words.length;i++){
      char ch=words[i].charAt(0);
      if(ch>='a'&&ch<='z'){
        char first_char=(char)(ch-32);
        given_string=words[i].substring(1);
        word=first_char+given_string;
      }
      else{
        word=words[i];
      }
      Final_string=Final_string+word+" ";
    }
    System.out.print(Final_string);               
    
  }
}