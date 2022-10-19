import java.io.*;
class Accept_string_char_float
{
	public static void main(String args[]) throws IOException
	{
		String i;
		int j;
		float k;
		try{
			DataInputStream p = new DataInputStream(System.in);
			System.out.println("Enter the string : ");
			//enter a string
			i = p.readLine();
			System.out.println("The entered string is : "+i);
			System.out.println("Enter an Integer value : ");
			//enter an integer
			j = Integer.parseInt(p.readLine());
			System.out.println("The entered integer is : "+j);
			System.out.println("Enter an Float value : ");
			//enter a float value
			k = Float.parseFloat(p.readLine());
			System.out.println("The entered float value is : "+k);
		}
		catch (Exception e) {
			System.out.println("Error!!");
		}
	}
}
