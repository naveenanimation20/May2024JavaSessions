package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		//String is a class: default class
		
		String name = "Naveen";
		String num = "1000";
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 12.44;
		
		System.out.println(a+b);//300
		System.out.println(x+y);//HelloSelenium
		System.out.println(x+a);//Hello100
		System.out.println(a+b+x);//300Hello
		System.out.println(a+b+x+y);//300HelloSelenium
		
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300

		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		
		System.out.println(a+b+x+y+(a+b+c+d));//300HelloSelenium324.77
		
		System.out.println(a+b+c+d+x+y);//324.77HelloSelenium
		
		System.out.println("the value of a " + a);
		System.out.println("the value of b " + b);
		System.out.println("the sum of a and b is : " + (a+b));
		
		
		char ch = 'a';
		String str = "Selenium";
		System.out.println(str + ch);
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);//a
		System.out.println(c1+c2);//97+98=195
		System.out.println(c2-c1);//1
		
		//range: 
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println('A' + 'B');//65+66=131
		System.out.println(c1+c2+'0'+'A');//308
		System.out.println(str+c1+c2);//Seleniumab
		System.out.println(str+(c1+c2));//Selenium195
		
		System.out.println(c1);//a
		System.out.println((byte)c1);//97
		System.out.println((byte)'$');
		
		char ct = '*';
		System.out.println((byte)ct);//42
		
		System.out.println('a'+0);//97
		System.out.println('$'+0);//36
		
		System.out.println('a'+10+20-10);//117
		
		System.out.println("Naveen " + 'm');//Naveen m

		System.out.println('a'+'c'+'0'+'9'+'A'+"Hello"+'a'+'b');//366Helloab
		
		boolean flag = true;
		String u = "yes";
		System.out.println(flag + u);//trueyes
		
		System.out.println("a"+"b");//ab
		System.out.println('a'+'b');//195

		System.out.println(flag + ""+ 'a');//truea
		
		
		char dh = 'a';//97
		System.out.println((byte)dh);
		
		
	}

}
