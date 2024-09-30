package StringManipulations;

public class StringIntern {

	public static void main(String[] args) {

		String s = new String("hello java");//heap - 1 and SCP -1
		String s1 = s;
		
		System.out.println(s1);
		
		System.out.println(s);
		
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		
	}

}
