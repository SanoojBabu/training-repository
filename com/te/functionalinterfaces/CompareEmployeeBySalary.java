package com.te.functionalinterfaces;

import java.util.Comparator;

public class CompareEmployeeBySalary implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee employee1 = (Employee) arg0;
		Employee employee2 = (Employee) arg1;
		if (employee1.geteSalary() > employee2.geteSalary())
			return 1;
		else if (employee1.geteSalary() < employee2.geteSalary())
			return -1;
		return 0;
	}

}
