package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
public void empName() {
	System.out.println("Emp Name");
}
public static void main(String[] args) {
	Project project = new Project();
	Client client = new Client();
	Company company = new Company();
	Employee employee = new Employee();
	project.projectName();
	client.clientName();
	company.companyName();
	employee.empName();
}
}