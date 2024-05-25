package lab5_OOP;

import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	private RecurFigure figure = new RecurFigure();
	
	public void setfigureType(int type) {
		if (type == 1) {
			figure = new RecurStar4();
		}
		if(type == 2) {
			figure = new RecurStar5();
		}
		if (type == 3) {
			figure = new RecurStar45();
		}
		if(type == 4) {
			figure = new RecurStar54();
		}
		repaint();
	}
	public void setFigureSize(int size) {
		figure.setSize(size);
		repaint();
	}
	public void setFigureDepth(int depth) {
		figure.setDepth(depth);
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		figure.draw(g, 300, 300);
	}
}
