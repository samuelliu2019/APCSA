//� A+ Computer Science  -  www.apluscompsci.com
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
		if (s.length() == 1)
		{
			for(int i = 1; i <= word.length(); i++)
			{
				if (word.charAt(i-1) == s.charAt(0))
				{
				return true;
				}
			}
			return false;
		}	
		else
		{
		String sub = s;
		char c = sub.charAt(0);
		int index = 0;
		int first = word.indexOf(c);
		while (index != (sub.length()))
			{
				if (word.charAt(first) == sub.charAt(index))
			{
					index++;
					first++;
			}
				else
			{
					return false;
			}
			
			}
		
		return true;
	}
	}
 
	
 	public String toString()
 	{
 		return word + "\n\n";
 	}
}