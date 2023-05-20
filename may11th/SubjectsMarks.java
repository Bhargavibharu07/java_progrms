import java.util.Scanner;
public class SubjectsMarks
{
    public static void main(String args[])
    {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter 5 sub marks");
        int physics_Marks=s.nextInt();
        int chemistry_Marks=s.nextInt();
        int biology_Marks=s.nextInt();
        int mathematics_Marks=s.nextInt();
        int computer_Marks=s.nextInt();

 

        int Percentage=(physics_Marks+chemistry_Marks+biology_Marks+mathematics_Marks+computer_Marks)/5;
        System.out.println("percentage:"+Percentage);
      if(Percentage >= 90) {
         System.out.println("Grade A");
         }
        
        else if(Percentage >= 80){
         System.out.println("Grade B");
         }
        else if(Percentage >= 70) {
         System.out.println("Grade C");
        }
        else if(Percentage >= 60) {
         System.out.println("Grade D");
        }
        else if(Percentage >= 40) {
          System.out.println("Grade E");
        }
        else if(Percentage < 40) 
          System.out.println("Grade F");
 
        
            
    }
}