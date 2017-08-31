package Application;

import Application.utils.ApplicationUtils;

/**
 * Created by alex on 31.08.17.
 */
public class Main {
	public static void main(String[] args) {

		System.out.println("Enter first word:");
		String s1 = ApplicationUtils.enterString();

		System.out.println("Enter second word:");
		String s2 = ApplicationUtils.enterString();

		ApplicationUtils.checkAnagrams(s1,s2);
	}
}
