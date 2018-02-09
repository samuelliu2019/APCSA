//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "Hello World.";
		lookFor = 'l';
 	}

	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
 	}
	
 	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = "";
		for(int i = 0; i < sentence.length(); i++)
		{
			if (sentence.charAt(i) != lookFor)
			{
				cleaned = cleaned + String.valueOf(sentence.charAt(i));
			}
			
		}


		return cleaned + "\n";
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor ;
	}
}