package week2.array;

public class Use {
	public static <T> void showArray(T[] arr) {
		System.out.print("Array: ");
		for (T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static <T> void swap(T[] arr, int a, int b) {
		int n = arr.length;
		if (a < 0 && a >= n && b < 0 && b > n) {
			System.out.println("Index err");
		} else {
			T t = arr[a];
			arr[a] = arr[b];
			arr[b] = t;
		}
	}
}
