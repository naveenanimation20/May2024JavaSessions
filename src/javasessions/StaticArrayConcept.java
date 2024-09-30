package javasessions;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {

		// int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i);// [I@6996db8

		System.out.println(Arrays.toString(i));

		// index based loop:
		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
		}

		System.out.println("-------");
		// for each loop:
		for (int e : i) {
			System.out.println(e);
		}

		System.out.println("-------");

		// 2. double array:
		double d[] = new double[3];// 0-2
		d[0] = 12.33;
		d[1] = 23.44;
		d[2] = 100.11;
		System.out.println(d);// [D@dcf3e99

		for (double e : d) {
			System.out.println(e);
		}

		System.out.println("-------");

		// char array:
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = 'A';
		ch[2] = '0';
		ch[3] = '$';

		for (char e : ch) {
			System.out.println(e);
		}

		System.out.println(Arrays.toString(ch));
		System.out.println(ch);

		System.out.println("-------");

		// String array:
		String emp[] = new String[3];// 0-2
		emp[0] = "Tom";
		emp[1] = "Amit";
		emp[2] = "Lisa";

		for (String e : emp) {
			System.out.println(e);
			if (e.equals("Amit")) {
				System.out.println("emp is admin");
				break;
			}
		}

		// empdata = name(String), age(int), gender(char), salary(double),
		// isPerm(boolean)

		// Object array:

		Object data[] = new Object[5];// 0-4
		data[0] = "Tom";
		data[1] = 300;//
		data[2] = 'm';
		data[3] = 35.55;
		data[4] = true;

		System.out.println(Arrays.toString(data));

		for (Object e : data) {
			System.out.println(e);
				if(e.equals(30)) {
					System.out.println("age is less than 50");
				}
		}

		for (int k = 0; k <= data.length - 1; k++) {
			System.out.println(data[k]);
		}

		//
		System.out.println("-------");

		int p[] = new int[4];
		p[0] = 10;
		p[1] = 20;
		p[2] = 30;
		p[3] = 40;

		for (int k = p.length - 1; k >= 0; k--) {
			System.out.println(p[k]);
		}

		System.out.println("-------");

		int count = p.length - 1;// 3
		for (int e : p) {
			e = count;// 3
			System.out.println(p[e]);// 40 30 20 10
			count--;// 2
		}

		// byte/short/long/int: 0
		// double/float: 0.0
		// char: space
		// String: null

		String naveen[] = new String[3];// 0-2
		System.out.println(Arrays.toString(naveen));
		// [null, null, null]
		
		
		
	}

}
