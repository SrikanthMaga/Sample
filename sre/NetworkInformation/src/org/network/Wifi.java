package org.network;

public class Wifi {
public void wifiName() {
	System.out.println("Wifi Name");
}
public static void main(String[] args) {
	Wifi wifi = new Wifi();
	wifi.wifiName();
	MobileData mobileData = new MobileData();
	mobileData.dataName();
	Lan lan = new Lan();
	lan.lanName();
	WireLess wireLess = new WireLess();
	wireLess.modemName();
	
	
}
}
