package org.allvechicle;

import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
import org.fourwheeler.FourWheeler;

public class Vehicle {
public void vehicleNecessery() {
	System.out.println("Vehicle Necessary");
}
public static void main(String[] args) {
	Vehicle vehicle = new Vehicle();
	vehicle.vehicleNecessery();
	FourWheeler fourWheeler = new FourWheeler();
	fourWheeler.car();
	fourWheeler.bus();
	fourWheeler.lorry();
	ThreeWheeler threeWheeler = new ThreeWheeler();
	threeWheeler.auto();
	TwoWheeler twoWheeler = new TwoWheeler();
	twoWheeler.bike();
	twoWheeler.cycle();
}
}
