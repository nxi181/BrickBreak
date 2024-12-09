/* author: Nailah G.
 * date: 12/4/24
 * General description: How the ball moves and functions based on it's position in the game
 */

import java.awt.*;

public class Ball {
	//your code here!
	//don't forget you need instance variables:
	private int Xpos;
	private int Ypos;
	private int size;
	private int XVelocity = 2;
	private int YVelocity = 2;

	
	//constructor(s):
	public Ball (int initXPos, int initYPos, int initSize) {
		Xpos = initXPos;
		Ypos = initYPos;
		size = initSize;
	}

	// getters and setters
	public int getXpos() {
		return Xpos;
	}

	public void setXpos(int Xpos) {
		this.Xpos = Xpos;
	}

	public void setX (int x) {
		x = Xpos;
	}

	public int getYpos() {
		return Ypos;
	}

	public void setYPos(int Ypos) {
		this.Ypos = Ypos;
	}

	public void setY(int y) {
		y = Ypos;
	}

	public int getSize() {
		return size;
	}

	public void setSize (int size) {
		this.size = size;
	}

	public int getXVelocity () {
		return XVelocity;
	}

	public void setXVelocity(int XVelocity) {
		this.XVelocity = XVelocity;
	}
	
	public int getYVelocity () {
		return YVelocity;
	}

	public void setYVelocity(int YVelocity) {
		this.YVelocity = YVelocity;
	}
	
	
	//methods:

	// pre-condition: graphics class must be used/have no errors
	// post-condition: Ball will be drawn with color
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval( Xpos - size, Ypos - size, size * 2, size * 2);
	}

	// pre-condition: x and y velocity must be above 0
	// post-condition: the x and y position changes based on the velocity of the ball and size/radius
	public void move() {
		Xpos += XVelocity;
		Ypos += YVelocity;

		if (Xpos <= size) {
			Xpos = size;
			reverseX();

		}

		if (Ypos <= size) {
			Ypos = size;
			reverseY();
		}
	}
	// pre-condition: x velocity must be above 0
	// post-condition: velocity is negative/object will go backwards
	public void reverseX() {
		XVelocity = -XVelocity;
	}

	// pre-condition: y velocity must be above 0
	// post-condition: velocity is negative/object will go backwards
	public void reverseY() {
		YVelocity = -YVelocity;
	}

	

	
	

}

