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
		 
		 System.out.println("############################################################");
		 System.out.println("First test : 5 random menus.");
		 		 
		 for (int i = 0; i < 5; i++) {
			theMealBuilder.build().showItems();
		}
		 
		 System.out.println("############################################################");
		 System.out.println("Second test : 3 vegi menus then 2 non vegi menus.");
	}
}
