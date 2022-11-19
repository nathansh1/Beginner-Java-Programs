/*
started: 8/13/2022 8:44am
finished: 8/13/2022 9:04 am
trying input from text files
im surprised that worked
*/

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class FileTester{
	public static void main(String[] args) throws IOException{
	
		Scanner sf = new Scanner(new File("/Users/user/Terminal/Folder/temp_Nathan/MyData.txt"));
		
		
		String[] text = new String[4];
		int indx = -1;
		
		while(sf.hasNext()){
			indx++;
			text[indx] = sf.nextLine();
		}
		
		sf.close();
		
		for(String texts: text)
			out.println(texts);
	
	}
}