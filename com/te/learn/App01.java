package com.te.learn;

/*this is a comment*/
/*this a comment*/

public class App01 {
	public static void main(String[] args) {
		System.out.println();

		int a = 10;
		byte b = 9;
		float f = 98.99f;
		double d = 123.987d;
		long l = 34567l;
		double result = a + b + d + f + l;
		System.out.println("Result=" + result);

		double dd = 5.0d;
		int ii = 2;
		double res = dd / ii;
		System.out.println("Result=" + res);

		boolean b1;
		boolean b2 = true;

		/* This is not allowed */
		/* boolean b3=b1+b2; */
		byte a1 = 10;
		byte a2 = 11;
		int a3 = a1 + a2;

		short a4 = 10;
		short a5 = 11;
		int a6 = a4 + a5;

		char c1 = 'a';
		char c2 = 'b';
		char c3 = (char) (c1 + c2);
		int i1 = c1 + c2;
		System.out.println("resultant char and integer is" + c3 + i1);

		char ca = 'A';
		char cb = 'B';
		char cc = (char) (ca + cb);
		int i2 = ca + cb;
		System.out.println("resultant char and integer is" + cc + i2);

		int x = 10;
		int z = 20;
		int v = ++x + z++;
		System.out.println(v);

		int x1 = 10;
		int z1 = 20;
		int v1 = x1++ + ++z1;
		System.out.println(v1);

		boolean res2 = (a1 <= 10) ? true : false;
		if (res2) {
			System.out.println(a1 + " is greater/equal to 10");
		} else {
			System.out.println(a1 + " is less than 10");
		}

	}
}