package lab5_OOP;

import java.awt.Graphics;

public class RecurFigure {
	private int size;
	private int depth;
	
	public RecurFigure() {
		depth = 0;
		size = 100;
	}
	public void setDepth(int depth) {
		this.depth = ((depth>10)||(depth<0))?0:depth;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public RecurFigure(int depth, int size) {
		this.depth = depth;
		this.size = size;
	}
	
	private void recureFigure(Graphics g, int x, int y,int size,int depth) {
		
	}
	public void draw(Graphics g, int x, int y) {
		recureFigure(g,x,y,size,depth);
	}
}
