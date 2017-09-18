import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	import javax.swing.JComponent;
	import javax.swing.JFrame;

	//liam kinnally, period 6
	
	public class adventure1 extends JComponent implements MouseListener {

		public static String nameOfApp = "Your Adventure!";
		
		
		public adventure1() {
			addMouseListener(this);
		}
		
		public void paint(Graphics g) {
			g.setColor(Color.white);
			g.drawString("Welcome young 'adventurer'...", 25, 50);
			g.drawString("You are sailing down a wild and dangerous river in the Congo.", 25, 175);
			g.drawString("There is a $4.6 million dollar crate of ivory waiting for you.", 25, 200);
			g.drawString("Let's get busy. (click anywhere to continue)", 25, 225);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public static void main(String[] args) {
			JFrame frame = new JFrame(nameOfApp);
			frame.getDefaultCloseOperation();
			frame.add(new adventure1());
			frame.setSize(500, 500);
			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.RED);
		}

	}
