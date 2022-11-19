/*started: 8/3/2022 - 11:59am
*finished: 8/3/2022 - 12:06am
*more array class method stuff and array stuff
*/

import java.util.Arrays;

public class AscendDescend{
	public static void main(String[] args){
	
		String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		
		Arrays.sort(ss);
		
		System.out.println("\nAscend\tDescend\n");
		
		for(int x=0,y=ss.length-1; x<ss.length; x++,y--)
			System.out.println(ss[x] + "\t" + ss[y]);
	
	}
}