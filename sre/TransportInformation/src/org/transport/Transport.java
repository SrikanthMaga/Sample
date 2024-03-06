package org.transport;

import org.road.Road;
import org.air.Air;
import org.water.Water;

public class Transport {
public void transportForm() {
	System.out.println("Transport Form");
	}
public static void main(String[] args) {
	Transport transpot = new Transport();
	transpot.transportForm();
	Air air = new Air();
	air.aeroPlane();
	air.heliCopter();
	Road road = new Road();
	Water water = new Water();
	road.bike();
	road.bus();
	road.car();
	road.cycle();
	water.boat();
	water.ship();}
}
