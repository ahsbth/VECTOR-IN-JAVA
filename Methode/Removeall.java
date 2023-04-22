import java.util.*;
import java.io.*;
  class Removeall
  {
	  public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  String s[]=new String[5];
		  Vector v=new Vector();
		  System.out.println("Enter 5 objeccts=");
		  for(int i=0;i<5;i++)
		  {
			  s[i]=sc.nextLine();
			  v.addElement(s[i]);
		  }
		
		v.removeAllElements();
		System.out.println("objects="+v);
	  }
  }
  
			  