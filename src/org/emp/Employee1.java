package org.emp;

public class Employee1 {
	//overloading
   
	public void empId(String a,int b ) {
		System.out.println(a);
	}
	public void empId(int a,String b) {
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.empId("sindu",101);
        emp.empId(102,"Yoshika");		

	}

}
