package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		//array:
		//similar type of data in a collection
		
		//1. static array: size is fixed
		//2. dynamic array: dynamic size, size is not fixed: ArrayList,
		
		
		//two major limitations:
		//1. size is fixed(static array): to overcome this, we use ArrayList(Dynamic Array)
		//2. can store only similar data types: to overcome this, we can use Object array but this still a static array
		
		
		
		
		//1. using new keyword:
		int i[] = new int[4];
		System.out.println(i[0]);//0
		System.out.println(i[3]);//0
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i.length);//4
		
		System.out.println(i[0]);//10
		System.out.println(i[3]);//40
		
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[4]);//AIOB
		
		//to print all the value of array: use for loop:
		
		System.out.println("Li = " + 0);
		int len = i.length;//4
		System.out.println("length = " + len);
		System.out.println("Hi = " + (len-1));
		
		System.out.println("------");
		//0-3
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);//10 20 30 40
		}
		
		//without for loop, want to print the values of array:
		
		System.out.println(Arrays.toString(i));
		
		
		//using new keyword
		int p[] = new int[4];
		p[0] = 100;
		p[1] = 'a';
		p[2] = 'b';
		
//		p[3] = 50;//AIOB
		System.out.println((char)p[1]);
		
//		p[1] = 100;
//		System.out.println(p[1]);
//		System.out.println(p[0]);
//		System.out.println(p[2]);

		System.out.println(p.length);
		
		
		//src -- .class --->JVM--JRE --> op
		
		
		//Array Literals: static array:
		int num[] = {10,20,30,50,12,34};//6-->0 to 5
		
		for(int k=0; k<=num.length-1; k++) {
			System.out.println(num[k]);
		}
		
		
		
		
		//if we have the data already with us
		System.out.println(num.length);//6
		System.out.println(num[0]);
		//System.out.println(num[6]);
		System.out.println(Arrays.toString(num));
		num[0] = 400;
		System.out.println(Arrays.toString(num));


		
		int pop[] = new int[10];//if we are not sure about the full data


		String browser[] = {"chrome", "firefox", "edge"};//0-2
		System.out.println(browser.length);//3
		
		//browser[3] = "ie";
		
		
		
		for(String e : browser) {
			System.out.println(e);
		}
		
		
		
	}

}
