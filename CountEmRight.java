/*7/27/2022
*using arrays and regexes and stuff ykyk
*/

import java.util.Scanner;
import java.io.*;

public class CountEmRight{
	public static void main(String args[]){
	
		Scanner scr = new Scanner(System.in);
		
		String harmless = "30vuCRZzvlqRg7YJ";
		
		String s;
		
		int occ;
		
		while(true){
			
			s = scr.nextLine().toUpperCase();
			
			if(s.equals("EXIT"))
				break;
				
				
			s = s.concat(harmless);
			
			String[] sp = s.split("S\\s*A");
			
			occ = sp.length-1;
			
			if(occ==1)
				System.out.println("There is " + occ + " occurence.");
			else
				System.out.println("There are " + occ + " occurences.");
			

			
		}
	}
}