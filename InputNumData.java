/*started: 9/8/2022 7:24pm
*finished: 
*more file input stuff
*some error idek about what gl
*/

import java.io.*;
import java.util.Scanner;
import static java.lang.System.out;

public class InputNumData{
	public static void main(String[] args) throws IOException{
	
		Scanner sf = new Scanner(new File("/Users/user/Terminal/Folder/temp_Nathan/NumData.txt"));
		int maxIndx = -1;
		String text[] = new String[100];
		
		while(sf.hasNext()){
			maxIndx++;
			text[maxIndx]= sf.nextLine();
		}
		
		sf.close();
		
		int sum;
		String answer;
		for(String texts: text){
			
			Scanner sc = new Scanner(texts);
			sum = 0;
			answer = "";
			
			while(sc.hasNextInt()){
				int i = sc.nextInt();
				answer += "+" + i;
				sum+=i;
			}
			
			answer += "=" + sum;
			out.println(answer);
			
			
		}
	}
}