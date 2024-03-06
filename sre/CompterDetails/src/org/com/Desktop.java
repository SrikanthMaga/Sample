package org.com;

public class Desktop extends Computer {
public void desktop() {
	System.out.println("DESKTOP SIZE: 1920px*1080px ");
}
public static void main(String[] args) {
	Desktop dt = new Desktop();
	dt.computerModel();
	dt.desktop();
	
}
}
