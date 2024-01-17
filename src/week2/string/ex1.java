package week2.string;
/*
 * Chuong trinh loai bo ki tu 'a' khoi chuoi sau do dao chuoi
 */
public class ex1 {
	
	private static String rma(String s) {
		
		String res = "";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c != 'a') {
				res += c;
			}
		}
		
		return res;
	}
	
	private static String dn(String s) {
		String res = "";
		int n = s.length();
		for (int i = n - 1; i >=0; i--) {
			res += s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {

		String s_input = "Lap trinh java khong don gian";
		
		s_input = rma(s_input);
		s_input = dn(s_input);
		
		System.out.print(s_input);
	}

}
