package week2;

/*
 * S = 1 + nx/1! + n(n-1)x^2/2@ + ... + n!x^n/n!
 */

public class Sum {
	
	private static long gt(int a) {
		if (a == 0) {
			return 1;
		}
		return a*gt(a - 1);
	}
	private static long lt(int a, int x) {
		if (x == 0) {
			return 1;
		}
		return a*lt(a, x - 1);
	}
	private static long solve(int n, int x) {
		
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1 + x;
		}
		long res = 1 + (long) n *x;
		long temp = n;
		
		for (int i = 2; i <= n; i++) {
			temp *= temp - i + 1;
			res += temp*lt(x, i)/gt(i);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2,
				x = 3;
		long res = solve(n, x);
		
		System.out.print(res);
	}

}
