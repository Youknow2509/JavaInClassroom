package week2;

import java.util.ArrayList;

/*
 * Tim so co gia tri thu n trong day Fibonacci
 */

public class fibonacci1 {
	
	public static void showArray(ArrayList<Integer> arr) {
		
		System.out.print("Array: ");
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static int creatArrayFibonacci(int n, ArrayList<Integer> arr) {
		
		if (n == 0 || n == 1) {
			return 1;
		}
		for (int i = 2; i <= n; i++) {
		//	arr[i] = arr[i-1] * arr[2];
			arr.add(arr.get(i - 1)+arr.get(i - 2));
		}
		
		return arr.get(n);
	}

	public static void main(String[] args) {

		int n = 5;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		
		int res = creatArrayFibonacci(n, arr);
		
		showArray(arr);
		
		System.out.println("Gia tri phan tu thu " + n + "trong day Fibonacci la: " + res);
	}

}
