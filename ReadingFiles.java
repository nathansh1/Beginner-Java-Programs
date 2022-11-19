/*
started: 8/13/2022 4:21pm
finished: 8/13/2022/ 5:00pm
more file input with a condition this time
*/

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class ReadingFiles{
	public static void main(String[] args) throws IOException{
	
		Scanner sf = new Scanner(new File("/Users/user/Terminal/Folder/temp_Nathan/NerdData.txt"));
		String[] text = new String[5];
		int indx = -1;
		
		while(sf.hasNext()){
			indx++;
			text[indx] = sf.nextLine();
		}
		
		sf.close();
		
		for(String texts: text){
			
			if(texts.substring(0,3).equals("The") || texts.substring(0,3).equals("the"))
				out.println(texts);
			else
				continue;

			
		}
		
		
	
	}
}