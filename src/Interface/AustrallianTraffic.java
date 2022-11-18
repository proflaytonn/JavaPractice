package Interface;

public class AustrallianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		
		//CentralTraffic a = new AustrallianTraffic(); //ini mirip WebDriver driver = new ChromeDriver();
		AustrallianTraffic a = new AustrallianTraffic(); // kalo ini konsepnya mirip ChromeDriver driver = new ChromeDriver();
		
		a.greenGo();
		a.redStop();
		a.yellowCareful();
		a.gotoAustrallianCafe();
		a.walkingPedestrian();
		
		
	}

	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green light is go");
	}

	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red light is stop");
	}

	public void yellowCareful() {
		// TODO Auto-generated method stub
		System.out.println("yellow light is careful and wait");
	}
	
	public void gotoAustrallianCafe()
	{
		System.out.println("i love australlican coffee");
	}

	public void walkingPedestrian() {
		// TODO Auto-generated method stub
		System.out.println("walking walking on the pedestrian");
	}
}
