package com.cg.stringdemo;

public class StringDefaultMethods {

	public static void main(String[] args) {
		String str=new String(" TNSIF has changed my life, it gave me a path to follow. I now understand why \"Guru\" is so important in life.  ");
		// length(): 
		System.out.println(str.length()); // Returns the length of the string.
		// Output: `111`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// charAt(int index): 
		System.out.println(str.charAt(1)); // Returns the character at the specified index in the string.
		// Output: `T`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// substring(int beginIndex):
		System.out.println(str.substring(0)); // Returns a substring of the string starting from the specified index to the end of the string.
		// Output: ` TNSIF has changed my life, it gave me a path to follow. I now understand why "Guru" is so important in life.  `
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// substring(int beginIndex, int endIndex):
		System.out.println(str.substring(1,4)); // Returns a substring of the string starting from the specified beginIndex up to, but not including, the specified endIndex.
		// Output: `TNS`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// indexOf(int ch): 
		System.out.println(str.indexOf("t")); // Returns the index of the first occurrence of the specified character in the string.
		// Output: `29`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// indexOf(int ch, int fromIndex): 
		System.out.println(str.indexOf("t",30)); // Returns the index of the first occurrence of the specified character in the string, starting from the specified fromIndex.
		// Output: `43`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// indexOf(String str): 
		System.out.println(str.indexOf("life")); // Returns the index of the first occurrence of the specified substring in the string.
		// Output: `22`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// indexOf(String str, int fromIndex): 
		System.out.println(str.indexOf("life", 23)); // Returns the index of the first occurrence of the specified substring in the string, starting from the specified fromIndex.
		// Output: `104`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// toUpperCase(): 
		System.out.println(str.toUpperCase()); // Returns a new string with all characters in uppercase.
		// Output: ` TNSIF HAS CHANGED MY LIFE, IT GAVE ME A PATH TO FOLLOW. I NOW UNDERSTAND WHY "GURU" IS SO IMPORTANT IN LIFE.  `
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// toLowerCase(): 
		System.out.println(str.toLowerCase()); // Returns a new string with all characters in lowercase.
		// Output: ` tnsif has changed my life, it gave me a path to follow. i now understand why "guru" is so important in life.  `
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// trim(): 
		System.out.println(str.trim()); // Returns a new string with leading and trailing whitespace removed.
		// Output: `TNSIF has changed my life, it gave me a path to follow. I now understand why "Guru" is so important in life.`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// replace(char oldChar, char newChar):
		System.out.println(str.replace( "TNSIF", "tnsif")); // Returns a new string with all occurrences of the specified oldChar replaced with the specified newChar.
		// Output: ` tnsif has changed my life, it gave me a path to follow. I now understand why "Guru" is so important in life.  `
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// replaceAll(String regex, String replacement): 
		System.out.println(str.replaceAll(" ","#")); // Returns a new string with all occurrences of the specified regular expression regex replaced with the specified replacement string.
		// Output: `#TNSIF#has#changed#my#life,#it#gave#me#a#path#to#follow.#I#now#understand#why#"Guru"#is#so#important#in#life.##`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// startsWith(String prefix):
		System.out.println(str.startsWith(" ")); // Returns true if the string starts with the specified prefix, otherwise false.
		// Output: `true`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		// endsWith(String suffix):
		System.out.println(str.endsWith("life")); // Returns true if the string ends with the specified suffix, otherwise false.
		// Output: `false`
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
	}

}
