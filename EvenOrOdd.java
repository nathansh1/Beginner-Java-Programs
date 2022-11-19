/*7/19/2022
*basic if statement
*/

import java.util.Scanner;
import java.io.*;

public class EvenOrOdd{
	public static void main(String args[]){
	
		Scanner scr = new Scanner(System.in);
		
		System.out.print("\nEnter an integer: ");
			int num = scr.nextInt();
		
		if (num%2 == 0)
			System.out.println("\nThe integer " + num + " is even.");
		else
			System.out.println("\nThe integer " + num + " is odd.");
	
	}
}