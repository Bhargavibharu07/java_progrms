import java.util.Scanner;
public class StringBufferPrgrm1{
  public static void main(String[]args){
    StringBuffer sb=new StringBuffer("Introduction to string");
    System.out.println(sb);
    sb.insert(16," the java ");      //insert method
    System.out.println("After Inserting:"+sb);
    sb.append("!");               //append method
    System.out.println("After appending:"+sb);
    int index=sb.indexOf("java");
    sb.replace(index,sb.length(),"string");  //replace method
    System.out.println("after replacing:"+sb);
    sb.delete(17,20);           //delete method
    System.out.println("after deleting:"+sb);
    sb.reverse();         //reverse method
    System.out.println("After reversing:"+sb);
    
  }
}