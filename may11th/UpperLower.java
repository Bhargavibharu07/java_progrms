import java.util.Scanner;
public class UpperLower
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      char y;
      System.out.println("enter the charecter:");
      y = sc.next().charAt(0);
      if(y>='a'&& y<='z')
      {
        System.out.println("This is lowercase Alphabet");
      }
      else{
        System.out.println("This is uppercase Alphabet");
        
      }
      
    }
  }
