package Arrays;

public class ArrayLiteral {

	public static void main(String[] args) {
		
		int b[] = {1,4,3,5,7,9,11}; // Directly passing the value to array without allocating the memory (memory is allocating dynamically)
		
		for (int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}

}
