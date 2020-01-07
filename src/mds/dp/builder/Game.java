package mds.dp.builder;

public  abstract class Game implements Item{
	Bag theBag ;
	
	String name ; 
	float price ;
	
	
	@Override
	public String name() {
		return this.name ; 
	}

	@Override
	public Packing packing() {
		return this.theBag ; 
	}

	@Override
	public float price() {
		return this.price ;
	} 
	
	
}
