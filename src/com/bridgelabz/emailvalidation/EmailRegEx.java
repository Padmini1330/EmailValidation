package com.bridgelabz.emailvalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailRegEx 
{

	public static boolean emailValidator(String emailAddress) 
	{
		Pattern pattern=Pattern.compile("^[a-zA-Z]*[@]{1}[a-zA-Z]*[.]{1}[a-zA-Z]*$"); 
		Matcher matcher=pattern.matcher(emailAddress);
		return matcher.matches();
	}

	public static void main(String[] args) 
	{
		System.out.println("**Welcome to Email Evaluator**");
		
		String emailAddress="abc@bridgelabz.co";
		
		boolean isValidEmail=emailValidator(emailAddress);
		if(isValidEmail)
			System.out.println("Email address "+emailAddress+" is VALID");
		else
			System.out.println("Email address "+emailAddress+" is INVALID");

	}

}