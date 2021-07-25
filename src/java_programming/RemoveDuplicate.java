package java_programming;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s="vivek";
		
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.print(ch);
		}
		
}
	}
