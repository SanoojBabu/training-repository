package com.te.functionalinterfaces;

import java.util.Arrays;
import java.util.Comparator;

public class ApplicationEmp {

	public static void main(String[] args) {
		Employee[] empArray = { new Employee(5, "Sanju", 20, 10000), new Employee(1, "Kiran", 22, 50000),
				new Employee(8, "Ganga", 21, 30000), new Employee(2, "Lipi", 24, 45000) };
		Comparator compareId = (o1, o2) -> {
			Employee employee1 = (Employee) o1;
			Employee employee2 = (Employee) o2;
			return (employee1.geteId() > employee2.geteId()) ? 1 : (employee1.geteId() < employee2.geteId()) ? -1 : 0;
		};

		Arrays.sort(empArray, compareId);
		for (Employee employee : empArray) {
			System.out.println(employee);
		}

	}
}
