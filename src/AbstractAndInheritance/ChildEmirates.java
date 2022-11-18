package AbstractAndInheritance;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args)
	{
		ChildEmirates a = new ChildEmirates();
		
		a.engine();
		a.safetyGuidelines();
		a.bodyColour();
	}
	
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Red colour on the body");
	}

}
