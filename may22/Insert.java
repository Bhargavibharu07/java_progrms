/*Menu based application on Array Operations: create an application which will display list of operations on array.
             --> Insert an element in first index 
             --> Insert an element in last index
             --> Insert an element in specified index
             --> Remove element from first index
             --> Remove element from last index
             --> Remove element from specified index*/

import java.util.Scanner;
public class Insert{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    Method_Array m=new Method_Array();
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements:");
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    boolean cc=true;
    while(cc){
      System.out.println();
      System.out.println("*****MENU*****");
      System.out.println("1. Insert an element in first index/n 2. Insert an element in last index/n 3. Insert an element in specified index\n 4. Remove element from first index\n 5. Remove element from last index \n 6. Remove element from specified index  ");
      int choice;
      System.out.println("Enter your choice");
      choice=sc.nextInt();
      switch(choice){
        case 1:
          int[] b1=m.insertFirstIndex(arr);
          for(int i=0;i<b1.length;i++)
            System.out.println(b1[i]+"");
          break;
        case 2:
          int[] b2=m.insertLastIndex(arr);
          for(int i=0;i<b2.length;i++)
            System.out.println(b2[i]+"");
          break;
        case 3:
          int[] b3=m.insertSpecifiedIndex(arr);
          for(int i=0;i<b3.length;i++)
            System.out.println(b3[i]+"");
          break;
        case 4:
          int[] b4=m.removeFirstIndex(arr);
          for(int i=0;i<b4.length;i++)
            System.out.println(b4[i]+"");
          break;
        case 5:
          int[] b5=m.removeLastIndex(arr);
          for(int i=0;i<b5.length;i++)
            System.out.println(b5[i]+"");
          break;
        case 6:
          int[] b6=m.removeSpecifiedIndex(arr);
          for(int i=0;i<b6.length;i++)
            System.out.println(b6[i]+"");
          break;
        default:
          System.out.println("Invalid choice");
          cc=false;
          
          
          
      }
    }
    
  }
}
class Method_Array{
  Scanner s=new Scanner(System.in);
  public int[] insertFirstIndex(int[]a){
    int[]b=new int[(a.length)+1];
    System.out.println("Enter element to insert at first index");
    int element=s.nextInt();
    for(int i=a.length-1,j=i+1;i>=0;i--,j--){
      b[j]=a[i];
    }
    b[0]=element;
    return b;
  }
  public int[] insertLastIndex(int[]a){
    int[]b=new int[(a.length)+1];
    System.out.println("Enter element to insert at last index");
    int element=s.nextInt();
    for(int i=0;i<a.length;i++)
      b[i]=a[i];
    b[b.length-1]=element;
    return b;
  }
  public int[] insertSpecifiedIndex(int[]a){
    int[]b=new int[(a.length)+1];
    System.out.println("Enter index to enter");
    int speci_index = s.nextInt();
    System.out.println("Enter element to insert at "+speci_index);
    int element=s.nextInt();
    for(int i=0;i<a.length;i++){
      if(i<speci_index){
        b[i]=a[i];
      }
      if(i>=speci_index){
        b[i+1]=a[i];
      }
      b[speci_index]=element;
    }
    return b;
    
  }
    public int[] removeFirstIndex(int[]a){
      int[]b=new int[(a.length)-1];
      for(int i=1,j=0;i<a.length;i++,j++){
        b[j]=a[i];
      }
      return b;
    }
    public int[] removeLastIndex(int[]a){
      int[]b=new int[(a.length)-1];
      for(int i=0,j=0;i<a.length-1;i++,j++){
        b[j]=a[i];
      }
      return b;
      
    }
    public int[] removeSpecifiedIndex(int[]a){
      int[]b=new int[(a.length)-1];
      System.out.println("Enter index to remove element");
      int speci_index=s.nextInt();
      for(int i=0;i<a.length-1;i++){
        if(i<speci_index){
          b[i]=a[i];
        }
        if(i>speci_index){
          b[i]=a[i];
        }
        if(i>=speci_index){
          b[i]=a[i+1];
        }
      }
      return b;
    }        
}