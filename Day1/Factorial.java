package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		int i = 1;
		while (i <= num) {
			System.out.println("Factorial Numbers: " + i);
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial Value: " + fact);
	}
}
