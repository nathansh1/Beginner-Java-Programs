/*7/19/2022
*simple string concats
*/

import java.util.Scanner;
import java.io.*;

public class FullName{
	public static void main(String[] args){
	
		Scanner scr = new Scanner(System.in);
		System.out.println("\n\nWhat's your first name? ");
		String fName = scr.next();
		System.out.println("\nWhat's your last name? ");
		String lName = scr.next();
		System.out.println("\nYour full name is " + fName + " " + lName);
	
	}
}