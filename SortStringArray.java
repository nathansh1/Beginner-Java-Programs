/*8/3/2022
*finished: 8/3/2022 - 11:48am
*using array classes- practice w arrays
*/

import java.util.Arrays;

public class SortStringArray{
	public static void main(String[] args){
	
		String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		
		Arrays.sort(ss);
		
		for(String str: ss)
			System.out.println(str);
		
	
	}
}