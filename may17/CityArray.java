import java.util.Scanner;
public class CityArray{
  public static void main(String[] args){
    Array a=new Array();
    a.array();
  }
}
class Array{
  public void array(){
    Scanner sc=new Scanner(System.in);
    String cities[]=new String[5];
    System.out.println("enter the 5 cities names");
    for(int i=0;i<cities.length;i++){
      cities[i]=sc.next();
    }
      System.out.println("the cities names are");
   
    for(int i=0;i<cities.length;i++){
      System.out.println(cities[i]);
    }
    }
  }