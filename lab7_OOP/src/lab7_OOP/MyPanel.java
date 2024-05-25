package lab7_OOP;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public Game game = new Game();
	private int lvl = 1;
	private	int status;
	private boolean flag = false;
	
	public void keyAction(KeyEvent e) {
		status = game.move(e);
		if (status == 3) {
			winAction();
		}
		else {
			repaint();
		}
		repaint();

	}
	public void winAction() {
		lvl++;
		if(game.nextLvl(lvl)) {
			flag = true;
		}
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		game.draw(g);
		if(game.getLvl() == 1) {
			g.setColor(new Color(0,0,0));
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
			g.drawString("Уровень 1",790, 20);
		}
		else if(game.getLvl() == 2) {
			g.setColor(new Color(0,0,0));
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
			g.drawString("Уровень 2",790, 20);
		}
		if(flag) {
			super.paint(g);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
			g.drawString("Все уровни пройдены",200, 400);
		}		
	}

	
}
