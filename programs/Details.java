package com.chainsys.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Company Name:");
		String companyname=input.next();
		
		System.out.println("Enter the No.Of.Employees:");
		int noOfEmployees=input.nextInt();
		
		ArrayList<Employee> list= new ArrayList<Employee>();
	
		for(int i=1;i<=noOfEmployees;i++) {
			Employee employee=new Employee();

			System.out.println("Enter Id:");
			int id=input.nextInt();
			employee.setId(id);
		
		   
			
			System.out.println("Enter the Name:");
			String name=input.next();
			employee.setName(companyname);
			
			System.out.println("Enter Designation:");
			String designation=input.next();
			employee.setDesignation(designation);
			
			System.out.println("Enter the salary");
			Double salary=input.nextDouble();
			employee.setSalary(salary);
			
			list.add(employee);

		}
		
		Company company=new Company(companyname,noOfEmployees,list);
	
		
//	  System.out.println( employee.getSalary());
//      System.out.println(employee.getDesignation());  
       
	
        System.out.println("Average Salary"+company.getAverageSalary(list));
		System.out.println("Maximum Salary"+company.getMaxSalary(list));

        
        System.out.println("Enter the designation");
        String designation=input.next();
        System.out.println(company.getEmployeesByDesignation(designation).toString());
        
        
	}

}
