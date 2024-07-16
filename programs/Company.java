package com.chainsys.programs;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String companyName;
//	private Employee[] array;
	private ArrayList<Employee> list;
	private int numEmployee;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

//	public Employee[] getArray() {
//		return array;
//	}
//
//	public void setArray(Employee[] array) {
//		this.array = array;
//	}
	

	public int getNumEmployee() {
		return numEmployee;
	}

	public void setNumEmployee(int numEmployee) {
		this.numEmployee = numEmployee;
	}

	public ArrayList<Employee> getList() {
		return list;
	}

	public void setList(ArrayList<Employee> list) {
		this.list = list;
	}
	public Company(String companyName, int numEmployee, ArrayList<Employee> list) {
		this.companyName = companyName;
		this.numEmployee = numEmployee;
		this.list = list;
	}

//	public Company(String companyName, Employee[] array, int numEmployee) {
//		super();
//		this.companyName = companyName;
//		this.array = array;
//		this.numEmployee = numEmployee;
//	}

	public double getAverageSalary(ArrayList<Employee> list) {
		double salary = 0;
		int count=0;
	
		for(Employee employees:list) {
			
			salary+=employees.getSalary();
			count++;
//			System.out.println("a"+salary);

		}
		double averageSalary=salary/count;
//		System.out.println("a"+salary);
//		System.out.println("b"+count);

		return averageSalary;
	
	}
	
	public double getMaxSalary(ArrayList<Employee> list) {
	    double maxSalary = 0;
	    
	    for (Employee employees : list) {
	        double salary = employees.getSalary();
	        if (salary > maxSalary) {
	            maxSalary = salary;
	        }
	    }
	    
	    return maxSalary;
	}

	
	public List<Employee> getEmployeesByDesignation(String designation) {
	    List<Employee> employeesDesignation = new ArrayList<>();
	    
	    for (Employee employee : list) {
	        if (employee.getDesignation().equalsIgnoreCase(designation)) {
	        	employeesDesignation.add(employee);
	        }
	    }
	    
	    return employeesDesignation;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", list=" + list + ", numEmployee=" + numEmployee + "]";
	}


	



	

}
