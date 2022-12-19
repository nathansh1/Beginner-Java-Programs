/*Nathan Shadzeka
 Started: Sun Dec 18 3:08 AM 2022
 Finished: Sun Dec 18 10:55 PM 2022
 
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.out;

public class StudentAverages{
    public static void main(String args[])throws IOException{
        
        Scanner s = new Scanner(new File("/Users/nathan/Desktop/prog/StudentScores.txt"));
        
        ArrayList<String> text = new ArrayList<String>();
        ArrayList<String> fText = new ArrayList<String>();
        
        int indx = -1;
        while(s.hasNext()){
            indx++;
            text.add(s.nextLine());
        }
        
        int sum = 0, count = 0;
        for(int a = 0; a<text.size(); a++){
            sum = 0;
            count = 0;
            Scanner s2 = new Scanner(text.get(a));
            String name = s2.next();
            while(s2.hasNext()){
                sum += s2.nextInt();
                count++;
            }
            fText.add(name + ", average = " + (sum/count));
        }
        
        for(String str : fText)
            out.println(str);
    }
}
