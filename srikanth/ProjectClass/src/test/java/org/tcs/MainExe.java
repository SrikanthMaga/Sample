package org.tcs;

public class MainExe {
public static void main(String[] args) {
	BaseClass.broweserLaunch();
	BaseClass.loadUrl(TestExe.dataRead(1, 0));
	BaseClass.maximize();
	BaseClass.sendKeys(Repositary.userName(),TestExe.dataRead(1,1));
	BaseClass.sendKeys(Repositary.passWord(),TestExe.dataRead(1, 2));
	
}
}
