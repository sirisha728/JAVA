import java.io.*;
import java.util.Scanner;
class myexception extends Exception 
{
 myexception()
{
	super("odd number exception");
}
}
class lab20a
{
  public static void main(String[] args)
        {
            int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
        num=sc.nextInt();
        try
	{
  	if(num%2!=0)
 		throw(new myexception());
	else
	  System.out.println(""+num+"is even number");
	}
	catch(myexception ex)
	{
	 System.out.println("\n Error:"+ex.getMessage());
	}
	
}
}

