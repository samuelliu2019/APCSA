//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "what";

	}

	public StringChecker(String s)
	{
		word = s;

	}

   public void setString(String s)
   {
   		word = s;
   }

	public boolean findLetter(char c)
	{
		for(int i = 1; i <= word.length(); i++)
		{
			if (word.charAt(i-1) == c)
			{
			return true;
			}
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		char c = s.charAt(0);
		int index = 0;
		for (int first = word.indexOf(c); first < word.length(); first++)
		{
			while (index != (s.length()))
			{
			if (word.charAt(first) == s.charAt(index))
			{
			index++;
			}
			else
			{
				return false;
			}
			}
		}

		return true;
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}