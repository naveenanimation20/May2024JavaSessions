package javasessions;


public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		// ++ and --

		// 1. post increment:
//		int a = 1;
//		int b = a++;
//		
//		System.out.println(a);//2
//		System.out.println(b);//1
//		
//		
//		int c = -98;
//		int d = c++;
//		System.out.println(c);//-97
//		System.out.println(d);//-98
//		
//		//2. pre increment:
//		int f = 1;
//		int g = ++f;
//		
//		System.out.println(f);//2
//		System.out.println(g);//2
//		
//		int r = -100;
//		int t = ++r;
//		System.out.println(r);//-99
//		System.out.println(t);//-99
//		
//		int h = -48;
//		int l = ++h;
//		System.out.println(h);//-47
//		System.out.println(l);//-47
//		
//		//3. post decrement: --
//		int m = 2;
//		int n = m--;
//		System.out.println(m);//1
//		System.out.println(n);//2
//		
//		
//		int total = 10;
//		System.out.println(total++);//10		
//		System.out.println(total);//11
//		
//		int fee = 100;
//		System.out.println(fee--);//100
//		System.out.println(fee);//99
//		
//		//4. pre decrement:
//		int v = 2;
//		int z = --v;
//		System.out.println(v);//1
//		System.out.println(z);//1
//		
//		int num = 10;
//		System.out.println(--num);
//		System.out.println(num);

//		int i = 11;
//		int j = i++ + ++i;
//		System.out.println(i);
//		System.out.println(j);
//
//		int a = 11, b = 22;
//		int c = a + b + a++ + b++ + ++a + ++b;
//		
//		System.out.println("a=" + a);//13
//		System.out.println("b=" + b);//24
//		System.out.println("c=" + c);//103
		
		
//		int i=0;
//		int j = i++ - --i + ++i - i--;
//		
//		System.out.println(i);
//		System.out.println(j);
//		
//		
//		int m = 0, n = 0;
//		int p = --m * --n * n-- * m--;
//
//		System.out.println(m);
//		System.out.println(p);
//		System.out.println(n);

//		int a=1;
//		int b = a++ + ++a * --a - a--; 
//
//	
//		
//		
//		//1+3*2-2=1+6-2=5
//		
//		System.out.println(a);//1
//		System.out.println(b);//5
		
		
//		int a = 11++;//invalid
//		System.out.println(a);

		
//		char ch = 'A';//65
//		System.out.println(ch++);//A
//		System.out.println(ch);//66-->B
//		
//		
//		double d = 1.2;
//		System.out.println(++d);
//		System.out.println(d);
//		
//		char c = 'a';//97
//		System.out.println(c++);//98
//		System.out.println(c);//98--b
		
		char v = 'b';
		System.out.println(v++);//b
		System.out.println(v);//c
		System.out.println((byte)v);
		
		char ch = 'z';//122
		System.out.println(++ch);//123
		
		
		int s = 65000;
		System.out.println((char)s);
		
		String s1 = "Hello";
		 String s2 = "World";
		 String s3 = s1+s2;
		 s3.intern();
		 String s4 = "HelloWorld";
		 System.out.println(s3==s4);
		 System.out.println(s3.equals(s4));
		

	}

}
