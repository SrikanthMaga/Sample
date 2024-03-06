package org.phone;

public class InternalStorage {
public void processorName() {
	System.out.println("Processor Name");
}
public void ramSize() {
	System.out.println("Ram Size");
}
public static void main(String[] args) {
	InternalStorage internalStorage = new InternalStorage();
	ExternalStorage externalStorage = new ExternalStorage();
	internalStorage.processorName();
	internalStorage.ramSize();
	externalStorage.size();
}
}
