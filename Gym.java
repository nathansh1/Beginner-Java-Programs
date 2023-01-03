/*Nathan Shadzeka
 Start: Sun Jan 1 2022 2:13 PM
 Finish: Sun Jun 1 2022 11:54 PM
 */

import java.io.*; //for File and IOException
import java.util.*; //for StringTokenizer and Scanner
import java.text.*; //for NumberFormat
import static java.lang.System.out;

public class Gym{
    public static void main(String args[])throws IOException{
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(4);
        fmt.setMaximumFractionDigits(4);
        
        Scanner sf = new Scanner(new File("DataGym.txt"));
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
            ArrayList<Double> scores = new ArrayList<Double>();//array for scores
            while(sc.hasNext())
                scores.add(sc.nextDouble());
            
            double floor = scores.get(0);
            for(int a = 0; a<scores.size(); a++){ //find lowest value in array
                if(scores.get(a) < floor) floor = scores.get(a);
            }
            double ceil = scores.get(0);
            for(int a = 0; a<scores.size(); a++){ //find highest value in array
                if(scores.get(a) > ceil) ceil = scores.get(a);
            }
            
            scores.remove(Double.valueOf(floor));
            scores.remove(Double.valueOf(ceil));
            
            double sum = 0;
            for(int a = 0; a<scores.size(); a++){
                sum += scores.get(a);
            }
            double avg = sum/scores.size();
            out.println("Competitor #" + (j+1) +  " average score: " + fmt.format(avg));
        }
    }
}
