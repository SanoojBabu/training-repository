package com.te.functionalinterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ApplicationEmpSwitch {
	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Option:");
		System.out.println("1.On basis of ID");
		System.out.println("2.On basis of Salary");
		System.out.println("3.On basis of Age");
		i = scan.nextInt();
		Employee[] empArray = { new Employee(5, "Sanju", 20, 10000), new Employee(1, "Kiran", 22, 50000),
				new Employee(8, "Ganga", 21, 30000), new Employee(2, "Lipi", 24, 45000) };
		Comparator compareId = (o1, o2) -> {
			Employee employee1 = (Employee) o1;
			Employee employee2 = (Employee) o2;
			return (employee1.geteId() > employee2.geteId()) ? 1 : (employee1.geteId() < employee2.geteId()) ? -1 : 0;
		};

		Comparator compareSalary = (o1, o2) -> {
			Employee employee1 = (Employee) o1;
			Employee employee2 = (Employee) o2;
			return (employee1.geteSalary() > employee2.geteSalary()) ? 1
					: (employee1.geteSalary() < employee2.geteSalary()) ? -1 : 0;
		};

		Comparator compareAge = (o1, o2) -> {
			Employee employee1 = (Employee) o1;
			Employee employee2 = (Employee) o2;
			return (employee1.geteAge() > employee2.geteAge()) ? 1
					: (employee1.geteAge() < employee2.geteAge()) ? -1 : 0;
		};
		switch (i) {
		case 1:
			Arrays.sort(empArray, compareId);
			for (Employee employee : empArray) {
				System.out.println(employee);
			}
			break;
		case 2:
			Arrays.sort(empArray, compareSalary);
			for (Employee employee : empArray) {
				System.out.println(employee);
			}
			break;
		case 3:
			Arrays.sort(empArray, compareAge);
			for (Employee employee : empArray) {
				System.out.println(employee);
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}

	}
}
