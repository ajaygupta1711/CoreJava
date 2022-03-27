package Loops;

public class whileDoWHileDemo {

	public static void main(String[] args) {
		
		// While Loop
		
		int i=10;
		
		while(i>0)
		{
			System.out.println(i);
			i--;
		}   

		int j=20;
		
		do
		{
			System.out.println(j);
			j++; // need to pass surpass time
		}
		
		while(j>30); // One loop of execution is guarantee
		
		
		for(int k=0;k<10;k=k+3)
		{
		if(k==9)
		System.out.println(" 9 is displayed");
		else
		System.out.println("I didnot find");//
		}
		
	}
}