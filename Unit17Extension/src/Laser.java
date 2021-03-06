import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

// TODO: Auto-generated Javadoc
/**
 * Uses the ammo class to create a triple shot.
 */
public class Laser extends MovingThing
{
	private Image image;

	/** List with all the triple shots. */
	private List<Ammo> laser;

	/**
	 * Instantiates a new triple shot.
	 */
	public Laser()
	{
		laser = new ArrayList<Ammo>();
	}

	/**
	 * Adds a new tripleshot to the tripleshot list.
	 *
	 * @param center ammo of the triple
	 * @param left ammo of the triple
	 * @param right ammo of the triple
	 */
	public void add(Ammo al)
	{
		laser.add(al);
		
	}
	
	/**
	 * Draws the green bullets
	 *
	 * @param the graphics window that the bullets will be on
	 */
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < laser.size(); i++){
			window.setColor(Color.WHITE);
			window.fillRect(laser.get(i).getX(), laser.get(i).getY(), 5, 500);}
	}

	/**
	 * Updates location of the bullets
	 */
	public void moveEmAll()
	{
		for(int i = 0; i < laser.size(); i++){
			laser.get(i).setY(laser.get(i).getY()+laser.get(i).getSpeed());
		}
	}

	/**
	 * Gets rid of bullets that have hit aliens or have gone out of bounds
	 *
	 * @param the graphics window that the bullets will be on
	 */
	public void cleanEmUp(Graphics window)
	{
		for(int i = 0; i < laser.size(); i++){
			if(laser.get(i).getY()<-5){
				laser.get(i).setSpeed(0);
			}
			window.setColor(Color.black);
			window.fillRect(laser.get(i).getX(), laser.get(i).getY(), 5, 7);
			if(laser.get(i).getSpeed()==0){
				window.setColor(Color.black);
				window.fillRect(laser.get(i).getX(), laser.get(i).getY(), 5, 7);
				laser.remove(i);
			}
		}
		
	}

	
	/**
	 * Gets the list.
	 *
	 * @return the list with triple shots
	 */
	public List<Ammo> getList()
	{
		return laser;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "";
	}

	@Override
	public void setSpeed(int s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics window) {
		URL url = getClass().getResource("\\ship.jpg");
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}