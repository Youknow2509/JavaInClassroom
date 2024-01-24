package week3;

import java.util.Random;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		int[][] res = new int[10][10];
		String[][] show  = new String[10][10];
		
		show = fillStringShow();
		res = creatArr();
		
		
		showArr(show);
		showArr(res);

		int numberOne = countone(res);
		Scanner sc = new Scanner(System.in);

		while (numberOne != 0) {
			int row, col;
			showArr(show);
			System.out.println("Nhap gia tri x, y: ");
			row = sc.nextInt();
			col = sc.nextInt();

			if (res[row][col] == 1) { // Ban trung tau
				res[row][col] = 0;
				show[row][col] = "*";
				numberOne--;
			} else {
				System.out.println("Ban da ban sai");
				System.out.println("So tau xung quanh; " + locationcount(res, row, col));
			}
		}
		System.out.print("Winner !!!");
	}
	
	private static String[][] fillStringShow() {
		String[][] res = new String[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				res[i][j] = "-";
			}
		}
		return res;
	}

	private static int locationcount(int[][] arr, int row, int col) {
		int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i == row && j == col) {
                    continue;
                }
                if (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length) {
                    if (arr[i][j] == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
	}

	private static int countone(int[][] arr) {
		int r = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (arr[i][j] == 1) {
					r++;
				}
			}
		}
		return r;
	}

	private static void showArr(int[][] arr) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	private static void showArr(String[][] arr) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static int[][] creatArr() {
		int[][] res = new int[10][10];

		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				res[i][j] = r.nextInt(2);
			}
		}

		return res;
	}

}
