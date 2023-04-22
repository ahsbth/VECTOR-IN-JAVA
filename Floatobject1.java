import java.io.*;
import java.util.*;
 class Floatobject1
 {
	 public static void main(String args[]) 
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 Vector v=new Vector();
		 System.out.println("Enter 10 objects=");
		 for(int i=0;i<10;i++)
		 {
			 Float f=new Float(sc.nextFloat());
			 v.addElement(f);
		 }
		 System.out.println("Vector="+v);
	 }
 }
 
		 
		 
	 