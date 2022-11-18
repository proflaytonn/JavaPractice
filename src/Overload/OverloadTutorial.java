package Overload;

public class OverloadTutorial {

	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(a + ", " + b);
	}
	
	public static void main(String[] args) {
		OverloadTutorial a = new OverloadTutorial();
		a.getData(3);
		a.getData("ini tiga");
		a.getData(33, 333);

	}

}
