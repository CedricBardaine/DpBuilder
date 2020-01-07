package mds.dp.builder;

public class Bag implements Packing{
	String type ; 
	
	public Bag() {
		this.type = "plastic" ;
	}
	
	@Override
	public String getType() {
		return this.type ; 
	}

}
