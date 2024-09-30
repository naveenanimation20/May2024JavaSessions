package SuperKeyword;

public class Browser implements Automation{
	
	String name;
	double version;
	
	//setter
	public void addBrowser(String name, double version) {
		this.name = name;
		this.version = version;
		
		System.out.println(Automation.time);
		
		billing();
		
		
		Automation.super.billing();//default methods
		
	}
	//getter
	public void getInfo() {
		System.out.println(name + version);
	}

	public static void main(String[] args) {

		Browser br = new Browser();

		br.addBrowser("chrome", 124.55);
		
		br.getInfo();
		
		
		
	}

}
