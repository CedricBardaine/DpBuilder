package mds.dp.builder;

public class Wrapper implements Packing {
	String type ; 
	
	public Wrapper() {
		this.type = "cardboard";
	}
	
	@Override
	public String getType() {
		return this.type ; 
	}
	
}
