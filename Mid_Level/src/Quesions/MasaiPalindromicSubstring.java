package Quesions;

public class MasaiPalindromicSubstring {

	public static int palindromicSubstring(String str) {
		int maxLength = Integer.MIN_VALUE;
		for(int i = 0; i<str.length(); i++) {
			for(int j = i; j<=str.length(); j++) {
				String s = str.substring(i, j);
//				System.out.println(s); printing all the string
				int start = 0;
				int last = s.length()-1;
				boolean flag = true;
				while(start<last) {
					if(s.charAt(start)!=s.charAt(last)) {
						flag = false;
						break;
					}
					last--;
					start++;
				}
				if(flag && maxLength<s.length()) maxLength = s.length();
			}
		}
		
		
		return maxLength;
		
	}
	
	public static void main(String[] args) {

		String inputString = "xaaaax";
		int answer = palindromicSubstring(inputString);
		System.out.println(answer);
	}
	
}
