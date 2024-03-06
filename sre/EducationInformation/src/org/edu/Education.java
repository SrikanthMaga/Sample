package org.edu;

public class Education extends Arts{
public void ug() {
	System.out.println("UG: Bsc");
}
public void pg() {
	System.out.println("PG: MSC");
}
public static void main(String[] args) {
	Education edu = new Education();
	edu.ug();
	edu.pg();
	edu.ba();
	edu.bBA();
	edu.bED();
	edu.bsc();
	edu.bE();
	edu.bTech();
	edu.dental();
	edu.mbbs();
	edu.physiyo();
}
}
