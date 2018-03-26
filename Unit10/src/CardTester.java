/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test = new Card("jack","hearts",11);
		System.out.println(test);
		Card test2 = new Card("queen","hearts",12);
		System.out.println(test2);
		Card test3 = new Card("king","hearts",13);
		System.out.println(test3);
	}
}
