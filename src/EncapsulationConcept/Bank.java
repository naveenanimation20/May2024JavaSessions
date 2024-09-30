package EncapsulationConcept;

public class Bank {

	private String name;
	private int age;// age>=15
	private String aadharNumber;
	private String phone;
	

	public Bank(String name, int age, String aadharNumber, String phone) {
		this.name = name;

		if (age >= 15) {
			this.age = age;
		}

		this.aadharNumber = aadharNumber;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 15) {
			this.age = age;
		}
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//buss logic method:
	public void openAccount() {
		if(this.age>=15) {
			System.out.println("opening the account, AC is ready to use");
			//...
			//..
		}
		else {
			System.out.println("age is less than 15, plz provide the age certificate, age should be gr than 15");
		}
	}

}
