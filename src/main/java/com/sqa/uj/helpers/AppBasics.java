/**
 * File Name: AppBasics.java<br>
 * Kaur, UJ<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 4, 2017
 */
package com.sqa.uj.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Kaur, UJ
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String appName, String user) {
		System.out.println("Thank you for using the " + appName + " " + user + ", have a great day!");
	}

	/**
	 * 
	 */
	public static String welcomeUserAndGetName(String appName) {
		System.out.println("Welcome to the " + appName + " application.n");
		System.out.print("Can I get your name? ");
		return scanner.nextLine();
	}
}