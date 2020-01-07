package mds.dp.builder;

public abstract class ColdDrink implements Item{
	Bottle theBottle ; 
	
	String name ; 
	float price ; 
	
	@Override
	public String name() {
		return this.name ; 
	}

	@Override
	public Packing packing() {
		return this.theBottle ; 
	}

	@Override
	public float price() {
		return this.price ; 
	}

//	/// getters & setters 
//
//	public Bottle getTheBottle() {
//		return theBottle;
//	}
//
//	public void setTheBottle(Bottle theBottle) {
//		this.theBottle = theBottle;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public float getPrice() {
//		return price;
//	}
//
//	public void setPrice(float price) {
//		this.price = price;
//	}
	
	
}
