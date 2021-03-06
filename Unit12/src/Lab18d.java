//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.Collection;
import java.util.Collections;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\lius9308\\Desktop\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		String output = "";
		ArrayList<Word> wordList = new ArrayList<Word>();
		wordList.add(new Word(file.nextLine()));
		int count = 1;
		for(int i = 1; i < size; i++)
		{
			count = i;
			wordList.add(new Word(file.nextLine()));
			while(count!= 0 && wordList.get(count).compareTo(wordList.get(count-1)) == 1)
			{
				Collections.swap(wordList, count-1, count);
				count--;
			}
 		}
		for(int i = wordList.size()-1; i>=0; i--)
		{
			System.out.println(wordList.get(i).getWord());
		}




	}
}