package junits;


public class StringFunctions {
	
	
	public static boolean isPalindrome(String str) {
		
		//String str= "MADAM";
		
		String rev = "";
	    
	    int l = str.length();

	    for (int i = (l - 1); i >=0; --i) {
	      rev = rev + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(rev.toLowerCase())) {
	     return true;
	    }
	    else {
	    	return false;
	    }	
		
	}

	
}
