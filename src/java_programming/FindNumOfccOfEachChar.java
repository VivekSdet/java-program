package java_programming;

import java.util.HashSet;

public class FindNumOfccOfEachChar {

	public static void main(String[] args) {
		
		String s = "INDIA";
		
		//STEP 1: CREATE SET COL TO GET ONLY UNIQUE CHAR OF GIVEN STRING
		
		HashSet<Character> set = new HashSet<Character>(); //{i,n,d,a}
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		//step2: compare each char of set with all chAR given
		
		for(Character ch: set) {
			int count=0;
			for (int i=0; i< s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			//step 3: print char and count
			System.out.println(ch+ " = " + count);
		}
	}

}
