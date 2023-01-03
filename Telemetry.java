/*Nathan Shadzeka
 Bitwise Operators
 Start: Mon Jan 2 2022 9:59 PM
 Finish: Mon Jan 2 2022 10:42 PM
 */

import java.io.*; //for File and IOException
import java.util.*; //for StringTokenizer and Scanner
import java.text.*; //for NumberFormat
import static java.lang.System.out;
import static java.lang.Math.pow;

public class Telemetry{
    public static void main(String args[])throws IOException{
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(3);
        fmt.setMaximumFractionDigits(3);
        
        Scanner sf = new Scanner(new File("Switches.txt"));
        int maxIndx = -1;
        String[] text = new String[100];
        while(sf.hasNext()){
            maxIndx++;
            text[maxIndx] = sf.nextLine();
            //out.println(text[maxIndx]); //testing
        }
        //maxIndx = highest index of text or -1 if file is empty
        sf.close(); //opened a file above, close when finished
        //System.exit(0); //for testing to temporarily end program here
        
        for(int j = 0; j<=maxIndx; j++){
            //one of the following:
            //StringTokenizer st = new StringTokenizer(text[j]);
            Scanner sc = new Scanner(text[j]);
            
            //code
            int dval = sc.nextInt();
            out.println("Switch status for data value " + dval + ":");
            for(int a = 0; a<8; a++){
                if((dval & (int)pow(2,a)) == 0) out.println("\tSwitch sw" + (a+56) + " is \"off\"");
                else out.println("\tSwitch sw" + (a+56) + " is \"on\"");
            }
                
        }
    }
}

