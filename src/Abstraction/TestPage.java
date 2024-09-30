package Abstraction;

public class TestPage {

	public static void main(String[] args) {

		//LoginPage lp = new LoginPage();//default parent class ---> child class default
		LoginPage lp1 = new LoginPage(10,20);//default parent class ---> child class param const..
//		lp.title();
//		lp.url();
//		lp.loading();
//		lp.doLogin();
		
		
		//can not create the object of abstract class
	//	Page p = new Page();
	
		//top casting:
		//child class object can be referred by abstract parent class ref variable
//		Page pg = new LoginPage();
//		pg.title();
//		pg.url();
//		pg.loading();
		
		
		
		
		
	}

}
