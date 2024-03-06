package org.college;
public class College {
public void collegeName() {
    System.out.println("College Name");
}
public void collegeCode() {
	System.out.println("College Code");
}
public void collegeRank() {
	System.out.println("College Rank");
}
public static void main(String[] args) {
	College college = new College();
	Dept dept = new Dept();
	Hostel hostel = new Hostel();
	Student student = new Student();
	college.collegeCode();
	college.collegeName();
	college.collegeRank();
	 dept.deptName();
	 hostel.hostelName();
	 student .studentName();
	 student .studentDept();
	 student .studentId();
	 }
}
