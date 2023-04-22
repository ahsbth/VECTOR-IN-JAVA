import java.io.*;
import java.util.*;
  class Insert
  {
	  public static void main(String args[])
	  {  int i;
		  Scanner sc=new Scanner(System.in);
		  Vector v=new Vector();
		  String s[]=new String[5];
		  System.out.println("Enter 5 objects=");
		  for(i=0;i<5;i++)
		  {
			  s[i]=sc.nextLine();
			  v.addElement(s[i]);
		  }
		  System.out.println("Enter position and objects for insert in vector=");
		  int pos=sc.nextInt();
		  String s1=new String();
		  s1=sc.nextLine();
		 v.insertElementAt(s1,pos);
		  
		  
		  System.out.println("vector="+v);
	  }
  }
  
		  