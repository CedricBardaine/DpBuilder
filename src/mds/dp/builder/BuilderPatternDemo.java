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
		 
		 for (int i = 0; i < args.length; i++) {
			theMealBuilder.build().showItems();
		}
	}
}
