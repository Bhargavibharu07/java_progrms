import java.util.Scanner;
public class Notes
{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int amount,min_notes=0,notes;
    System.out.println("enter the amount");
    amount = sc.nextInt();
    if(amount%100==0)
    {
      if(amount>=500)
      {
        notes = amount/500;
        min_notes = min_notes+notes;
        amount = amount%500;
      }
      if(amount>=200)
      {
        notes = amount/200;
        min_notes = min_notes+notes;
        amount = amount%200;
      }
      if(amount>=100)
      {
        notes = amount/100;
        min_notes = min_notes+notes;
        amount = amount%100;
      }
      System.out.println("minimum number of notes are :"+min_notes);
    }
    else
      System.out.println("amount will be in 100's only");
  }
}