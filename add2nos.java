//add two numbers using oop approach
import java.io.*;
import java.util.Scanner;
class Add
{
	private int i,j,k;
	void getdata(int a,int b)
	{
		i=a;
		j=b;
	}
	void addition()
	{
		k=i+j;
	}
	void print()
	{
		System.out.println("Addition of 2 numbers is: "+k);
	}
}
class add2nos
{
	public static void main(String args [])
	{
		int x,y,sum;
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			x=sc.nextInt();
			System.out.println("Enter second number");
			y=sc.nextInt();
			Add p = new Add();
			p.getdata(x,y);
			p.addition();
			p.print();
		}
		catch (Exception e)
		{
			System.out.println("Error!!");
		}
	}
}
