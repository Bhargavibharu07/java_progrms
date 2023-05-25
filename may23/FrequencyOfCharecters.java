import java.util.Scanner;
public class FrequencyOfCharecters{
  public static void main(String[] args){
    Frequency fc=new Frequency();
    fc.charFrequency();
  }
}
class Frequency{
  public void charFrequency(){
    int count;
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string");
    String s1=sc.nextLine();
    boolean visited[]=new boolean[s1.length()];
    for(int i=0;i<s1.length();i++){
      ch=s1.charAt(i);
      if(visited[i]==true)
        continue;
      else{
        count=1;
        for(int j=i+1;j<s1.length();j++){
          if(s1.charAt(i)==s1.charAt(j)){
            count++;
            visited[j]=true;
            
          }
          
        }
      }
      System.out.println("Frequency of "+ ch+" is"+count);
    }
  }
}