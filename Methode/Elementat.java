import java.io.*;
import java.util.*;
  class Elementat
  {
	  public static void main(String args[])
	  {  int i;
		  Scanner sc=new Scanner(System.in);
		  Vector v=new Vector();
		  String s[]=new String[10];
		  System.out.println("Enter 10 objects=");
		  for(i=0;i<10;i++)
		  {
			  s[i]=sc.nextLine();
			  v.addElement(s[i]);
		  }
		  System.out.println("Enter position for find objects of vector=");
		  int pos=sc.nextInt();
		  
		  System.out.println("vector="+v.elementAt(pos));
	  }
  }
  
		  