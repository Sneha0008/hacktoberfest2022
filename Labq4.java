class C
{
	int num;
	void show()
	{
		System.out.println("Hello from show from C num= "+num);
	}
}
class D extends C
{
	int num=70;
	void show()
	{
		super.num=150;
		super.show();
		System.out.println("Hello from show from D= "+num);
	}
}
class Labq4
{
	public static void main(String args[])
	{
		D obj = new D();
		obj.show();
	}
}
