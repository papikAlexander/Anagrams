package Application.utils;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by alex on 31.08.17.
 */
public class ApplicationUtils {

	public static String enterString(){
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static String trimAndLowerCaseString(String s){
		return s.trim().toLowerCase();
	}

	public static boolean stringLength(String s1, String s2){
		return s1.length() == s2.length();
	}

	public static String sortString(String s1){
		char[] chars = s1.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public static boolean checkAnagrams(String s1, String s2){

		s1 = trimAndLowerCaseString(s1);
		s2 = trimAndLowerCaseString(s2);

		if (!stringLength(s1, s2)){
			System.out.printf("Words \"%s\" and \"%s\" don't anagrams. Words different length.", s1, s2);
			return false;
		} else if (s1.equals(s2)){
			System.out.printf("Words \"%s\" and \"%s\" don't anagrams. Words equals.", s1, s2);
			return false;
		}

		String sortString1 = sortString(s1);
		String sortString2 = sortString(s2);

		if (sortString1.equals(sortString2)){
			System.out.printf("Word \"%s\" and \"%s\" anagrams", s1, s2);
			return true;
		} else {
			System.out.printf("Words \"%s\" and \"%s\" don't anagrams", s1, s2);
			return false;
		}

	}

}
