package CoreJava;

import java.util.Scanner;

public class twoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int array[][] = new int[10][10];
		int nextarray[][] = new int[10][10];
		
		System.out.println("Enter number of rows");
		int x = s.nextInt();
		System.out.println("Enter number of columns");
		int y = s.nextInt();
		int i, j;
		int n, m;
		System.out.println("Enter first row and column in first array");
		for (i = 0; i <= x; i++)
			for (j = 0; j <= y; j++)

			{

				array[i][j] = s.nextInt();

			}
		System.out.println("Enter first row and column in Second array");
		for (n = 0; n <= x; n++)
			for (m = 0; m <= y; m++) {
				nextarray[n][m] = s.nextInt();
			}
		System.out.println("array of first array" );
		for (i = 0; i <= x; i++)
			for (j = 0; j <= y; j++)
			{
				
				System.out.println(array[i][j]);
			}
		System.out.println("array of first array" );
		for (n = 0; n <= x; n++)
			for (m = 0; m <= y; m++) {
				System.out.println(nextarray[n][m]);
			}

	}

}
