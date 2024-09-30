package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1 to 10
		// 1. while loop:

		int i = 1;
		while (i <= 10) {
			// System.out.println(i);// 1234567891011
			// i++;// 11
			// ++i;
			// i=i+1;
			// break;
			System.out.println(i++);// 1234567891011

		}

		//
		int k = 1;
		while (k <= 50) {
			System.out.println("hello");
			k++;
		}

		// 1 to 50
		int p = 1;
		while (p <= 50) {
			System.out.println(p);// 1234
			p++;// 5
			if (p == 5) {
				System.out.println("bye");
				break;
			}
		}

		// 10 to 1:
		int t = 10;
		while (t >= -1) {
			System.out.println(t);// 109876543210-1
			// t--;
			// --t;
			t = t - 1;// -2
		}

		System.out.println("-------------");

		// 2. for loop:
		// 1 to 10:

		for (int d = 1; d <= 10; d++) {
			System.out.println(d);// 12345678910
		}

		System.out.println("-------------");

		//
		for (short b = 1; b <= 10; b++) {
			System.out.println(b);
		}

		System.out.println("-------------");
		// a=97
		// b=98
		// z=122
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}

		System.out.println("-------------");
		// double:
		for (double d = 1.0; d <= 5.0; d++) {
			System.out.println(d);
		}

		// when to use while loop:
		// when number of iterations are not fixed, then use while loop
		// calendar handling
		// infinite scrolling on facebook, linkedin, swiggy, zomato
		// wait for element on the page: 5, 10, 12, 15, 20, 0
		// wait for page loading:
		// webtable with pagination:
		// carousels

		// when to use for loop:
		// when number of iterations are fixed, then use for loop
		// month drop down: 1 to 12
		// Arrays, ArrayList: for loop
		// footer links
		// drop downs with fixed data
		// movie ticket for a movie: 120 seats

//		for(;;) {
//			System.out.println("welcome to hotel TAJ");
//		}

		// int ss = 10;

//		while(true) {
//			System.out.println("welcome to hotel TAJ");
//		}

//	byte h = 1;//127
//	while(true) {
//		h++;
//		System.out.println(h);
//	}

		// System.out.println(10 + " " + 20);

//		int m = 1;
//		while(m<=10) {//true
//			m++;
//			System.out.println(m);
//		}

		for (int m = 0; m < 10;) {
			m++;
			System.out.println(m);
		}

		int n = 1;
		while (true) {
			
			System.out.println(n);//1
			n++;
			if(n==11) {
				break;
			}
		}
		
		
		///
		int u = 10;
		do {
			System.out.println(u);//10
			u--;//9
		}
		while(u>=10);//false
		

		

	}

}
