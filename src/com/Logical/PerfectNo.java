package com.Logical;

import java.util.Scanner;

public class PerfectNo {
	private static Scanner sc;

	public static void main(String[] args) {
		int i, Number, Sum = 0;
		sc = new Scanner(System.in);
		System.out.println(" Enter any Number ");
		Number = sc.nextInt();

		for (i = 1; i < Number; i++) {
			if (Number % i == 0) {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format(" Perfect Number", Number);
		} else {
			System.out.format("Perfect Number", Number);
		}
	}

}
