package javasessions;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		System.out.println(2 % 2);
		

		//1 to 10:
		int i = 1;
		do {
			i++;//11
			System.out.println(i);//234567891011
			
				if(i==7) {
					System.out.println("hello");
				}
			
			//break;
		}
		while(i<=10);
		
		//use cases:
		//wait for the element:
		
		System.out.println("--------");
		
		int p = 10;
		do {
			System.out.println(p);//109876543210
			p--;//-1
			
			
		}
		while(p>=0);
		
		System.out.println("--------");
		//
		for(int k=1; k<=100; k++) {
				if(k % 2 ==0) {
					System.out.println(k);//2
				}
				
		}
		
		System.out.println("--------");

		for(int e=1; e<=10; e++) {
			System.out.println(e);//13579
			e++;//2

		}
		
		
		//for each: 		
	}

}
