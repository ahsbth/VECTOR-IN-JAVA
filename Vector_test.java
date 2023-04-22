import java.io.*;
import java.util.*;
class Vector_test
{
	public static void main(String args[])
	{
		int len=args.length;
		Vector v=new Vector();
		for(int i=0;i<len;i++)
		{
			v.addElement(args[i]);
		}
	System.out.println("Vector="+v);
	}
}

