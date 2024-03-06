package org.bank;

public class BankInfo extends AxisBank {
public void savings() {
	System.out.println("SAVING");
}
public void fixed() {
	System.out.println("FIXED");
}
public static void main(String[] args) {
	BankInfo bi = new BankInfo();
	bi.savings();
	bi.fixed();
	bi.deposit();
}
}
