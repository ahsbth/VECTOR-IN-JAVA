import java.io.*;
import java.util.*;
 class Floatobject
 {
	 public static void main(String args[]) 
	 {
		 int len=args.length;
		 Vector v=new Vector();
		 for(int i=0;i<len;i++)
		 {
			 Float f=new Float(args[i]);
			 v.addElement(f);
		 }
		 System.out.println("Vector="+v);
	 }
 }
 
		 
		 
	 