package paquete2;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Figura{
	public Circulo(int positionX, int positionY, int theSize){
		super(positionX, positionY, theSize);
	}
	
	public void paint(Graphics g) {
		switch (color){
		case "blue":
			g.setColor(Color.blue);
			break;
		case "red":
			g.setColor(Color.red);
			break;
		case "black":
			g.setColor(Color.black);
			break;
		case "yellow":
			g.setColor(Color.yellow);
			break;
		case "green":
			g.setColor(Color.green);
			break;
		case "cyan":
			g.setColor(Color.cyan);
			break;
		case "purple":
			g.setColor(Color.magenta);
			break;
		case "pink":
			g.setColor(Color.pink);
			break;
		case "white":
			g.setColor(Color.white);
			break;
		case "gray":
			g.setColor(Color.gray);
			break;
		case "orange":
			g.setColor(Color.orange);
			break;
		case "brown":
			g.setColor(new Color(139, 69, 19));
			break;
		}
		g.fillOval(positionX, positionY, theSize, theSize);
		
	}
}
