package Arrays;

public class MultiDimentionalLiteral {

	public static void main(String[] args) {
		
		int b[][] = {{1,2,3},{4,5,6}};
		
		for (int i=0; i<b.length; i++) // For Rows
			{
				for (int j=0; j<b[i].length; j++)  // For Columns
				System.out.println(b[i][j]);
			}
	}
}
