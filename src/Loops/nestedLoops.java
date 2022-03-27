package Loops;

public class nestedLoops {
	
	public static void main(String[] args) {
		
	// Nested Loops works -  
	
	for(int i=1; i<=4; i++) // Outer Loop, This block will loop for 4 times
	{
		System.out.println("Outer Loop Started");
		
		for (int j=1; j<=4; j++) // Inner Loop
		{
			System.out.println("Inner Loop");
		}
		
		System.out.println("Outer Loop Finished");
	}

	
	}
}