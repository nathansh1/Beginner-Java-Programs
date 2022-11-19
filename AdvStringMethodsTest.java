/*7/21/2022
*practice n testing n notes
*/

public class AdvStringMethodsTest{
	public static void main(String[] args){
	
	
		String s = "The Dukes of Hazzard";
		
		//public int compareTo(Object) method
			
			System.out.println("compareTo() method comparing " + s + " and \"coat room \" results:\t" + s.compareTo("coat room"));
				//prints -15 bc the ASCII of 'T' is 84 and 'c' is 99 so 84-99 = -15
				//note capitals precede lowercase
					//also compareToIgnoreCase()
				//only checks 0th index
				
		//indexOf()
		
			//all return -1 if search unsuccessful
			//left to right search of first occurrence of parameter
			
			
			//a. public int indexOf(String str || char ch || int ascii)
				int j = s.indexOf("Hazzard"); //j=13
				int j0 = s.indexOf('D'); //j=4
				int j1 = s.indexOf(68); //ASCII code for 'D' is 68 so j=4
 
			
			//b. public int indexOf(String str || char ch || int ascii, int from)
				int j2 = s.indexOf("Hazzard", 15); //j2 = -1
				int j3 = s.indexOf('e', 4); //j3=7
				int j4 = s.indexOf(101,4); //ASCII code for 'e' is 101 so j4=7
					//even tho "e" is at 2, search started at 4
					
		//lastIndexOf()
			
			//all return -1 if search unsuccessful
			
			//same as indexOf() except it searches right to left
			
			
		//public char charAt(int indx)
			
			//returns character at specified index
			
			char myChar = s.charAt(6); //myChar = 'k'
			
		//public String replace(char old, char new)
			
			//replaces ALL occurrences of character old with new
				
				String myString = s.replace('z', 'L');
				//myString = "The Dukes of HaLLard"
				
		//public String trim()
			
			//removes whitespace from both ends of String, leave interior intact
			
		//public boolean contains(String ss)
			
			//returns true when String contains String ss; else false
			
		//public boolean startsWith(String ss)
			
			//returns true when String starts with String ss; else false
			
		
				
				
				
			
		
		
		
		
		
	
	}
}