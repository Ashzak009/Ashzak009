package com.eshipz.qa.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForSpecialChar 
{
	public static boolean onlySpecialCharacters(
			String str)
	{

		// Regex to check if a string contains
		// only special characters
		String regex = "[^a-zA-Z0-9]+";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// then print No
//		if (str == null) {
//			System.out.println("No");
//			return;
//		}

		// Find match between given string
		// & regular expression
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		return m.matches();
		
	}

//	// Driver Code
//	public static void main(String args[])
//	{
//		// Given string str
//		String str = "u";
//
//		// Function Call
//		onlySpecialCharacters(str);
//	}
}

