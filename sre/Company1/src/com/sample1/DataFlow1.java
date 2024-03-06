package com.sample1;

import java.util.Scanner;

public class DataFlow1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);	
	System.out.println("Rsume:");
	int a = sc.nextInt();
	System.out.println("Emp Id:" +a);
	String b = sc.next();
	System.out.println("Emp Name:" +b);
	String  c = sc.next();
	System.out.println("Emp Email:" +c); 
	long d = sc.nextLong();
	System.out.println("Emp Phone No:" +d);
	float e = sc.nextFloat();
	System.out.println("Emp Salary:" +e);
	String g = sc.next();
	System.out.println("Emp Gender:" +g);
	String h = sc.next();
	System.out.println("Emp City:" +h);
sc.close();

}
}
