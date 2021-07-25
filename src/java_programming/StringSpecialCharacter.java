package java_programming;

public class StringSpecialCharacter {

	public static void main(String[] args) {
		String s="abc@123&xyz";
		
		String ch="";
		String num="";
		String sp="";
		for(int i=0; i<s.length();i++)
				 {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				ch=ch+s.charAt(i);
				
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
				sp=sp+s.charAt(i);
		}
		
		System.out.println(ch);
		System.out.println(num);
		System.out.println(sp);
		
	}

}
