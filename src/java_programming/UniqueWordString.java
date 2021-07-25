package java_programming;

import java.util.LinkedHashSet;

public class UniqueWordString {
	
	

	public static void main(String[] args) {
		String s="  welcome to india welcome to mandya";
		
		String str[]=s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		
		//step2: compare each char of set with all chAR given
		int count=0;
		for(String str1: set) {
			int count1=0;
			for (int i=0; i< str.length; i++)
			{
				if(str1.equals(str[i])) {
					count1++;
				}
			}
			//step 3: print char and count
			if(count1==1)
			{
				System.out.print(str1+" ");
			
			}
		}

	}

}
