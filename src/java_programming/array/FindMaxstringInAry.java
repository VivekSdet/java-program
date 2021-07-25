package java_programming.array;

public class FindMaxstringInAry {

	public static void main(String[] args) {
		String str[]= {"apple","banana", "hi" , "bye" , "killerri"};
		String max=str[0]; //apple
		for(int i=1;i<str.length;i++)//1 2<5 3<5 4<5 5<5
		{
			 if(max.length()<str[i].length()) //5<6 6<2 6<3 6<8
			 {
				 max=str[i];
			 }

			 
	}
		System.out.println(max);

}}
