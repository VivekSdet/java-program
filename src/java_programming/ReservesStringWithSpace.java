package java_programming;

public class ReservesStringWithSpace {

	public static void main(String[] args) {
	
		String s=" welcome to india";
		String str[]=s.split(" ");
		for(int i=0; i<str.length;i++) {
			String temp=str[i];
			for(int j= temp.length()-1; j>0; j--)
			{
				System.out.print(temp.charAt(j));
			}
		}
		System.out.print(" ");
	}

}
