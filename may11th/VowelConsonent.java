import java.util.Scanner;
public class VowelConsonent
  {
    public static void main(String[] args)
    {
      Scanner sc =new Scanner(System.in);
      char y;
      System.out.println("enter the alphabet");
      y = sc.next().charAt(0);
      if(((y=='a')||(y=='e')||(y=='i')||(y=='o')||(y=='u'))||((y=='A')||(y=='E')||(y=='I')||(y=='O')||(y=='U')))
      {
        System.out.println("it is vowel");
      }
      else
      {
        System.out.println("it is consonant");
      }
     
    }
  }