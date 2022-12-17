/*Nathan Shadzeka
 Started: Fri Dec 16 4:09PM 2022
 Finished: Sat Dec 17 1:02AM 2022
*/

import java.io.*;
import java.util.Scanner;
import static java.lang.System.out;

public class L25NumAdd{
    public static void main(String args[]) throws IOException{
        
        Scanner s = new Scanner(new File("/Users/nathan/Desktop/prog/NumData.txt"));
        
        int indx = -1;
        String[] text = new String[100];
        while(s.hasNext()){
            indx++;
            text[indx] = s.nextLine();
            //out.println(text[indx]);
        }
        
        String answer = "";
        int sum;
        for(int a=0; a<=indx; a++){
            Scanner s2 = new Scanner(text[a]);
            sum=0;
            answer = "";
            
            while(s2.hasNext()){
                int b = s2.nextInt();
                answer += " + " + b;
                sum+=b;
            }
            
            answer+= " = " + sum;
            answer = answer.substring(3);
            out.println(answer);
        }
        
    }
}
