package java_programming;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class PrintonlyUniqueChar {

	public static void main(String[] args) {
	{
				String s = "welcome";
					
					//STEP 1: CREATE SET COL TO GET ONLY UNIQUE CHAR OF GIVEN STRING
					
					LinkedHashSet<Character> set = new LinkedHashSet<Character>();
					for(int i=0; i<s.length(); i++)
					{
						set.add(s.charAt(i));
					}
					
					//step2: compare each char of set with all chAR given
					int totalnumofduplicateChar=0;
					for(Character ch: set) {
						int count=0;
						for (int i=0; i< s.length(); i++)
						{
							if(ch==s.charAt(i)) {
								count++;
							}
						}
						//step 3: print char and count
						if(count==1)
						{
							System.out.print(ch);
						
						}
					}
					
				}

			



			}



	}


