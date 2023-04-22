import java.io.*;
import java.util.*;
 class Assign
 {
	 public static void main(String args[]) 
	 {
		 int len=args.length;
		 Vector v=new Vector();
		 for(int i=0;i<len;i++)
		 {
			 Integer I=new Integer(args[i]);
			 v.addElement(I);
		 }
		 System.out.println("Vector="+v);
	 }
 }
 
		 
		 
	 