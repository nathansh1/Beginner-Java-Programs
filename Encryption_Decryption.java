/*7/21/2022
* using string classes and some things ive never even heard of
*this thing took like five days hahdhfahrhHh
*learned switch expressions and string builders
*almost put a hole in my computer :||||
*ahhhhhhhhh
*anyway uh yea
*
*VERY IMPORTANT: COMPILE WITH:
"javac --enable-preview --release 18 Encryption_Decryption.java"

*IMPORTANT: RUN WITH:

java --enable-preview Encryption_Decryption
*/

public class Encryption_Decryption{
	public static void main(String args[]){
	
		Crypt sen1 = new Crypt();
		
		//encrypting the string
		String msg1 = sen1.encrypt("This is a very big morning.");
		
		//printing the encryption
		System.out.println(msg1);
		
		//printing the decryption
		System.out.println(sen1.decrypt(msg1));
	
	}
}

class Crypt{

	public Crypt(){
		;
	}

	public String encrypt(String str){
		
		StringBuilder sb = new StringBuilder();
		
		//encryption rules
		for(char c: str.toCharArray()){
			String s = switch(c){
				case 'g', 'G' -> "jeb..w";
				case 'v', 'V' -> "ag',r";
				case 'm', 'M' -> "ssad";
				case 'b', 'B' -> "dug>?/";
				default -> "" + c;
			};
			sb.append(s);
		}
		return sb.toString();
		
	
	}
	
	public String decrypt(String str){
	
		//reversing the encryption rules
		
		str = str.replace("ag',r", "v");
		str = str.replace("ssad", "m");
		str = str.replace("jeb..w", "g");
		str = str.replace("dug>?/", "b");
		
		return str;
	
	}
	
	
}