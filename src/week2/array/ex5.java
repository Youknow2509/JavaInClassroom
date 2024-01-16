package week2.array;

/*
 *Loai bo phan tu co gia tri chia het cho 5 va khong chia het cho 3
 */

public class ex5 extends Use{
	
	private static boolean check(int x) {
		return x % 5 == 0 &&
				x % 3 != 0;
	}
	
	private static void rm(Integer[] arr, int i, int n) {
		for (int j = i; j < n - 1; j++) {
			swap(arr, j, j + 1);
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1, 5, 2, 15, 3, 10};
		
		showArray(arr);
		
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (check(arr[i])) {
				rm(arr, i, n);
				n--;
			}
		}
		
		showArray(arr, n);
	}
}
