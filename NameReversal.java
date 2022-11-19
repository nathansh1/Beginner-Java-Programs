/*7/19/2022
*for loop practice
*/

import java.util.Scanner;
import java.io.*;

public class NameReversal{
	public static void main(String[] args){
	
	Scanner scr = new Scanner(System.in);
	
	System.out.print("\nPlease enter your name.\t");
		String name = scr.next();
	
	for(int i = name.length()-1; i >= 0; i--){
		
		System.out.print("\n\t" + name.charAt(i));
		
	}
	System.out.println("\n");
	
	}
}