package com.sample2;

import java.util.Scanner;

public class DataFlow2 {
public static void main(String[] args) {
	Scanner sr = new Scanner (System.in);
	System.out.println("Student Information: ");
	int a = sr.nextInt();
	System.out.println("Student Id: " +a);
	String b = sr.next();
	System.out.println("Student Name: " +b);
	String c = sr.next();
	System.out.println("Student Email: " +c);
	long d = sr.nextLong();
	System.out.println("Student Phone No:" +d);
	String e = sr.next();
	System.out.println("Student Dept: " +e);
	String f = sr.next();
	System.out.println("Student Gender: " +f);
	String g = sr.next();
	System.out.println("Student City: " +g);
	sr.close();
			
}
}
