package week2.sodoku;

import week2.sodoku.assets.SudokuGenerator;
/*
 * Main game Sodoku
 */

public class Sodoku extends SudokuGenerator{

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

	private static void cleanScreen() {
		// Kiem tra he dieu hanh cua nguoi xu dung
		String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            System.out.print("\f");
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            System.out.print("\033[H\033[2J");
        } 
	}

	public static void main(String[] args) {
			

			int[][] arr = generateSudoku();
			

			cleanScreen();
			
			showArray(arr); 
			
	}

}
