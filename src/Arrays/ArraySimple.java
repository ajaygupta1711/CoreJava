package Arrays;

public class ArraySimple {

	public static void main(String[] args) {
	
		int a[] = new int[5]; // Declares an array and Allocate momory for the values
		
		a[0] = 9;
		a[1] = 8;
		a[2] = 7;
		a[3] = 6;
		a[4] = 5;
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
