package com.company;

public class Main {

	public static void main(String[] args) {
		System.out.println("z5");
		double sum = 1000;
		double proc = 0.02;
		int years = 1;
		while (years <= 10) {
			sum = sum + (sum * proc);
			years++;

		}
		System.out.println("Итого " + sum);
		System.out.println("z4");
		int a = 5;
		int p = a ;
		 for (int b=1; b<=3; b++){
			p=p*a;

		}
		System.out.println("Число в степени равно " + p);


		System.out.println("Z6");

		for (int x = 1; x <= 100; x++) {
			if (x % 21 == 0) {
				System.out.println(x);
			}
		}
		System.out.println(" dop1");
		for (int y = 1; y <= 100; y++) {
			if (y % 3 == 0 || y % 5 == 0 && y % 15 !=0) {
				System.out.println(y);
			}


		}

	}
}