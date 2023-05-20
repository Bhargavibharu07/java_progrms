import java.util.*;
public class LogicalOperator
{
  public static void main(String[] args) 
  {
    int x=2,y=3,z=4;
    // && operator
    System.out.println("Result of ("+x+" > "+y+") && ("+z+" > "+x+")");
    System.out.println((x > y) && (z > x));  
    System.out.println("Result of ("+x+" > "+y+") && ("+z+" < "+x+")");
    System.out.println((x > y) && (z < x)); 

    // || operator
    System.out.println("Result of ("+y+" < "+x+") || ("+z+" > "+x+")");
    System.out.println((y < x) || (z > y));  
    System.out.println("Result of ("+y+" > "+x+") || ("+z+" < "+x+")");
    System.out.println((y > x) || (z < x));  
    System.out.println("Result of ("+y+" < "+x+") || ("+z+" < "+x+")");
    System.out.println((y < x) || (z < y));  


    // ! operator
   System.out.println("Result of (!"+x+" == "+y+")");
   System.out.println(!(x == y)); 
   System.out.println("Result of (!"+x+" > "+y+")");
   System.out.println(!(x > y));
 
  }
}
