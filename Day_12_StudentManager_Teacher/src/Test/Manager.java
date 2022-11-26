package Test;

import java.util.ArrayList;

public class Manager {

	ArrayList<Dog> dogArr = new ArrayList<Dog>();
	
	public void add(Dog dogList) {
		this.dogArr.add(dogList);
	}
	
	public ArrayList<Dog> getDogList() {  // ?? 
		return this.dogArr;
	}
	
}
