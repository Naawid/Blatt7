package h2;

import java.util.Arrays;

public class H2_main {
	static int[] a = { 2, 7, 1, 9 };
	static int[] b = { 2, 7, 1, 9 };

	public static void main(String args[]) {
		System.out.println(Arrays.toString(change(a, b, 2, 4)));
	}

	public static int[] change(int[] a, int[] b, int start, int end) {

		if (end > start) {
			if (Arrays.compare(a, b) == 0) {
				Arrays.sort(a);
				return Arrays.copyOfRange(a, start, end);
			} else {
				return Arrays.copyOf(a, a.length);
			}

		}
		return new int[0];
	}
}
