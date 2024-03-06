package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("TAMIL LANGUAGE");
	}
	public void englishLanguage() {
		System.out.println("ENGLISH LANGUAGE");
	}
	public void hindhiLanguage() {
		System.out.println("HINDHI LANGUAGE");
	}
	public static void main(String[] args) {
		LanguageInfo li = new LanguageInfo();
	li.tamilLanguage();
	li.englishLanguage();
	li.hindhiLanguage();
	li.southIndia();
	li.northIndia();
	}
	
	
}	


