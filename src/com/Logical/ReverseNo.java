package com.Logical;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {

		int n, r;
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while (n > 0) {
			r = n % 10;
			System.out.print(r);
			n = n / 10;
		}
	}

}
