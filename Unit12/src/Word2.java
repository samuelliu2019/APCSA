//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s;

	}
	public String getWord()
	{
		return word;
	}
	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;

		for(int i = 0; i < vowels.length(); i++)
			for(int j = 0; j < word.length(); j++)
			{
				if(word.charAt(j)==vowels.charAt(i))
				{
				vowelCount += 1;
				}
			}




		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		if(this.numVowels()>rhs.numVowels())
		{
			return 1;
		}
		if(this.numVowels()<rhs.numVowels())
		{
			return -1;
		}
		if(this.numVowels() == rhs.numVowels())
		{
			int index = 0;
			do
			{
				
				if(this.getWord().charAt(index) > rhs.getWord().charAt(index))
				{
					return 1;
				}
				if(this.getWord().charAt(index) < rhs.getWord().charAt(index))
				{
					return -1;
				}
				if(this.getWord().charAt(index) == rhs.getWord().charAt(index))
				{
					
					index += 1;
				}
 			}
			while(index!=getWord().length());
			
		}


	
		return -1;
	}

	public String toString()
	{
		return word;
	}
 
}