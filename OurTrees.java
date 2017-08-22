import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

// Authors: Liam Kinnally and Santiago Conde
// August 16th, 2017

public class OurTrees extends Applet {

public static int width;
public static int height;
public static int leafWidth;
public static int leafHeight;

	public void init() {
		this.setSize(1000, 800); 
		leafWidth = 1;
		leafHeight = 1;
		width = leafWidth * (130);
		height = leafHeight * (130);
		
	}
	
	public void paint(Graphics g) {
	this.setBackground(Color.cyan);
//trunk1
		g.fillRect(250, 500, 50, 350);
//trunk2
		g.fillRect(725, 500, 50, 350);
//treetops1
		g.setColor(Color.green);
		g.fillOval(140, 350, 270, 270);
		
//treetops2 with extra leaves
		g.setColor(Color.green);
		g.fillOval(610, 350, 270, 270);
		g.fillOval(550, 320, 120, 120);
		g.fillOval(500, 400, 160, 160);
		g.fillOval(610, 280, width, height);
		g.fillOval(665, 280, width, height);
		g.fillOval(740, 280, width, height);
		g.fillOval(845, 330, width, height);
		g.fillOval(870, 400, width, height);
		g.fillOval(845, 450, width, height);
		g.setColor(Color.red);
		g.fillOval(700, 540, 25, 25);
		g.fillOval(630, 440, 25, 25);	
		g.fillOval(820, 500, 25, 25);
		g.fillOval(760, 400, 25, 25);
		g.fillOval(730, 460, 25, 25);
		g.fillOval(860, 430, 25, 25);
		g.fillOval(660, 370, 25, 25);
		
//clouds
		g.setColor(Color.white);
		g.fillOval(200, 50, 200, 70);
		g.fillOval(275, 50, 200, 70);
		g.fillOval(750, 100, 200, 70);
		g.fillOval(675, 100, 200, 70);
	
//sun
		g.setColor(Color.yellow);
		g.fillOval(-50, -20, 200, 200);

//ground
		g.setColor(Color.darkGray);
		g.fillRect(0, 750, 1000, 100);
	
	}
	
}
