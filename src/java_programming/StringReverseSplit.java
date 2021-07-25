package java_programming;

public class StringReverseSplit {

	public static void main(String[] args) {
		
		String s1="welcome to our company tyss";
	    String[] str = s1.split(" ");
	    String temp=str[0];//welcome
	    str[0]=str[str.length-1];

		str[str.length-1]= temp;
	for(int i=0; i<str.length; i++)
	{
		  System.out.print(str[i]+" ");

	}
	}

}
