package org.emp;

public class Employee {
public void empId() {
	System.out.println("Emp Id");
}
public void empName() {
	System.out.println("Emp Name");
}
public void empDob() {
	System.out.println("Emp Dob");
}
public void empPhone() {
	System.out.println("Emp Phone");
}
public void empEmail() {
	System.out.println("Emp Email");
}
public void empAddress() {
	System.out.println("Emp Address");
}
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.empId();
	employee.empName();
	employee.empDob();
	employee.empPhone();
	employee.empEmail();
	employee.empAddress();

}
}
