package Test;

public class Dog {

	private String dogName;
	private int dogAge;
	private String ownerName;
	private int phoneNum;
	
	public Dog() {
		super();
	}

	public Dog(String dogName, int dogAge, String ownerName, int phoneNum) {
		super();  
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.ownerName = ownerName;
		this.phoneNum = phoneNum;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
