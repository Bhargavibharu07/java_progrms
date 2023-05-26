import java.util.Scanner;
public class StringBuilderprogrm1{
  public static void main(String[]args){
    StringBuilder sb=new StringBuilder("i made up my time study more");
    System.out.println(sb);
    sb.insert(18,"to ");
    System.out.println("After inserting:"+sb);
    sb.append("!");
    System.out.println("After appending:"+sb);
    int index=sb.indexOf("more");
    sb.replace(index,sb.length(),"Harder");
    System.out.println("After replacing:"+sb);
    sb.delete(9,12);
    System.out.println("After deleting:"+sb);
    sb.reverse();
    System.out.println("After reversing:"+sb);
    
    
  }
}