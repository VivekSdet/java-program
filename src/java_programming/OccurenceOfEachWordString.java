package java_programming;

import java.util.HashSet;

public class OccurenceOfEachWordString {

	public static void main(String[] args) {
		String s="this is Manish Manish is my name";
		
		String str[]=s.split(" ");
		
		HashSet<String> Set=new HashSet<String>();
		for(int i=0; i < str.length; i++ ) 
		{
			Set.add(str[i]);
		}
		for(String word:Set)
		{
			int count=0;
			for(int i=0; i<str.length; i++) {
				
				if(word.equals(str[i])) 
				{
					count++;
				}
			}
			System.out.println(word + "=" + count);
		}
		

	}

}
