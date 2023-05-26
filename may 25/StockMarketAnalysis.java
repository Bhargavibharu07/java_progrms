/*You are working on a stock market analysis tool that helps investors analyze historical stock prices. This tool allows users to input an array of stock prices for a specific stock and identifies the minimum and maximum prices to help users make informed investment decisions.You are tasked with writing a program in Java to accomplish this.*/

import java.util.Scanner;
public class StockMarketAnalysis{
  public static void main(String[]args){
    StockMarket sm=new StockMarket();
    sm.price();
  }
}
class StockMarket{
  public void price(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of prices");
    int n=sc.nextInt();
    System.out.println("enter prices");
    double stock[]=new double[n];
    for(int i=0;i<stock.length;i++)
    stock[i]=sc.nextDouble();
    double min=stock[0];
    double max=stock[0];
    for(int i=0;i<stock.length;i++){
      if(min>stock[i])
        min=stock[i];
      if(max<stock[i])
        max=stock[i];
    }
    System.out.println("the maximum stock price is"+max);
    System.out.println("the minimum stock prince is"+min);
    
  }  
}