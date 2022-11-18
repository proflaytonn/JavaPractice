package AbstractAndInheritance;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass a = new ChildClass();
		a.tesPanggilMethodInheritance();
		a.gear();
		a.carColour();
		a.audioSystem();
		
	}
	
	//override
	public void audioSystem()
	{
		System.out.println("Audio system is new from Child");
	}
	
	public void tesPanggilMethodInheritance()
	{
		gear();
	}
	
	public void carColour()
	{
		System.out.println("My car colour is "+ colour);
	}

}
