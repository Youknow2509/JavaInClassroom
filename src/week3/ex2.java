package week3;

import java.util.ArrayList;
import java.util.List;

// Cho day fibonaccy tinh 



public class ex2 {
	
	private static int stage(int a, int b) {
		if (a > b) {
			return 1;
		} else if (a < b) {
			return 0;
		} 
		return 0;
		
	}
	
	private static int[] solveArr(int[] arr){
		List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                resultList.add(arr[i]);
            }
        }
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
	}

	private static void showArr(int[] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 3, 5, 2, 7, 0, 8, 8, 5}; // 1 3 2 7 0 8 5
		
		arr = solveArr(arr);
		
		showArr(arr);
		
		int stage = stage(arr[0], arr[1]);
		int n = arr.length;
		int c = 1;
		
		for (int i = 2; i < n; i++) {
			int stageTemp = stage(arr[i - 1], arr[i]);
			if (stage != stageTemp) {
				c++;
				stage = stageTemp;
			}
		}
		
		System.out.print(c);
	}

}
