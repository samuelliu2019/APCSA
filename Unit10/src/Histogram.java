//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
	public Histogram()
	{
	    letters = new ArrayList<Character>();
	    count = new ArrayList<Integer>();
		


	}

	public Histogram(char[] values, String fName)
	{
		this();
	    for (char c : values) {
	        letters.add(c);
	    }
	    for(int i = 0; i < letters.size(); i++)
		{
			count.add(0);
		}
		fileName = fName;
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		String allLetters = null;

        Scanner file = new Scanner(new File(fileName));

        while (file.hasNext())
        {
            String add = file.next();
            allLetters += add;
        }
		int counter = 0;
 
        for (int i = 0; i < letters.size(); i++)
        {
        	for(int j = 0; j < allLetters.length(); j++)
        	{
        		if(allLetters.charAt(j) == letters.get(i))
        		{
        			counter = count.get(i);
        			counter += 1;
        			count.set(i,counter);
        		}
        	}
        }

        
	}

	public char mostFrequent()
	{
		int index =0;
		for(int i=1; i < count.size(); i++)
		{
			if(count.get(i) > count.get(index))
			{
				index = i;
			}
		}
		return letters.get(index);
 	}

	public char leastFrequent()
	{
		int index =0;
		for(int i=1; i < count.size(); i++)
		{
			if(count.get(i) < count.get(index))
			{
				index = i;
			}
		}
		return letters.get(index);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}