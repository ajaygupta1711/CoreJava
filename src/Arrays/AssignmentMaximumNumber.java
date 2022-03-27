package Arrays;

public class AssignmentMaximumNumber {

	public static void main(String[] args) {
		
		int a[][] = {{2,4,7},{3,4,7},{1,2,9}};
		int max=a[0][0];
		
		for (int i=0; i<3; i++) // Row
		{
			for (int j=0; j<3; j++) // Column
			{
				if(a[i][j]>max)  // 2
				{
					max=a[i][j];
				}
			}
		}
		
		System.out.println(max);
		
	}

}

//2  4  5
//3  4  7
//1  2  9
