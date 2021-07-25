package java_programming;

public class StringStatement {

	public static void main(String[] args) {
		String s="welcome to india country";
		String str[]=s.split(" ");
		for(int i=str.length-1; i>0; i--)
		{
			System.out.print(str[i]+" ");
		}

	}

}
