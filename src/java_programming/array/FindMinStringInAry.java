package java_programming.array;

public class FindMinStringInAry {

	public static void main(String[] args) {
		String str[]= {"apple","banana", "hi" , "bye" , "killerri"};
		String min=str[0]; //apple
		for(int i=1;i<str.length;i++) {
			 if(min.length()>str[i].length())
			 {
				 min=str[i];
			 }

			 
	}
		System.out.println(min);

	}

}
