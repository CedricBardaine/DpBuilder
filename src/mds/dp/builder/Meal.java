package mds.dp.builder;

import java.util.List;

public class Meal {
	List<Item> menu ;
	
	public void addItem(Item item) {
		this.menu.add(item) ; 
	}
	
	public float getCost() {
		float ret = 0 ;    
		for (Item it : this.menu) {
			ret += it.price() ; 
		}
		return ret ; 
	}
	
	public void showItems() {
		int i = 0 ;
		System.out.println("This menu contains :");
		for (Item it : menu) {
			System.out.println("Item n°"+(i++)+" - - - ");
			System.out.print( it.name() ); 
			System.out.print(" - ");
			System.out.println( it.price() +"\r");
			System.out.print("It is wrapped in : " + it.packing().getType() );
			System.out.println("- - - - - -");
		}
	}
	
	
	
	
	
}
