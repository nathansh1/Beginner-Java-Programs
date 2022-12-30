/*Nathan Shadzeka
 Started: Tue Dec 20 10/11 AM 2022
 Finished: Tue Dec 20 11:59 AM 2022
 
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.out;

public class StudentAveragesOut{
    public static void main(String args[])throws IOException{
        
        Scanner s = new Scanner(new File("/Users/nathan/Desktop/prog/StudentScoresIn.txt"));
        
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
            fText.add(name + ", average = " + Math.round(sum/count));
        }
        
        FileWriter fw = new FileWriter("StudentScoresOut.txt");
        PrintWriter output = new PrintWriter(fw);
        for(String str : fText)
            output.println(str);
        fw.close();
        output.close();
    }
}
