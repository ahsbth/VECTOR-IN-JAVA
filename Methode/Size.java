import java.util.*;
import java.io.*;
  class Size
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
		  System.out.println("Enter position and objects for insert=");
		  int pos=sc.nextInt();
		  String s1=new String();
		  s1=sc.nextLine();
		  v.insertElementAt(s1,pos);
		  int count=v.size();
		   System.out.println("objects="+v);
		  System.out.println("no of objects="+count);
	  }
  }
  
			  