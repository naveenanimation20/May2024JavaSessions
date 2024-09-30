package javasessions;

public class TypeCastingConcept {

	public static void main(String[] args) {

		
		//byte, short, int, long
		
		byte b = 10;
		
		short s = b;
		System.out.println(s);
		
		
		short s1 = 200;
		byte b1 = (byte)s1;//200
		//-128 to 127==> 256
		
		System.out.println(b1);//-56
		
		
		short s2 = 10;
		byte b2 = (byte)s2;//10
		System.out.println(b2);//10
		
		
		byte t1 = 10;
		int i = t1;
		System.out.println(i);
		
		int j = 1000;
		byte k = (byte) j;
		System.out.println(k);//-24
		
		
		int p = 100;
		float f = p;
		System.out.println(f);
		
		float f1 = 12.33f;
		int p1 = (int)f1;
		System.out.println(p1);
		
		int d = 10000;
		double dd = d;
		System.out.println(dd);
		
		char ch = 'a';//97
		int w = ch;
		System.out.println(w);
		
		int v = 1200;
		char cg = (char)v;//1200
		System.out.println(cg);
		
		
		char th = 'a';
		short sh = (short)th;
		System.out.println(sh);
		
		
		
		
	}

}
