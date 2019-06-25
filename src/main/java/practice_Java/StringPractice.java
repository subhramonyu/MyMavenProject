package practice_Java;
import java.security.SecureRandom;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.omg.CORBA.CharHolder;

public class StringPractice {
	
	static int no = 10;
	

	// TO reverse a string Without reverse function
	public static void reverseStringWithout(String aText) {
		StringBuffer sbf = new StringBuffer();
		for (int i = aText.length() - 1; i >= 0; i--) {
			sbf = sbf.append(aText.charAt(i));
			 //System.out.println(sbf);
		}
		System.out.println(sbf);
	}

	// To reverse a String using the reverse function
	public static void reverseStringwith(String aText) {
		StringBuilder sbd = new StringBuilder();
		sbd = sbd.append(aText).reverse();
		System.out.println(sbd);
	}

	//Replace a word in the string
	public static void replace(String WordToBeReplaced, String TextToBeReplacedWith, String aText ) {
		//boolean bValue = WordToBeReplaced.equalsIgnoreCase(TextToBeReplacedWith);
		String[] aList = aText.split(WordToBeReplaced);
		StringBuffer stf = new StringBuffer();
		int ln = aList.length-1;
		for(int i = 0; i<=ln ; i++ ) {
			stf = stf.append(aList[i]);
		
			if(i != ln) {
				stf = stf.append(TextToBeReplacedWith);
			}
			
		}
	//	String aString = stf.toString();
	//	String Replaced = aString.replaceAll("\\s", "*");
		
	//	System.out.println(Replaced);
		System.out.println(stf);
	}
	
	//Reverse a String using char array
	public static void ReverseWord(String aText) {
		String c = "";
		for(int i =aText.length()-1 ; i>= 0 ; i--)
		{
		c = c+aText.charAt(i);
			//String reverse = Arrays.toString(aWord);
			
		}
		System.out.println(c);
		
	}
	
	//Count of the character of a String
	public static void countChar(String aText) {
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		char[] aWordArray = aText.toCharArray();
		for (char c : aWordArray) {
			if (countMap.containsKey(c)) {
				countMap.replace(c,  countMap.get(c),countMap.get(c)+1);
			}else if (!countMap.containsKey(c)) {
				countMap.put(c, 1);
				
			}
	
			}
		for (Character m:countMap.keySet()) {
			System.out.println(m + "  " + countMap.get(m));
		}
		
	}
	
	//Random string generator
	//@param Lenth of the String
	
	public static String randomGenerator(int len) {
		 String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		 Random rnd = new Random();

		
		   StringBuffer sb = new StringBuffer( len );
		   for( int i = 0; i < len; i++ ) 
		      sb.append( AB.charAt( rnd.nextInt(11) ) );
		   return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		//reverseStringWithout("Happy");
		replace("my", "your", " my I love my country . my name is Dev my name");
		//countChar("Acnhaojanshfbaiwaajnievpanfnac");
		//countChar("vowovow");
		//ReverseWord("DEV");
	}

}
