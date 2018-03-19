//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\lius9308\\Desktop\\lab18e.dat"));

		int size = file.nextInt();
		file.nextLine();
		String output = "";
		ArrayList<Word2> wordList = new ArrayList<Word2>();
		wordList.add(new Word2(file.nextLine()));
		int count = 1;
		for(int i = 1; i < size; i++)
		{
			count = i;
			wordList.add(new Word2(file.nextLine()));
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