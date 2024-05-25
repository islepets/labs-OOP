package lab5_OOP;

import java.awt.Graphics;
	
public class RecurStar45 extends RecurFigure {
	private int size;
	private int depth;
	
	public RecurStar45() {
		depth = 0;
		size = 100;
	}
	public void setDepth(int depth) {
		this.depth = ((depth>10)||(depth<0))?0:depth;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public RecurStar45(int depth, int size) {
		this.depth = depth;
		this.size = size;
	}
	
	public void drawStar4(Graphics g, int x, int y, int size){
		g.drawLine(x, y, x - size/4, y - size);
		g.drawLine(x - size/4, y - size, x - size/2, y);
		g.drawLine(x - size/2, y, (int) (x - size*1.3), y + size/3);
		g.drawLine((int) (x - size*1.3), y + size/3, x - size/2, y + size/2);
		g.drawLine(x - size / 2, y + size/2, x - size/4, (int) (y + size*1.3));
		g.drawLine(x - size/4, (int) (y + size*1.3), x, y + size/2);
		g.drawLine(x, y + size/2, (int) (x + size*0.75), y + size/4);
		g.drawLine((int) (x + size*0.75), y + size/4, x, y);
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
	private void recureFigure4(Graphics g, int x, int y,int size,int depth) {
		if(depth <=0)
			return;
		drawStar4(g, x, y, size);
		recureFigure5(g,x-size/4,y-size,size/2,depth-1);
		recureFigure5(g,x-size/4,y+size,size/2,depth-1);
		recureFigure5(g,x-size-20,y+size/9,size/2,depth-1);
		recureFigure5(g,(int) (x+size/1.5),y+size/7,size/2,depth-1);
	}
	private void recureFigure5(Graphics g, int x, int y,int size,int depth) {
		if(depth <=0)
			return;
		drawStar5(g, x, y, size);
		recureFigure4(g,x-size+55,y-size,size/2,depth-1);
		recureFigure4(g,x+size/2+10,y+size-10,size/2,depth-1);
		recureFigure4(g,x-size/2,y+size-10,size/2,depth-1);
		recureFigure4(g,x+size,y-size/7,size/2,depth-1);
		recureFigure4(g,x-size+10,y-size/7,size/2,depth-1);
	}
	public void draw(Graphics g, int x, int y) {
		recureFigure4(g,x,y,size,depth);
	}
}


