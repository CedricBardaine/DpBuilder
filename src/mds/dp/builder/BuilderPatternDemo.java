package mds.dp.builder;

/**
 * Asks to the MealBuilder
 * Use the classes to prove it works. 
 * @author cedri
 *
 */
public class BuilderPatternDemo {
	/**
	 * Uses the MealBuilder to init several menus and display their composition in the console. 
	 * @param args
	 */
	public static void main(String[] args) {
		 final MealBuilder theMealBuilder = new MealBuilder() ; 
		 
		 System.out.println();
		 System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
		 System.out.println("EX1 TESTS : ");
		 System.out.println();
		 
		 System.out.println();
		 System.out.println("############################################################");
		 System.out.println("First test : 5 random menus.");
		 		 
		 for (int i = 0; i < 5; i++) {
			theMealBuilder.buildARandom().showItems();
		}
		 
		 System.out.println();
		 System.out.println("############################################################");
		 System.out.println("Second test : 3 veggie menus then 2 non veggie menus.");
		 
		 Meal meal1 ; 
		 Meal meal2 ; 
		 Meal meal3 ; 
		 Meal meal4 ; 
		 Meal meal5 ; 
		 
		 theMealBuilder.prepreVegMeal() ; 
		 meal1 = theMealBuilder.build() ; 
		 
		 theMealBuilder.prepreVegMeal() ; 
		 meal2 = theMealBuilder.build() ; 
		 
		 theMealBuilder.prepreVegMeal() ; 
		 meal3 = theMealBuilder.build() ; 
		 
		 theMealBuilder.prepareNonVegMeal() ; 
		 meal4 = theMealBuilder.build() ; 
		 
		 theMealBuilder.prepareNonVegMeal() ; 
		 meal5 = theMealBuilder.build() ; 
		 
		 meal1.showItems();
		 meal2.showItems();
		 meal3.showItems();
		 meal4.showItems();
		 meal5.showItems();
		 
		 System.out.println();
		 System.out.println("############################################################");
		 System.out.println("Third test : 2 veggie & 1 non veggie in one menu.");
		
		 Meal meal6 ; 
		 
		 theMealBuilder.prepreVegMeal() ; 
		 theMealBuilder.prepreVegMeal() ; 
		 theMealBuilder.prepareNonVegMeal() ; 
		 meal6 = theMealBuilder.build() ; 
		 meal6.showItems(); 
		 
		 System.out.println("The total price is about "+ meal6.getCost() +"ï¿½") ;
		 
		 System.out.println();
		 System.out.println("############################################################");
		 System.out.println("Fourst test : a menu without order.");
		 
		 Meal meal7 ; 
		 
		 meal7 = theMealBuilder.build() ; 
		 
		 try { meal7.showItems(); }
		catch(NullPointerException e) {}
		 
		 System.out.println();
		 System.out.println("############################################################");
		 System.out.println("END of tests.");
		 System.out.println("Note that if you see '?' character in console, it may be a '°' or a '€' character.");
		 
		 
		 
		 
		 
		 
		 
		 System.out.println();
		 System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
		 System.out.println("EX2 TESTS : ");
		 System.out.println();
		 
		 System.out.println();
		 System.out.println("############################################################");
		 System.out.println("First test : a veggie menu with a Game.");
		 
		 System.out.println("Initialising a Meal...");
		 Meal meal8 ; 
		 System.out.println("Preparing a veggie buger... ");
		 theMealBuilder.prepreVegMeal() ; 
		 System.out.println("Adding a random game to the Meal...");
		 theMealBuilder.addGameToAMeal(0) ; 
		 System.out.println("Building the Meal...");
		 meal8 = theMealBuilder.build();
		 System.out.println("Showing the Meal :");
		 meal8.showItems();
		 
		 System.out.println();
		 System.out.println("############################################################");
		 System.out.println("Second test : a veggie menu with 4 CarGame. With a little luck, you might have 'The rarest car' !");
		 
		 theMealBuilder.prepreVegMeal() ; 
		 for (int i = 0; i < 4; i++) { theMealBuilder.addGameToAMeal(1) ; }
		 meal8 = theMealBuilder.build();
		 meal8.showItems();
		 

	}
}
