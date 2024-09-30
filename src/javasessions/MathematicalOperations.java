package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {

		
		System.out.println(1+2);
		
		System.out.println(10/2);
		
		System.out.println(9/2);//4
		
		System.out.println(9.0/2);//4.5
		
		System.out.println(9/2.0);//4.5
		
		System.out.println(9.0/2.0);//4.5
		
		//System.out.println(9/0);//ArithmeticException: / by zero
		System.out.println(9.0/0);//Infinity

		System.out.println(0/9);//0
		
		
		System.out.println(9/0.0);//Infinity
		
		System.out.println(9.0/0.0);//Infinity
		
		//System.out.println(0/0);//ArithmeticException: / by zero
		
		//System.out.println(-1/0);//ArithmeticException: / by zero
		
		System.out.println(2/9);//0
		
		System.out.println(0.0/0.0);//NaN--not a number
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		
		//System.out.println(-12/0);//AE
		System.out.println(0/9.0);//0.0
		
		
		System.out.println(10 % 2);//0
		System.out.println(9 % 2);//
		System.out.println(100 % 3);
		
		//System.out.println(9 % 0);//AE
		System.out.println(0 % 9);//0
		
		
		System.out.println(100);//4 bytes
		System.out.println((byte)100);//1 byte

		System.out.println(12.33);//8 bytes
		System.out.println(12.33f);//4 bytes
		
		System.out.println(10 % 0.0);//NaN
		
		System.out.println(0.1f+0.2);//0.30000000000000004
		System.out.println(0.1+0.4);//0.5
		
		double num1 = 5.75;
		double num2 = 3.45;
		double sum = num1+num2;
		System.out.println(sum);

		
	}

}
