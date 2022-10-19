class Commercial
{
	private String name;
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	void CalculateBill(int unit) //calculating commercial bill
	{
		System.out.println("Commercial Customer= "+getname());
		System.out.println("Bill amount= "+unit*5.00);
	}
}
class Domestic extends Commercial
{
	void CalculateBill(int unit) //calculating domestic bill
	{
		System.out.println("Domestic Customer= "+getname());
		System.out.println("Bill amount= "+unit*2.50);
	}
}
class Labq5
{
	public static void main(String args[])
	{
		Commercial c = new Commercial();
		c.setname("ABC");
		c.CalculateBill(40);
		Domestic d = new Domestic ();
		d.setname("EFG");
		d.CalculateBill(40);
	}
}
