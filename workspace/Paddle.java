/* author: Nailah G.
 * date: 12/4/24
 * General description: Controls how the player can move the paddle across the screen based on it's position on the map
 * 
 */


import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	//your code here!
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int height;
	private int width;
	private int velocity = 0;
	
	//constructor(s):
	public Paddle(int initXPos, int initYPos, int initHeight, int initWidth ) {
		x = initXPos;
		y = initYPos;
		height = initHeight;
		width = initWidth;

	}

	//getters and setters
	public int getX() {
		return x ;
	}

	public void setX (int x){
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity (int velocity) {
		this.velocity = velocity;
	}

	//methods:

	// pre-condtition: graphics g class must be used/have no errors
	//post-condition: Paddle will be drawn with color
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}

	// pre-condition:velocity must be 0 or above
	//post-condition: the x position of the paddle moves based on the velocity
	public void move() {
		x += velocity;

		if (x < 0) {
			x = 0;
		}
		if (x + width > 500) {
			x = 500 - width;
		}
	}
	// pre-condition: velocity must be 0 or above
	// post-condition: velocity increases based on xy parameter
	
	public void addVelocity ( int xy) {
		velocity = xy;
		x += velocity;

		if (x < 0) {
			x = 0;
		}
		if (x + width > 500) {
			x = 500 - width;
		}
	}


	
	
}
