package java_oops_concept;

import java.util.Scanner;

public class Pattern {
	public static void main(String ar[]) {
		Scanner scanner = new Scanner(System.in);

		int row = scanner.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}
}