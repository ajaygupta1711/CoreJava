package Abstract;

public abstract class ParentAirCraft {

	// Non-Abstract or Non-Concrete Method
	public void engine()
	{
		System.out.println("Follow Engine Guidelines");
	}
	
	public void safetyGuidelines()
	{
		System.out.println("Follow Safety Guidelines");
	}
	
	// Abstract or Concrete Method
	public abstract void bodyColor();
}
