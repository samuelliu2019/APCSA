//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = 'A';

	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{

		if (theChar < 91 && theChar > 64)
		{
			return true;
		}

		return false;
	}

	public boolean isLower( )
	{
		if (theChar < 123 && theChar > 96)
		{
			return true;
		}

		return false;
	}
	
	public boolean isNumber( )
	{

		if (theChar < 58 && theChar > 47)
		{
			return true;
		}

		return false;
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{


		if (isLower() == true)
			
		{

		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	 
		
		}
		
		if (isUpper() == true)
			
		{

		return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";	 
		
		}
		
		if (isNumber() == true)
			
		{

		return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";	 
		
		}
		
		else
			
		{
			return ""+getChar() + " is not an uppercase/lowercase character or number. ASCII == " + getASCII() + "\n";	 
		}
	}
}