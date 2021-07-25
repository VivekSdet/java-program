package java_programming;

import java.util.HashSet;

public class TotalNumberOfDuplicateWord {

	public static void main(String[] args) {
String s="this is Manish Manish is my name";
		
		String str[]=s.split(" ");
		
		HashSet<String> Set=new HashSet<String>();
		for(int i=0; i < str.length; i++ ) 
		{
			Set.add(str[i]);
		}
		int totalnumofDuplicateWords=0;
		for(String word:Set)
		{
			int count=0;
			for(int i=0; i<str.length; i++) {
				
				if(word.equals(str[i])) 
				{
					count++;
				}
				
			}
			if (count>1) {
				totalnumofDuplicateWords++;
			}
			System.out.println(totalnumofDuplicateWords);
		}
		


	}

}
