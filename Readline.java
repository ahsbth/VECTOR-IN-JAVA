import java.io.*;
import java.util.*;
 class Readline
 {
	 public static void main(String args[]) throws IOException
	 {
		 InputStreamReader isr=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(isr);
		 Vector v=new Vector();
		 System.out.println("Enter 10 objects=");
		 for(int i=0;i<10;i++)
		 {
			 Integer f=new Integer(br.readLine());
			 v.addElement(f);
		 }
		 System.out.println("Vector="+v);
	 }
 }
 
		 
		 
	 