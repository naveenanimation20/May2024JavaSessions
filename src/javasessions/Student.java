package javasessions;

public class Student {
	
	
	String name;
	int age;
	String subject[];
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		
		s1.name = "Shivang";
		s1.age = 30;
		
		
		s1.subject = new String[3];//{"Java", "Maths", "Physics"};
		
		s1.subject[0] = "Java";
		
		
	}

}
