package week2;

import java.util.ArrayList;

/*
 * Tim co gia tri gan nhat co gia tri n trong day Fibonacci
 */

public class fibonacci2 extends fibonacci1{
	
	public static int solve(int n, ArrayList<Integer> arr) {
		
		if (n <= 1) {
			return 1;
		}
		int i = 1;
		while (arr.get(i) < n) {
			i += 1;
			arr.add(arr.get(i - 1)+arr.get(i - 2));
		}
		
		return Math.abs(arr.get(i) - n) < Math.abs(arr.get(i - 1) - n) ?
				arr.get(i) :
				arr.get(i - 1);
	}

	public static void main(String[] args) {

		int n = 10;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		
		System.out.println(solve(n, arr));
		showArray(arr);
	}
}
