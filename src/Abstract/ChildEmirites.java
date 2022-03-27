package Abstract;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		
		ChildEmirites c = new ChildEmirites();
		c.bodyColor();
		c.engine();
		c.safetyGuidelines();
	}

	@Override
	public void bodyColor() {
		
		System.out.println("Red color on the body");
	}

}
