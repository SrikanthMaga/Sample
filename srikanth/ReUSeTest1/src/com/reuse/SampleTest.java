package com.reuse;

public class SampleTest  {
	public static void main (String [] args) {
		BaseClass.setEnvironment();
		BaseClass.browserLaunch();
		BaseClass.loadUrl(SendData.url);
		}
		}

