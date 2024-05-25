package lab6_OOP;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
	
	public int figureType = 0;
	public int[][]array;
	
	
	public void setArray(int [][]array, int n,int m){
		array = new int[n][m];
		this.array=array;
		repaint();
	}
	
	public void visualArray(Graphics g) {
		int array[][]= UpdateArray.array();
		
		int n=UpdateArray.n1;
		int m=UpdateArray.m1;				
			
		for(int i=0; i<array.length; i++) {
		    for(int j=0; j<array[1].length; j++) {
		        g.setColor(Color.GRAY);
		        g.drawRect(141+45*j, 150+45*i, 45, 45);

		        switch(array[i][j]) {
		            case 0: 
		                g.setColor(new Color(19, 126, 0));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 1: 
		                g.setColor(new Color(253, 255, 56));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 2:
		                g.setColor(new Color(176, 0, 0));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 3:
		                g.setColor(new Color(200, 162, 200));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 4:
		                g.setColor(new Color(175, 111, 9));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 5:
		                g.setColor(new Color(0, 255, 200));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 6:
		                g.setColor(new Color(138, 149, 151));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 7:
		                g.setColor(new Color(50, 10, 255));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 8:
		                g.setColor(new Color(0, 0, 0));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		            case 9:
		                g.setColor(new Color(0, 0, 255));
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;

		            default:
		                g.setColor(Color.RED);
		                g.fillRect(141+45*j, 150+45*i, 45, 45);
		                break;
		        }
		    }
		}				
		array = UpdateArray.isRow(array,n,m);
		for(int i=0; i<array.length; i++) {
		    for(int j=0; j<array[1].length; j++) {
		        g.setColor(Color.GRAY);
		        g.drawRect(441+45*j, 150+45*i, 45, 45);

		        switch(array[i][j]) {
		            case 0: 
		                g.setColor(new Color(19, 126, 0));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 1: 
		                g.setColor(new Color(253, 255, 56));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 2:
		                g.setColor(new Color(176, 0, 0));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 3:
		                g.setColor(new Color(200, 162, 200));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 4:
		                g.setColor(new Color(175, 111, 9));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 5:
		                g.setColor(new Color(0, 255, 200));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 6:
		                g.setColor(new Color(138, 149, 151));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 7:
		                g.setColor(new Color(50, 10, 255));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 8:
		                g.setColor(new Color(0, 0, 0));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		            case 9:
		                g.setColor(new Color(0, 0, 255));
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;

		            default:
		                g.setColor(Color.RED);
		                g.fillRect(441+45*j, 150+45*i, 45, 45);
		                break;
		        }
		    }
		}
		array = UpdateArray.isColmn(array,n,m);
		for(int i=0; i<array.length; i++) {
		    for(int j=0; j<array[1].length; j++) {
		        g.setColor(Color.GRAY);
		        g.drawRect(741+45*j, 150+45*i, 45, 45);

		        switch(array[i][j]) {
		            case 0: 
		                g.setColor(new Color(19, 126, 0));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 1: 
		                g.setColor(new Color(253, 255, 56));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 2:
		                g.setColor(new Color(176, 0, 0));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 3:
		                g.setColor(new Color(200, 162, 200));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 4:
		                g.setColor(new Color(175, 111, 9));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 5:
		                g.setColor(new Color(0, 255, 200));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 6:
		                g.setColor(new Color(138, 149, 151));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 7:
		                g.setColor(new Color(50, 10, 255));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 8:
		                g.setColor(new Color(0, 0, 0));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		            case 9:
		                g.setColor(new Color(0, 0, 255));
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;

		            default:
		                g.setColor(Color.RED);
		                g.fillRect(741+45*j, 150+45*i, 45, 45);
		                break;
		        }
		    }
		}
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		visualArray(g);
	}
}
