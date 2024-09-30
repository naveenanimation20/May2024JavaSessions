package DynamicArray;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		
		//List(I) -----> ArrayList(C)
		//AL: it maintains the order/index
		
		
		ArrayList ar = new ArrayList();//vc=10,pc=0
		System.out.println(ar.size());//pc=0
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());//vc=8,pc=2
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//vc=6,pc=4
		
		
		ArrayList ar1 = new ArrayList(5);//vc=5,pc=0
		ArrayList ar2 = new ArrayList(50);//vc=50,pc=0
		//vc=0,pc=50
		//vc=50/2 = 25
		

		

		
	}

}
