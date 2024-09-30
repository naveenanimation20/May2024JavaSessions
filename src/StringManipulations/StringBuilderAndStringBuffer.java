package StringManipulations;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {

		//StringBuilder: 1.4
		StringBuilder sb = new StringBuilder("selenium");//1
		
		sb.append("automation");
		System.out.println(sb);
				
		
		//StringBuffer: 1.0 : Thread-safe
		
		
		String st = "selenium";
		//System.out.println(st.rever);
		
		StringBuilder sb1 = new StringBuilder(st);//1
		System.out.println(sb1.reverse());
		
		System.out.println(st);
		
		
		
	}

}
