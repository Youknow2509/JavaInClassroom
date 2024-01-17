package week2.sodoku;

/*
 * Main game Sodoku
 */

public class Sodoku {

	private static void showArray(int[][] arr) {
		System.out.println("   0 1 2   3 4 5   6 7 8");
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0){
				System.out.println("-------------------------"); // 24 dau -
			}
			System.out.print(i);
			for (int j = 0; j < 9; j++) {
				if (j % 3 == 0){
					System.out.print("| ");
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
			int[][] arr = {
						{2, 1, 9, 7, 6, 4, 5, 3, 8},
						{7, 3, 4, 5, 9, 8, 1, 6, 2},
						{6, 8, 5, 1, 3, 2, 4, 7, 9},
						{8, 5, 1, 3, 4, 9, 7, 2, 6},
						{4, 7, 3, 2, 5, 6, 8, 9, 1},
						{5, 6, 8, 4, 2, 7, 9, 1, 3},
						{5, 6, 8, 4, 2, 7, 9, 1, 3},
						{3, 4, 2, 9, 1, 5, 6, 8, 7},	
						{1, 9, 7, 5, 8, 3, 2, 5, 4}
			};

			showArray(arr);

	}

}
