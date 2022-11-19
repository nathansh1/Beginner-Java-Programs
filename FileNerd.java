/*started: 8/28/2022 12:50pm
*finished: 9/7/2022 8:21pm
*more file reading
*LmMaoooo it took so long because i forgot a slash and i was busy w school

debugging: could not find/load main class error IDK the class is spelled correctly and im in the right directory
*/

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class FileNerd{
	public static void main(String[] args) throws IOException{
	
		Scanner sf = new Scanner(new File("/Users/user/Terminal/Folder/temp_Nathan/NerdData.txt"));
		
		String[] text = new String[5];
		int i = 0;
		
		while(sf.hasNext()){
			text[i] = sf.nextLine();
			i++;
		}
		
		sf.close();
		
		for(String texts : text){
			if(texts.substring(0,3).equals("The"))
				out.println(texts);
			else
				continue;
		}
	}
}