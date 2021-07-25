package java_programming;

import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		
		String s="vivek tyss prakashasir vivek prakashasir";
		String str[]=s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String str1:set)
		{
			System.out.print(str1+" ");
		}
		
	}

}
