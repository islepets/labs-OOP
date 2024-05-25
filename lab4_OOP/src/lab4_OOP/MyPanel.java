package lab4_OOP;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
	

public class MyPanel extends JPanel {
	
	 private int figureType;
	 private int [] home_x = {0,0,0,0,0,0,0};
	 private int [] home_y = {0,0,0,0,0,0,0};
	 private int toob_x[] = {0,0,0,0};
	 private int toob_y[] = {0,0,0,0};
	 private  int x1;
	 private int y1;
	 private int x2;
	 private int y2;
	 
	 
	
	public void setFigureType(int newFigureType) {
		figureType = newFigureType;
		repaint();
	}
	public void setCoor(int newX, int newY) {

		home_x[0] = newX - 70;
		home_x[1] = newX;
		home_x[2] = newX + 70;
		home_x[3] = newX - 50;
		home_x[4] = newX - 50;
		home_x[5] = newX + 50;
		home_x[6] = newX + 50;
		
		home_y[0] = newY - 30;
		home_y[1] = newY - 75;
		home_y[2] = newY - 30;
		home_y[3] = newY - 30;
		home_y[4] = newY + 50;
		home_y[5] = newY + 50;
		home_y[6] = newY - 30;
		
		toob_x[0] = newX + 50;
		toob_x[1] = newX + 50;
		toob_x[2] = newX + 35;
		toob_x[3] = newX + 35;
		
		toob_y[0] = newY - 44;
		toob_y[1] = newY - 80;
		toob_y[2] = newY - 80;
		toob_y[3] = newY - 54;
		
		x1 = newX - 50;
		y1 = newY - 50;
		x2 = newX + 100;
		y2 = newY - 50;
		
		repaint();	
	}
	private void drawHome(Graphics g) {
		 g.drawPolygon(home_x, home_y, 7);
		 g.drawPolyline(toob_x,toob_y,4);
	}
	private void drawLineFirst(Graphics g) {
		int c = y2;
		while(y2<c+100) {
			g.drawLine(x1, y1, x2, y2);
			y2+=10;
		}
		
	}
	private void drawLineSecond(Graphics g) {	
		int c = y1;
		while(y1>c-50) {
			g.drawLine(x1, y1, x2, y2);
			y1-=5;
			y2+=10;
		}
	}
	private void drawLine(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	}
	private void drawRect(Graphics g) {
		g.drawRect(x1, y1, 300, 200);
	}
	private void drawRoundRect(Graphics g) {
		g.drawRoundRect(x1, y1, 200, 100, 20, 70);
	}
	private void drawOval(Graphics g) {
		g.drawOval(x1, y1, 300, 200);
	}
	private void drawArc(Graphics g) {
		g.drawArc(x1, y1, 200, 100, 180, 180);
	}
	private void drawString(Graphics g) {
		g.drawString("Test String!", x1, y1);
	}
	private void fillOval(Graphics g) {
		g.fillOval(x1, y1, 300, 200);
	}
	private void fillRect(Graphics g) {
		g.fillRect(x1, y1, 300, 200);
	}
	
	
	
	
	public void paint(Graphics g) {
		super.paint(g);
		if (figureType == 1) {
			drawHome(g);
		}
		else if (figureType == 2) {
			g.setColor(new Color(255,0,0));
			drawLineFirst(g);
		}
		else if (figureType == 3) {
			g.setColor(new Color(255,0,0));
			drawLineSecond(g);
		}
		else if (figureType == 4) {
			g.setColor(new Color(255,0,0));
			drawLine(g);
		}
		else if (figureType == 5) {
			g.setColor(new Color(255,0,0));
			drawRect(g);
		}
		else if (figureType == 6) {
			g.setColor(new Color(255,0,0));
			drawRoundRect(g);
		}
		else if (figureType == 7) {
			g.setColor(new Color(255,0,0));
			drawOval(g);
		}
		else if (figureType == 8) {
			g.setColor(new Color(255,0,0));
			drawArc(g);
		}
		else if (figureType == 9) {
			g.setColor(new Color(255,0,0));
			drawString(g);
		}
		else if (figureType == 10) {
			g.setColor(new Color(255,0,0));
			fillOval(g);
		}
		else if (figureType == 11) {
			g.setColor(new Color(255,0,0));
			fillRect(g);
		}
		
	}
}
