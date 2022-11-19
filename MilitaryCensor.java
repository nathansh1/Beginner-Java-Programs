/*started: 8/9/2022 3:18pm
*finished: 8/10/2022 7:57pm
*using StringTokenizer class methods
*/

import java.util.StringTokenizer;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.*;


public class MilitaryCensor{
	public static void main(String[] args){
	
		boolean b = true;
		Scanner scr = new Scanner(System.in);
		
		String input;
		
		while(b){
		
			input = scr.nextLine();
			if(input.equals("exit"))
				break;
			
			Censor.examine(input);
		
		}
			
			
	
	}
}

class Censor{

	public static void examine(String email){
		
		StringTokenizer t = new StringTokenizer(email, " .,-_");
		
		int x = 0;
		
		while(t.hasMoreTokens())
			switch(t.nextToken().toLowerCase()){
			
				case "hermes":
				case "bridge":
				case "muddy":
				case "river":
				case "assault":
				case "offensive":
					x++;
					break;
	
			}
		
		if(x>0)
			out.println(">>>REJECTED");
		else
			out.println(">>>OK");
		
	}

}