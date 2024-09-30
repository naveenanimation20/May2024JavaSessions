package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		

		BMW b = new BMW();
		b.stop();//Inherited
		b.refuel();//Inherited
		b.start();//Overridden
		b.autoParking();//Individual
		b.refuel();
		b.speedTracking();
		
		BMW.billing();
		b.getInfo();		
		b.speed = 500;
		
		b.engine();
		b.bmwLoading();
		b.cruiceControl();
		
		System.out.println("BMW speed is: " + b.speed);
		System.out.println("BMW price is : " + b.price);
		
		
		System.out.println("-----");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.billing();
		c.getInfo();
		c.engine();
		c.cruiceControl();
		
		System.out.println("CAR speed is: " + c.speed);
		System.out.println("CAR price is : " + c.price);

		
		//c.speed = 400;
		
		System.out.println("-----");
		
		//audi:
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.applyBreak();
		au.theftSafety();
		au.speedTracking();
		
		System.out.println("-----");

		Vehicle vh = new Vehicle();
		vh.engine();
		
		System.out.println("-----");

		//child class object can be referred by parent class reference variable: Top Casting/Up Casting
		//can access all the overridden and inherited methods only
		//but can not access individual methods -- ref type check will be failed
		Car c1 = new BMW();//IS_A relationship
		c1.start();
		c1.stop();
		c1.refuel();
		
		Car c2 = new Audi();
		c2.start();
		c2.stop();
		c2.refuel();
		
		//
		System.out.println("-----");
		//child class object can be referred by grand parent class reference variable: Top Casting/Up Casting
		Vehicle v2 = new BMW();//IS_A relationship
		v2.engine();
		
		
		//Down casting:
		//parent class object can be referred by child class reference variable: Down Casting
		
		//BMW b1 = (BMW) new Car();//ClassCastException
		
		//BMW b3 = (BMW) new Vehicle();
		
		
		Testing t = new Testing();
		t.m1();
		
		
	}

}
