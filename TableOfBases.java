/*720/2022
*converting ints to base 2,8,16, and char
*/

public class TableOfBases{
	public static void main(String args[]){
		
		System.out.print("Decimal\tBinary\tOctal\tHex\tCharacter\n");
		
		for(int j = 65; j<=90; j++){
		
			System.out.println(j + "\t" + Integer.toString(j,2) + "\t" + Integer.toString(j,8) + "\t" + Integer.toString(j,16) + "\t" + (char)j);
		
		}
		
	}
}