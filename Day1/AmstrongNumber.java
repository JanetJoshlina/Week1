package week1.day1;

public class AmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		double calculated = 0;
		double remainder;
		int original = num;
		while (original > 0) {
			remainder = original % 10;
			original = original / 10;
			calculated = calculated + Math.pow(remainder, 3);
		}

		if (calculated == num) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
