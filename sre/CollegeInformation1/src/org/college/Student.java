package org.college;

public class Student extends College {
public void studentName() {
	System.out.println("STUDENT NAME: aaa");
}
public void studentDept() {
	System.out.println("STUDENT DEPT: bbb");
}
public void studentId() {
	System.out.println("STUDENT ID: xxx");
}

public static void main(String[] args) {
	Student stu = new Student();
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.studentName();
	stu.studentId();
	stu.studentDept();
	stu.hostleName();
	stu.deptName();
	
}
}
