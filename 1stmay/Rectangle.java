import java.util.Scanner;
public class Rectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float length, breadth, area;
    System.out.println("Enter the length");
    length = sc.nextFloat();
    System.out.println("Enter the breadth");
    breadth = sc.nextFloat();
    area = length * breadth;
    // area
    System.out.println("Area of Rectangle is " + area);
  }
}