package week2.array;

/*
 * sap xep lai day so sao cho gia tri tuyet doi cua cac phan tu tang dan
 */

class qs  extends Use{
	private int partition(Integer[] arr, int s, int e) {
		int pivot = Math.abs(arr[e]);
		int i = s;
		for (int j = s; j < e; j++) {
			if (Math.abs(pivot) > Math.abs(arr[j])) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, e);
		return i;
	}
	public void sort(Integer[] arr, int s, int e) {
		if (s < e) {
			int p = partition(arr, s, e);
			sort(arr, s, p - 1);
			sort(arr,p + 1, e);
			
		}
	}
}


public class ex4 extends Use{
	
	
	public static void main(String[] args) {
		Integer[] arr = {1, 3, 2, 4 , 3, -6, 7, 4, 9};
		
		showArray(arr);
		
		qs s = new qs();
		
		s.sort(arr, 0, arr.length - 1);
		
		showArray(arr);

	}
	
}

