//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String file;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();


	}

	public MadLib(String fileName)
	{
		this();
		file = fileName;
		loadNouns();
		loadVerbs();
		loadAdjectives();
		//load stuff
		
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
		
			
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		
		Scanner scan = new Scanner(new File("C:\\Users\\lius9308\\Desktop\\nouns.dat"));
		while(scan.hasNextLine())
		{
			nouns.add(scan.nextLine());
		}
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
			Scanner scan = new Scanner(new File("C:\\Users\\lius9308\\Desktop\\verbs.dat"));
			while(scan.hasNextLine())
			{
				verbs.add(scan.nextLine());
			}
					
	
	
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void loadAdjectives()
	{
		try{
	
			Scanner scan = new Scanner(new File("C:\\Users\\lius9308\\Desktop\\adjectives.dat"));
			while(scan.hasNextLine())
			{
				adjectives.add(scan.nextLine());
			}
	
	
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getRandomVerb()
	{
		if(verbs.size() == 0)
			return null;
		if(verbs.size() == 1)
			return verbs.get(0);
		else
			return verbs.get((int)(Math.random()*(verbs.size())));
 	}
	
	public String getRandomNoun()
	{
		
		if(nouns.size() == 0)
			return null;
		if(nouns.size() == 1)
			return nouns.get(0);
		else
			return nouns.get((int)(Math.random()*(nouns.size())));
	}
	
	public String getRandomAdjective()
	{
		
		if(adjectives.size() == 0)
			return null;
		if(adjectives.size() == 1)
			return adjectives.get(0);
		else
			return adjectives.get((int)(Math.random()*(adjectives.size())));
	}		

	public String toString()
	{
	   String output = "";
	   Scanner scan;
	   try {
		scan = new Scanner(new File(file));
	   } catch (FileNotFoundException e) {
 		e.printStackTrace();
 		return null;
	   }
	   
	   while (scan.hasNext())
	   {
		   String next = scan.next();
		   if(next.equals("#"))
			   if(scan.hasNext())
				   output += getRandomNoun() + " ";
			   else
				   output += getRandomNoun() + ".";
		   else if (next.equals("@"))
			   if(scan.hasNext())
				   output += getRandomVerb() + " ";
			   else
				   output += getRandomVerb() + ".";
		   else if (next.equals("&"))
			   if(scan.hasNext())
				   output += getRandomAdjective() + " ";
			   else
				   output += getRandomAdjective() + ".";
		   else
			   if(scan.hasNext())
				   output += next + " ";
			   else
				   output += next + ".";
	   }
	   scan.close();
	   
	   return output;
	}
}