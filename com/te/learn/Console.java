package com.te.learn;

import java.util.Scanner;
import com.te.learn.Calc;

public class Console {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean e = false;
		Calc cal = new Calc();
		do {
			System.out.println("CALCULATOR");
			System.out.println("Enter the operation:");
			System.out.println("1.ADD");
			System.out.println("2.SUBTRACT");
			System.out.println("3.MULTIPLY");
			System.out.println("4.DIVISION");
			System.out.println("5.EXIT");
			int x = sc.nextInt();
			switch (x) {
			case 1: {
				System.out.println("Enter the first number");
				int y = sc.nextInt();
				System.out.println("Enter the second number");
				int z = sc.nextInt();
				System.out.println("The result is " + cal.add(y, z));
				break;
			}
			case 2: {
				System.out.println("Enter the first number");
				int y = sc.nextInt();
				System.out.println("Enter the second number");
				int z = sc.nextInt();
				System.out.println("The result is " + cal.sub(y, z));
				break;
			}
			case 3: {
				System.out.println("Enter the first number");
				int y = sc.nextInt();
				System.out.println("Enter the second number");
				int z = sc.nextInt();
				System.out.println("The result is " + cal.mul(y, z));
				break;
			}
			case 4: {
				System.out.println("Enter the first number");
				int y = sc.nextInt();
				System.out.println("Enter the second number");
				int z = sc.nextInt();
				System.out.println("The result is " + cal.div(y, z));
				break;
			}
			case 5: {
				System.out.println("Thank you");
				e = true;
				break;
			}
			default: {
				System.out.println("Invalid Input");
				break;
			}
			}
		} while (!e);

	}
}
