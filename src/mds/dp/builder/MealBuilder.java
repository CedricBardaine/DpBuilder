package mds.dp.builder;

/**
 * Builds the Meal
 * 
 * @author cedri
 *
 */
public class MealBuilder {
	Meal theMeal = new Meal();

	public MealBuilder prepreVegMeal() {
		VegBurger aMiam = new VegBurger();
		Pepsi aGlou = new Pepsi();

		this.theMeal.addItem(aMiam);
		this.theMeal.addItem(aGlou);
		return this;
	}

	public MealBuilder prepareNonVegMeal() {
		ChickenBurger aMiam = new ChickenBurger();
		Coke aGlou = new Coke();

		this.theMeal.addItem(aMiam);
		this.theMeal.addItem(aGlou);
		return this;
	}

	public MealBuilder addItem(Item item) {
		this.theMeal.addItem(item);
		return this;
	}

	/**
	 * Add a Game in the current Meal. 
	 * @param gameType the type of the Game to add : 1 will add a CarGame ; 2 will add a DrawGame ; 0 or anything else will add a DrawGame.
	 * @return this MealBuilder.
	 */
	public MealBuilder addGameToAMeal(int gameType) {
		int randomForCar = (int) Math.round(Math.random() * 3) ; 
		if ( randomForCar == 3) randomForCar = (int) Math.round(Math.random() * 3) ; //pour rendre deux fois plus rare le 3
		int randomForDraw = (int) Math.round(Math.random()*1) ; 
		switch (gameType) {
		case 1:
			this.theMeal.addItem(new CarGame(randomForCar));
			break;

		case 2:
			this.theMeal.addItem(new DrawGame(randomForDraw));
			break;
		case 0:
		default:
			if ( (int) Math.round(Math.random() ) == 1)
				this.theMeal.addItem(new CarGame(randomForCar));
			else
				this.theMeal.addItem(new DrawGame(randomForDraw));
			break;
		}
		return this ; 
	}

	public Meal build() {
		if (this.theMeal == null || this.theMeal.menu.size() == 0) {
			System.err.println("No order has been made !");
			return null;
		} else {
			Meal ret = this.theMeal;
			this.theMeal = new Meal();
			return ret;
		}
	}

	public Meal buildARandom() {
		this.theMeal = new Meal();
		if ((int) Math.round(Math.random() * (1)) == 1)
			prepreVegMeal();
		else
			prepareNonVegMeal();

		Meal ret = this.theMeal;
		this.theMeal = new Meal();
		return ret;
	}
}
