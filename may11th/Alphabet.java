import java.util.Scanner;
public class Alphabet
{
    public static void main(String args[])
    {
        char c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any  character");
        c=s.next().charAt(0);
        
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                    System.out.println(c + " is an alphabet.");
            else
                    System.out.println(c + " is not an alphabet.");
        
            
    }
}