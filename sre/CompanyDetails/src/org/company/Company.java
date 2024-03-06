package org.company;
import org.client.Client;
public class Company extends Client {
	public void companyName() {
		System.out.println("COMPANY NAME : SOS");
	}
public static void main(String[] args) {
	Company com = new Company();
	com.companyName();
	com.clientName();
}
}
