package java8;

public class Funct implements MAin
{
	@Override
	public void add() {
		
	}
	public static void main(String []args)
	{
		MAin mn=()->System.out.println("hi");
		mn.add();
	}
}