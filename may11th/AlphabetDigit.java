import java.util.Scanner;
public class AlphabetDigit
  {
    public static void main(String[] args)
    {
      Scanner sc =new Scanner(System.in);
      char y;
      System.out.println("enter the charecter:");
      y = sc.next().charAt(0);
      if( (y >= 'a' && y <= 'z') || (y >= 'A' && y <= 'Z'))
      {
        System.out.println(y + " is an alphabet.");
      }
      else if (y>='0'&& y<='9')
        {
        System.out.println(y+"is a digit.");
        }
      else 
      {
        System.out.println(y+"is a special symbol");
      }
    }
  }
                    