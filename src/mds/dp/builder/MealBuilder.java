package mds.dp.builder;

/**
 * Builds the Meal
 * @author cedri
 *
 */
public class MealBuilder {
	Meal theMeal = new Meal() ; 

	public MealBuilder prepreVegMeal() {
		VegBurger aMiam = new VegBurger() ; 
		Pepsi aGlou = new Pepsi() ; 
		
		this.theMeal.addItem(aMiam); 
		this.theMeal.addItem(aGlou);
		return this ; 
	}
	
	public MealBuilder prepareNonVegMeal() {
		ChickenBurger aMiam = new ChickenBurger() ; 
		Coke aGlou = new Coke() ; 
		
		this.theMeal.addItem(aMiam); 
		this.theMeal.addItem(aGlou);
		return this ;
	}
	
	public MealBuilder addItem(Item item) {
		this.theMeal.addItem(item);
		return this ; 
	}
	
	public Meal build() {
		if ( this.theMeal == null || this.theMeal.menu.size() == 0 ) {
			System.err.println("No order has been made !") ; 
			return null ; 
		}
		else {
			Meal ret = this.theMeal ; 
			this.theMeal = new Meal() ; 
			return ret ; 		
		}
	}
	public Meal buildARandom() {
		this.theMeal = new Meal() ; 
		if ( (int)Math.round( Math.random() * (1) )   == 1 )
			prepreVegMeal() ;
		else
			prepareNonVegMeal() ; 
		
		Meal ret = this.theMeal ; 
		this.theMeal = new Meal() ; 
		return ret ;	
	}
}
