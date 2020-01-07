package mds.dp.builder;

public abstract class Burger implements Item {
	Wrapper theWrapper ;
	
	String name ;
	float price ; 

	@Override
	public String name() {
		return this.name ; 
	}

	@Override
	public Packing packing() {
		return this.theWrapper ; 
	}

	@Override
	public float price() {
		return this.price ;
	} 
}
