//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		test.setRemover("I am Sam I am", 'a');
		System.out.println(test);
		System.out.println(test.removeLetters());
		test.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test);
		System.out.println(test.removeLetters());
		test.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test);
		System.out.println(test.removeLetters());
		test.setRemover("abababababa", 'b');
		System.out.println(test);
		System.out.println(test.removeLetters());
	}
}