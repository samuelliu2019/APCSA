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
public class Triple extends MovingThing
{
	private Image image;

	/** List with all the triple shots. */
	private List<Ammo> triple;

	/**
	 * Instantiates a new triple shot.
	 */
	public Triple()
	{
		triple = new ArrayList<Ammo>();
	}

	/**
	 * Adds a new tripleshot to the tripleshot list.
	 *
	 * @param center ammo of the triple
	 * @param left ammo of the triple
	 * @param right ammo of the triple
	 */
	public void add(Ammo al, Ammo a2, Ammo a3)
	{
		triple.add(al);
		triple.add(a2);
		triple.add(a3);
		
	}
	
	/**
	 * Draws the green bullets
	 *
	 * @param the graphics window that the bullets will be on
	 */
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < triple.size(); i+=3){
			window.setColor(Color.GREEN);
			window.fillRect(triple.get(i).getX(), triple.get(i).getY(), 5, 5);
		}
		for(int i = 1; i < triple.size(); i+=3){
			window.setColor(Color.RED);
			window.fillRect(triple.get(i).getX(), triple.get(i).getY(), 5, 5);
		}
		for(int i = 2; i < triple.size(); i+=3){
			window.setColor(Color.BLUE);
			window.fillRect(triple.get(i).getX(), triple.get(i).getY(), 5, 5);
		}
	}

	/**
	 * Updates location of the bullets
	 */
	public void moveEmAll()
	{
		for(int i = 0; i < triple.size(); i+=3){
			triple.get(i).setY(triple.get(i).getY()+triple.get(i).getSpeed());
		}
		for(int i = 1; i < triple.size(); i+=3){
			triple.get(i).setY(triple.get(i).getY()+triple.get(i).getSpeed());
			triple.get(i).setX(triple.get(i).getX()+triple.get(i).getSpeed());

		}
		for(int i = 2; i < triple.size(); i+=3){
			triple.get(i).setY(triple.get(i).getY()+triple.get(i).getSpeed());
			triple.get(i).setX(triple.get(i).getX()-triple.get(i).getSpeed());

		}
	}

	/**
	 * Gets rid of bullets that have hit aliens or have gone out of bounds
	 *
	 * @param the graphics window that the bullets will be on
	 */
	public void cleanEmUp(Graphics window)
	{
		for(int i = 0; i < triple.size(); i++){
			if(triple.get(i).getY()<-5){
				triple.get(i).setSpeed(0);
			}
			window.setColor(Color.black);
			window.fillRect(triple.get(i).getX(), triple.get(i).getY(), 5, 7);
			if(triple.get(i).getSpeed()==0){
				window.setColor(Color.black);
				window.fillRect(triple.get(i).getX(), triple.get(i).getY(), 5, 7);
				triple.remove(i);
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
		return triple;
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