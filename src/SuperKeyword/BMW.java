package SuperKeyword;

public class BMW extends Car{
	
	int speed = 300;
	
	
	@Override
	public void start() {
		//start();//BMW
		super.start();//car 
		System.out.println("BMW -- start");
		super.refuel();
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoParking");
		//start();//bmw -- no
		super.start();
	}
	
	public void displaySpeed() {
		System.out.println("speed is : " + speed);//300
		System.out.println("parent speed: " + super.speed);//100
		System.out.println(super.speed);
	}

	
}
