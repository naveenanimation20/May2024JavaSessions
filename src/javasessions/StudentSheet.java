package javasessions;

public class StudentSheet {
	
	//WAF: getStudentMarks(String name)
	//return: marks(int)
	//0 to 100
	//studnet is not found : return -1
	
	
	public int getStudentMarks(String name) {
		System.out.println("student name : " + name);
		
		switch (name.toLowerCase().trim()) {
		case "priya":
			return 90;
		case "ravi":
			return 10;
		case "shikha":
			return 100;
		default:
			System.out.println("plz pass the right student name " + name);
			return -1;
		}
	}
	
	

	public static void main(String[] args) {
		StudentSheet sh = new StudentSheet();
		int m = sh.getStudentMarks("shikha");
		System.out.println(m);
		if(m>0) {
			System.out.println("print marksheet");
		}
		
	}

}
