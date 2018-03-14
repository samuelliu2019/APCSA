//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.Collections;


import java.util.ArrayList;

public class School
{
 	private ArrayList<Class> classList;
 	
	
	public School()
	{
		classList = new ArrayList<Class>(0);
	}
	
	public School(int classCount)
	{
		classList = new ArrayList<Class>(classCount);
	}
	
	public void addClass(int classNum, Class s)
	{
		classList.add(classNum, s);
	}
	
	
}