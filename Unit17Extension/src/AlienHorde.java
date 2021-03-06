//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private ArrayList<Alien> aliens = new ArrayList<Alien>();

	public AlienHorde(int size)
	{
		int x = 50;
		for(int i=0; i<size; i++)
		{
			aliens.add(new Alien(x, 50, 50, 50, 3));
			x += 50;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int j=0; j<aliens.size(); j++)
		{
			aliens.get(j).draw(window);
		}
	}
       
	public void moveEmAll()
	{

		for(int i=0; i<aliens.size(); i++)
		{
			
			aliens.get(i).move("LEFT");
			if(aliens.get(i).getX() >= 700 || aliens.get(i).getX() <= 50)
			{
				aliens.get(i).setY(aliens.get(i).getY() + 50);
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			} 

		}
	}

	public void removeDeadOnes(List<Ammo> shots, List<Ammo>triples, List<Ammo>lasers)
	{
		for(int i = 0; i < shots.size(); i++){
			for(int j = 0; j < aliens.size(); j++){
				if((shots.get(i).getX()>=aliens.get(j).getX()-5)&&(shots.get(i).getX()<=aliens.get(j).getX()+aliens.get(j).getWidth()+5)){
					if((shots.get(i).getY()>=aliens.get(j).getY()-5)&&(shots.get(i).getY()<=aliens.get(j).getY()+aliens.get(j).getHeight()+5)){
						aliens.get(j).setSpeed(0);
						aliens.remove(j);
						shots.get(i).setSpeed(0);
					}
				}
			}
		}
		for(int i = 0; i < triples.size(); i++){
			for(int j = 0; j < aliens.size(); j++){
				if((triples.get(i).getX()>=aliens.get(j).getX()-5)&&(triples.get(i).getX()<=aliens.get(j).getX()+aliens.get(j).getWidth()+5)){
					if((triples.get(i).getY()>=aliens.get(j).getY()-5)&&(triples.get(i).getY()<=aliens.get(j).getY()+aliens.get(j).getHeight()+5)){
						aliens.get(j).setSpeed(0);
						aliens.remove(j);
						triples.get(i).setSpeed(0);
					}
				}
			}
		}
		for(int i = 0; i < lasers.size(); i++){
			for(int j = 0; j < aliens.size(); j++){
				if((lasers.get(i).getX()>=aliens.get(j).getX()-5)&&(lasers.get(i).getX()<=aliens.get(j).getX()+aliens.get(j).getWidth()+5)){
					if((lasers.get(i).getY()>=aliens.get(j).getY()-5)&&(lasers.get(i).getY()<=aliens.get(j).getY()+aliens.get(j).getHeight()+5)){
						aliens.get(j).setSpeed(0);
						aliens.remove(j);
						lasers.get(i).setSpeed(0);
					}
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
