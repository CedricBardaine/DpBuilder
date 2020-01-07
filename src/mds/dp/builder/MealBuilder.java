package mds.dp.builder;

/**
 * Builds the Meal
 * @author cedri
 *
 */
public class MealBuilder {
	Meal theMeal ; 

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
		if ( (int) Math.random() * (1 - 0) == 1 )
			prepreVegMeal() ;
		else
			prepareNonVegMeal() ; 
		return this.theMeal ; 		
	}
}
