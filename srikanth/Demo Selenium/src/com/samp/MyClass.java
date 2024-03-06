package com.samp;

	public class MyClass {
	    // Instance variable
	    private int myVariable;

	    // Constructor (parameterized)
	    public MyClass(int initialValue) {
	        this.myVariable = initialValue;
	        System.out.println("Constructor called with initial value: " + initialValue);
	    }

	    // Another constructor (default or no-argument)
	    public MyClass() {
	        this.myVariable = 0;
	        System.out.println("Default constructor called.");
	    }

	    // Method to get the value of myVariable
	    public int getMyVariable() {
	        return myVariable;
	    }

	    public static void main(String[] args) {
	        // Creating objects and calling constructors
	        MyClass obj1 = new MyClass(10);  // Parameterized constructor
	        MyClass obj2 = new MyClass();    // Default constructor

	        // Accessing instance variables using methods
	        System.out.println("Value of myVariable in obj1: " + obj1.getMyVariable());
	        System.out.println("Value of myVariable in obj2: " + obj2.getMyVariable());
	    }
	}

