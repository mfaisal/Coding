
class MinimumSubStringAppender
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "aabe";
		System.out.println(getMinimumNumberCharAppendForPalindrome(str));
	}
	/***
	Need to append
	***/
	public static String getMinimumNumberCharAppendForPalindrome(String str){
		int n = str.length();
		int s = 0;
		
		while(s < n-1){
			if((str.charAt(s)==str.charAt(n-1))&&isPalindrome(str.substring(s,n))){
				break;
			}
				
			s++;
		}
		
		return reverse(str.substring(0,s));
		
	}
	
	/***
	 * Reverse the string
	***/
	public static String reverse(String str){
		String res = "";
		for(int i = str.length()-1; i >=0; i--){
			res += str.charAt(i);
		}
		return res;
	}
	
	/**
	check whether string is a Palindorme or not
	**/
	public static boolean isPalindrome(String str){
		if(str.length()==1)
			return true;
			
		int s = 0;
		int e = str.length()-1;
		
		while(s<e){
			if(str.charAt(s)!=str.charAt(e)) // if start and end character do not same
				return false;
			s++;
			e--;
		}
		return true;
	}
}
