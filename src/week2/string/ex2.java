package week2.string;

public class ex2 {
	
	private static void showString(String[] s) {
		System.out.println("Array string: ");
		for (String i : s) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static boolean isValidNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	private static int solve(String input) {
		String[] s = input.split(" ");
		int c = 0; 
		
		for (String i : s) {
			if (!isValidNumber(i)) {
				return -1;
			}
			c++;
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		String input = "2 34.5 -12.9 0 12 1.98 ";
		
		int c = solve(input);
		
		if (c == -1) {
			System.out.println("False");
		} else {
			System.out.println("Input co " + c + " so.");
		}
		
	}

}
