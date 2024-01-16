package week2;

/*
 * Giai phuong trinh bac 2 dang: ax^2 + bx + c = 0
 */
public class ptbac2 {

	public static void main(String[] args) {
		
		double[] arr = {1, -3, 2};
		
		double d = arr[1]*arr[1] - 4*arr[0]*arr[2];
		
		if (d > 0) {
			System.out.println("Phuong trinh co 2 nghiem phan biet la: ");
			System.out.println("\tx1 =" + (-arr[1] + Math.sqrt(d))/2*arr[0] + 
								", x2 = " + (-arr[1] - Math.sqrt(d))/2*arr[0]);
		} else if ( d == 0) {
			System.out.println("Phuong trinh co nghiem kep la: " + -arr[1]/(2*arr[0]));
		} else {
			System.out.println("Pt vo nghiem");
		}
		
	}

}
