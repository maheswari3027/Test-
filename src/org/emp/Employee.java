package org.emp;

public class Employee {
	
	public void empId() {
		
		System.out.println("Employee id is 1");	
	}
	public void empName() {
		System.out.println("Employee Name is prabhu");
		
	}
	public void empDob() {
		System.out.println("Date of Birth 30/10/1986 ");
	}
	
	public void empPhone( ) {
		System.out.println("Moblie Number 123456879");
	}
    public void empEmail() {
    	System.out.println("employee@gmail.com");	
    }
    public void empAddress() {
    	System.out.println(" Address No.1,ManaliNew town,chennai-600103");
   		
    }
    public static void main(String[]args) {
    	Employee Details=new Employee();
    	Details.empId();
    	Details.empName();
    	Details.empDob();
    	Details.empEmail();
    	Details.empPhone();
    	Details.empAddress();
		
	}
    
}
