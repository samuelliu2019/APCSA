//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 1;
		letter = "a";
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < size; i++)
		{
			int j = 0;
			for (int run = 0; run < size - i - 1; run++)
			{
				output = output + " ";
				j++;
			}
			for (int k = j; k < size; k++)
			{
				output = output + letter;
			}
			j = 0;
			output = output +"\n";
		}
		return output+"\n";
	}
}