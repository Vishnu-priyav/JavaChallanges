package javaChallange_01;

public class JavaChallenge01 {
	
	public static void main(String[] args) {
		
	
	String s = "luffy is still joyboy";
	String lastWord = s.substring(s.lastIndexOf(" "));

	int length = 0;
	
	for(int i=0; i<s.length(); i++) {
		if (s.charAt(i) == ' ')
            length = 0;
        else
            length++;
		
	}
	 System.out.println("The last word is "+lastWord+" with length " + length);

}
}
