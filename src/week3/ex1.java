package week3;

import java.util.ArrayList;

// Cho day fibonaccy tinh 

public class ex1 {

	public static void main(String[] args) {
		
		int b = 20,
			a = 10;
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		
		for (int i = 2; ; i++) {
			arr.add(i, arr.get(i - 1)+arr.get(i - 2));
			if (arr.get(i) > b) {
				break;
			}
		}
		
		int e = arr.size() - 2;
		int s = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (a <= arr.get(i)) {
				s = i;
				break;
			}
			
		}
		int res = 0;
		for (int i = s; i <= e; i++) {
				System.out.print(arr.get(i) + " ");
				res += arr.get(i);
			}
		System.out.print(res);
	}

}
