/*started: 7/30/2022
*finished: 8/1/2022
*simple exercise with arrays
*/

public class ArrayOfHope{
	public static void main(String[] args){
	
		char[] ch = new char[26];
		int i = 0;
		
		for(int x = 65; x<=90; x++, i++)
			ch[i] = (char)x;
		
		for(int x = 0; x<ch.length; x++){
		
			if(x == ch.length-1)
				System.out.println(ch[(char)x]);
			else
				System.out.print(ch[(char)x] + ", ");
			
		}
			
			
		System.out.println();
	
	}
}