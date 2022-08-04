package org.emp;

import java.util.Scanner;

public class EmployeeDetails {
	//Scanner Example

	public static void main(String[] args) {
		Scanner Emp=new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		byte empId=Emp.nextByte();
		System.out.println("Enter the Employee Phone Number");
		int empPhoneno=Emp.nextInt();
		System.out.println("Enter the Salary");
		int empSalary=Emp.nextInt();
		System.out.println("Enter the Employee Gender");
		String empGender=Emp.next();
		System.out.println("Enter the Employee City");
		String empCity=Emp.next();
		System.out.println("Enter the Emplyee Email");
		String empEmail=Emp.next();
		System.out.println("Enter the Employee Name");
	    String empName=Emp.next();
	    
		    
		    System.out.println("Employee Id " + empId);
	        System.out.println("Employee Name " + empName );
	        System.out.println("Employee Email "+ empEmail );
	        System.out.println("Employee Phone Number " +empPhoneno);
	        System.out.println("Employee Salary " + empSalary );
	        System.out.println("Employee Gender " +empGender );
	        System.out.println("Employee City " +empCity );
	        
	     
      

	}

}
