//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;

	
    private AlienHorde horde;
	private Bullets shots;
	private int timer = 0;
	private Triple specials;
	private boolean[] keys;
	private BufferedImage back;
	private Laser lase;
	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[7];

		//instantiate other instance variables
		//Ship, Alien
		ship= new Ship(100,100, 50, 50, 5);
		alienOne = new Alien(300,300,50,50,5);
		alienTwo = new Alien(200,200,50,50,5);
		horde = new AlienHorde(48);
		shots = new Bullets();
		lase = new Laser();
		specials = new Triple();
 		this.addKeyListener(this);
		new Thread(this).start();
		
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		
		timer++;
		
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		horde.removeDeadOnes(shots.getList(),specials.getList(),lase.getList());
		
		horde.moveEmAll();
		horde.drawEmAll(graphToBack);
		
		shots.cleanEmUp(graphToBack);
		shots.moveEmAll();
		shots.drawEmAll(graphToBack);
		specials.cleanEmUp(graphToBack);
		specials.moveEmAll();
		specials.drawEmAll(graphToBack);
		lase.drawEmAll(graphToBack);
		lase.moveEmAll();
		lase.cleanEmUp(graphToBack);
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move Ship, Alien, etc.
		if(keys[1]==true)
		{
			ship.move("RIGHT");
		}
		if(keys[2]==true)
		{
			ship.move("UP");
		}
		if(keys[3]==true)
		{
			ship.move("DOWN");
		}

		if(keys[4] == true && timer>50)
		{
			timer = 0;
			shots.add(new Ammo(ship.getX()+40, ship.getY(),-1));
 		}
		if(keys[5] == true && timer>50)
		{
			timer = 0;
 			specials.add(new Ammo(ship.getX()+40,ship.getY(),-1),new Ammo(ship.getX()+60,ship.getY(),-1),new Ammo(ship.getX()+20,ship.getY(),-1));
		}
		if(keys[6] == true && timer>10)
		{
			timer = 0;
 			lase.add(new Ammo(ship.getX()+30,ship.getY(),-25));
		}
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_A)
		{ 
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
			
		}
		if (e.getKeyCode() == KeyEvent.VK_L)
		{
			keys[5] = true;
			
		}
		if (e.getKeyCode() == KeyEvent.VK_R)
		{
			keys[6] = true;
			
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_L)
		{
			keys[5] = false;
			
		}
		if (e.getKeyCode() == KeyEvent.VK_R)
		{
			keys[6] = false;
			
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

