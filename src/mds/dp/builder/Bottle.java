
package mds.dp.builder;

public class Bottle implements Packing {
String type ; 

public Bottle() {
	this.type = "plastic" ; 
}
	@Override
	public String getType() {
		return this.type;
	}

}
