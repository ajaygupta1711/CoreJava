package Loops;

public class Assignment1 {

	public static void main(String[] args) {
		
		int k=1;
		for (int i=0; i<4; i++)
		{
//			System.out.println("OL Started");
			
			for (int j=1; j<=4-i; j++)
			{ 
				System.out.print( k);
				System.out.print('\t');
				k++;
			}
			System.out.println("");
		}
				
/*		System.out.print('\n');
		
		for (int j=5; j<=7; j++)
		{ 
			System.out.print(j + " ");
		}
		
		System.out.print('\n');
		
		for (int k=8; k<=9; k++)
		{ 
			System.out.print(k + " ");
		}
		
		System.out.print('\n');
		
		for (int l=10; l<=10; l++)
		{ 
			System.out.print(l + " ");
		}  */

	}

}

/* 1 2 3 4
   5 6 7	
   8 9
   10  */