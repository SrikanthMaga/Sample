package org.phone;

public class PhoneInfo {
public void phoneName() {
	System.out.println("Phone Name");
}
public void phoneMieiNum() {
	System.out.println("Phone Miei Num");
}
public void camera() {
	System.out.println("Camera");	
}
public void storage() {
	System.out.println("Storage");
}
public void osName() {
	System.out.println("Os Name");	
}
public static void main(String[] args) {
	PhoneInfo phoneInfo = new PhoneInfo();
	phoneInfo.phoneName();
	phoneInfo.phoneMieiNum();
	phoneInfo.camera();
	phoneInfo.storage();
	phoneInfo.osName();
	
}
}
