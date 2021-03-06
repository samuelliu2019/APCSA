//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		setWord(s);
	}
	public void setWord(String s)
	{
		word = s;
	}
	public String getWord()
	{
		return word;
	}
	public int getLength()
	{
		return word.length();
	}

	public int compareTo( Word rhs )
	{
		if(this.getLength()>rhs.getLength())
		{
			return 1;
		}
		if(this.getLength()<rhs.getLength())
		{
			return -1;
		}
		if(this.getLength() == rhs.getLength())
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
			while(index!=this.getLength());
			
		}
		
		
		
		return 0;
	}

	public String toString()
	{
		return "";
	}
}