package com.test.reuse;

public class SampleTest1 {
public static void main(String[] args) {
	BasseClass.setEnvironment();
	BasseClass.launchDriver();
	BasseClass.maximise();
	BasseClass.loadUrl(TestData.url);
	BasseClass.sendData(LoginRepositry.userName(),TestData.userName  );
	BasseClass.sendData(LoginRepositry.password(), TestData.password);
	BasseClass.click(LoginRepositry.click());

}
}
