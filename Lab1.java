package com.company;

import sun.security.krb5.internal.CredentialsUtil;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		/*
    	int a;
		String imie;
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		a = in.nextInt();
		System.out.println("Podaj imie: ");
		imie = in.nextLine();
		System.out.println("Liczba rzeczywista");
		double c = in.nextDouble();
		float c11 = in.nextFloat();
		*/

		System.out.println("Wiek: " + wiek());
		System.out.println("Imie: " + imie());

		Random rand = new Random();
		int a = rand.nextInt(11); //[0,10]
		int b = rand.nextInt(15) - 10; //-10 4
		int c = rand.nextInt(26) + 5; //5 3
		System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
		kalkulator(a, b);
		System.out.println(parzysta(b));
		System.out.println(podzielna(b));
		System.out.println(potega(b));
		System.out.println(pierwiastek(b));


		int a1,b1,x,y,z;
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj a: ");
		a1 = in.nextInt();
		System.out.println("Podaj b: ");
		b1 = in.nextInt();

		x = rand.nextInt(b1 + 1 - a1) + a1;
		y = rand.nextInt(b1 + 1 - a1) + a1;
		z = rand.nextInt(b1 + 1 - a1) + a1;

		System.out.println("x: " + x + "\ny: " + y + "\nz: " + z);
		System.out.println(trojkat(x,y,z));

	}

	public static int wiek() {
		return 12;
	}

	public static String imie() {
		return "Karol";
	}

	public static void kalkulator(int a, int b) {
		System.out.println("Suma: " + (a + b));
		System.out.println("Roznica: " + (a - b));
		System.out.println("Iloczyn: " + (a * b));
		if (b != 0) {
			System.out.println("Iloraz: " + (a / b));
		} else System.out.println("Dzielenie przez 0!!!");
	}

	public static boolean parzysta(int a) {
		return (a % 2 == 0);
	}

	public static boolean podzielna(int a) {
		return (a % 3 == 0 && a % 3 == 0);
	}

	public static double potega(int a) {
		return Math.pow(a,3);
	}

	public static double pierwiastek(int a) {
		return Math.sqrt(a);
	}

	public static boolean trojkat(int a, int b, int c) {
		return (a + b <= c || a + c <= b || b + c <= a);
	}
}