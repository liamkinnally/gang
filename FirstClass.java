import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


// Authors: Liam Kinnally and Santiago Conde
// August 16th, 2017


public class FirstClass extends Applet implements MouseListener {
private static final long serialVersionUID = 8771481514134220164L;

public static int width2;
public static int height2;
public static int width1;
public static int height1;
public static int leafWidthScale2;
public static int leafHeightScale2;
public static int leafWidthScale1;
public static int leafHeightScale1;
public static int oldX1;
public static int oldY1;
public static int scaledX1;
public static int scaledY1;


    

	public void init() {
		this.setSize(1000, 800); 
		
	
	
		leafWidthScale2 = 2;
		leafHeightScale2 = 2;
		//width2 = leafWidthScale2 * (75);
		//height2 = leafHeightScale2 * (75);
		
		leafWidthScale1 = 2;
		leafHeightScale1 = 2;
		//width1 = leafWidthScale1 * (130);
		//height1 = leafHeightScale1 * (130);
		paintPic();
		
		
		oldX1 = 140;
		oldY1 = 350;
		
		
		
		this.addMouseListener(this);
		
	}

	public void paintPic() {
    width2 = leafWidthScale2 * (75);
    height2 = leafHeightScale2 * (75);
    width1 = leafWidthScale1 * (130);
    height1 = leafHeightScale1 * (130);
 
}
	
	public void paint(Graphics g) {
	this.setBackground(Color.cyan);

		//trunk1
		g.fillRect(250, 500, 50, 350);

		//trunk2
		g.fillRect(725, 500, 50, 350);

		//treetops1
		g.setColor(Color.green);
		g.fillOval(oldX1, oldY1, width1, height1);
		
		//treetops2 with extra leaves
		g.setColor(Color.green);
		g.fillOval(610, 350, 270, 270);
		g.fillOval(550, 320, width2, height2);
		g.fillOval(500, 400, width2, height2);
		g.fillOval(610, 280, width2, height2);
		g.fillOval(665, 280, width2, height2);
		g.fillOval(740, 280, width2, height2);
		g.fillOval(845, 330, width2, height2);
		g.fillOval(870, 400, width2, height2);
		g.fillOval(845, 450, width2, height2);
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
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		leafWidthScale1++;
		leafHeightScale1++;
		leafWidthScale2++;
		leafHeightScale2++;
		width2 = leafWidthScale2 * (75);
		height2 = leafHeightScale2 * (75);
		width1 = leafWidthScale1 * (130);
		height1 = leafHeightScale1 * (130);
		repaint();
		System.out.println(width1);
		System.out.println(height1);
		System.out.println(width2);
		System.out.println(height2);
		
		
	}
	 
		

			   
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		

	}	
	
	

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		

	
}
