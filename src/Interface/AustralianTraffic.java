package Interface;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {

	public static void main(String[] args) {
		
		CentralTraffic a = new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.YellowWait();
		
		AustralianTraffic at = new AustralianTraffic();
		at.walkonsymbol();
		
		ContinentTraffic ct = new AustralianTraffic();
		ct.trainSymbol();
	}

	@Override
	public void greenGo() {
		System.out.println("GreenGo implementation");
	}

	@Override
	public void redStop() {
		System.out.println("RedStop implementation");
	}

	@Override
	public void YellowWait() {
		System.out.println("YellowWait implementation");
	}
	
	public void walkonsymbol() {
		System.out.println("Walking");
	}

	@Override
	public void trainSymbol() {
		System.out.println("To Stop");
	}

}