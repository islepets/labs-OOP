package lab5_OOP;

import java.awt.Graphics;
	
public class RecurStar5 extends RecurFigure {
	private int size;
	private int depth;
	
	public RecurStar5() {
		depth = 0;
		size = 100;
	}
	public void setDepth(int depth) {
		this.depth = ((depth>10)||(depth<0))?0:depth;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public RecurStar5(int depth, int size) {
		this.depth = depth;
		this.size = size;
	}
	
	public void drawStar5(Graphics g, int x, int y, int size){
		 g.drawLine(x-size, y, x - size / 4, y);
	        g.drawLine(x - size / 4, y, x, y - size);
	        g.drawLine(x, y - size, x + size / 4, y);
	        g.drawLine(x + size / 4, y, x + size, y);
	        g.drawLine(x + size, y, x + size / 4, y + size / 4);
	        g.drawLine(x + size / 4, y + size / 4, x + size / 2, y + size);
	        g.drawLine(x + size / 2, y + size, x, y + size / 2);
	        g.drawLine(x, y + size / 2, x - size / 2, y + size);
	        g.drawLine(x - size / 2, y + size, x - size / 4, y + size / 4);
	        g.drawLine(x - size / 4, y + size / 4, x-size, y);
	}
	
	private void recureFigure(Graphics g, int x, int y,int size,int depth) {
		if(depth <=0)
			return;
		drawStar5(g, x, y, size);
		recureFigure(g,x+size/35,y-size,size/2,depth-1);
		recureFigure(g,x+size/2,y+size,size/2,depth-1);
		recureFigure(g,x-size/2,y+size,size/2,depth-1);
		recureFigure(g,x+size,y-size/7,size/2,depth-1);
		recureFigure(g,x-size,y-size/7,size/2,depth-1);
	}
	public void draw(Graphics g, int x, int y) {
		recureFigure(g,x,y,size,depth);
	}
}


