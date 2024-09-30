package DynamicArray;

import java.util.ArrayList;

public class ArrayListPractice {
	
	

	public static void main(String[] args) {
		
		

		//raw type AL
		ArrayList ar = new ArrayList();//vc=10,pc=0
		
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//4
		
		System.out.println(ar.get(3));
		//System.out.println(ar.get(4));//IndexOutOfBoundsException

		
//		System.out.println(ar.get(1));
//
//		ar.remove(1);
//
//		System.out.println(ar.get(1));
		
		//print all the value of ArrayList:
		
		System.out.println(ar);
		
		//use for loop:
		//index loop:0 to 3 ---- 0 to <4
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));//100 200 300 400
		}
		
		//for each :
		//for()
		
		
		
		//
		ArrayList ls = new ArrayList();
		ls.add(100);
		ls.add(12.33);
		ls.add("testing");
		ls.add(true);
		ls.add('a');
		
		System.out.println(ls);
		
		//ArrayList with Generics:
		
		ArrayList<Integer> numList = new ArrayList<Integer>();//vc=10, pc=0
		numList.add(100);
		numList.add(200);
		numList.add(null);
		
		for(Integer e : numList) {
			System.out.println(e);
		}

		System.out.println("------");

		
		ArrayList<Double> marksList = new ArrayList<Double>();//vc=10, pc=0
		marksList.add(12.33);
		marksList.add(200.00);
		
		System.out.println("------");

		ArrayList<String> browserList = new ArrayList<String>();//vc=10, pc=0
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		
		for(String e : browserList) {
			System.out.println(e);
				if(e.equals("firefox")) {
					System.out.println("enter url");
					break;
				}
		}
		
		
		System.out.println("------");
		
		ArrayList<Object> empDataList = new ArrayList<Object>();//vc=10, pc=0
		empDataList.add("Tom");
		empDataList.add(30);
		empDataList.add(12.33);
		empDataList.add('m');
		empDataList.add(true);
		
		System.out.println(empDataList);
		
		for(Object e : empDataList) {
			System.out.println(e);
		}
		
		//
		ArrayList<String> studentList = new ArrayList<String>();//vc=10, pc=0

		studentList.add(null);//0
		studentList.add("monika");//1
		studentList.add("monika");//2
		studentList.add("sunil");//3
		studentList.add("vibha");//3
		studentList.add("surya");//3
		studentList.add("sunil");//4
		studentList.add(null);
		studentList.add(null);
		
		System.out.println(studentList);
		
		System.out.println(studentList.get(1));
		
		
//		studentList.remove(4);
//		System.out.println(studentList);

		
		//
		ArrayList<String> footerList = new ArrayList<String>(50);//vc=30, pc=0
		footerList.add("contact us");//0
		footerList.add("help");//1
		footerList.add("delivery info");//2
		footerList.add("Returns");//3
		footerList.add("cart");//4
		footerList.add("accounts");//5
		
//		footerList.add(0, "Naveen");//adding at 0th index, shift will happen
//		System.out.println(footerList);
		
		footerList.set(0, "Himani");//update
		System.out.println(footerList);

		
//			for(String e : footerList) {
//				System.out.println(e);
//					if(e.equals("delivery info")) {
//						System.out.println("click on it");
//						break;
//					}
//			}

		
		
	}

}
