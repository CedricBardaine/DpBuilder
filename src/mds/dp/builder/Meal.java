package mds.dp.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> menu ;
	
	public Meal() {
		this.menu = new ArrayList<Item>() ;
	}
	
	public void addItem(Item item) {
		if ( this.menu == null) 
			this.menu = new ArrayList<Item>();
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
		int i = 1 ;
		System.out.println("____________________");
		System.out.println("This menu contains :");
		for (Item it : menu) {
			System.out.print("Item n°"+(i++)+" - - - \r");
			System.out.print( it.name() ); 
			System.out.print(" : ");
			System.out.print( it.price() +"€ \r");
			System.out.print("It is packed in : " + it.packing().getType() + "\r");
			System.out.print(" \r");
		}
		System.out.println("____________________");
	}
	
	
	
	
	
}
