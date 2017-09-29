package paquete2;

import java.awt.Graphics;

public class Figura {
	public String color;
	public int positionX;
	public int positionY;
	public int theSize;
	
	
	public Figura(int positionX, int positionY, int theSize){
		this.color = "black";
		this.positionX = positionX;
		this.positionY = positionY;
		this.theSize = theSize;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setPositionX(int positionX){
		this.positionX = positionX;
	}
	
	public void setPositionY(int positionY){
		this.positionY = positionY;
	}
	
	public void mayorSize(){
		theSize = theSize + 10;
	}
	
	public void minorSize(){
		theSize = theSize - 10;
	}
	
	public void paint(Graphics g) {}

	
}
