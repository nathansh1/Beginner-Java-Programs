/*Nathan Shadzeka
 Started: Sat Dec 17 1:28 AM 2022
 Finished: Sun Dec 18 2:45 AM 2022
 */

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class AlphNames{
    public static void main(String args[])throws IOException{
        Scanner s = new Scanner(new File("/Users/nathan/Desktop/prog/Names.txt"));
        
        String[] text = new String[100];
        
        int indx = -1;
        while(s.hasNextLine()){
            indx++;
            text[indx] = s.nextLine();
        }
        s.close();
        
        String[] reverseName = new String[indx+1];
        
        for(int a=0; a<=indx; a++){
            Scanner s2 = new Scanner(text[a]);
            String fName = s2.next();
            String lName = s2.next();
            reverseName[a] = lName + ", " + fName;
        }
        
        Arrays.sort(reverseName);
        for(String str : reverseName)
            out.println(str);
        
    }
}
