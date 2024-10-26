package MultiDiemensionalArrays;

import java.util.Scanner;

public class sumOfRowsAndSumOfColumn {

	public static void main(String[] args) {

		int row = 0;
		int column = 0;
		int a[][] = null;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter row and column size: ");
		row = scan.nextInt();
		column = scan.nextInt();

		a = new int[row][column];

		System.out.println("Enter Matrix: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		int rowsum;
		int columnsum;

		for (int i = 0; i < 3; i++) {

			rowsum = 0;
			columnsum = 0;

			for (int j = 0; j < 3; j++) {
				rowsum += a[i][j];
				columnsum += a[j][i];
			}

			System.out.println("Row-" + (i + 1) + " sum = " + rowsum);
			System.out.println("Column-" + (i + 1) + " sum = " + columnsum);
		}

		scan.close();
	}

}
