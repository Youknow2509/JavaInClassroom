package week3;

public class ex3 {

	public static void main(String[] args) {
		
		String s = "abc 1j23 113 dae 20";
		String[] arr = s.split(" ");
		double res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (isValidNumber(arr[i])) {
				res += Integer.parseInt(arr[i]);
			}
		}
		
		System.out.print(res);
		
	}
	
	public static boolean isValidNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	

}
