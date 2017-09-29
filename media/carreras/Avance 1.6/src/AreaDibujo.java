import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComponent;

import paquete2.Circulo;
import paquete2.Cuadrado;
import paquete2.Figura;
import paquete2.Rectangulo;
import paquete2.Triangulo;


public class AreaDibujo extends JComponent{
	private static final long serialVersionUID = 1L;
	//ES LA IMAGEN EN LA QUE VAMOS A DIBUJAR
	private Image image;
	//Ghraphics 2D es con lo que dibujaremos
	private Graphics2D g2;
	//Coordenadas del raton
	private int actualX, actualY, viejoX, viejoY;
	private Figura rectangulo;
	private Figura circulo;
	private Figura triangulo;
	private Figura cuadrado;
	private boolean pinta = false;
	private boolean pintaCirculo = false;
	private boolean pintaTrian = false;
	private boolean pintaCuadra = false;
	private String color = "black";
	private int shape;
	
	//Constructor
	public void setShape(int shape){
		this.shape = shape;
	}
	
	public AreaDibujo() {
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 450, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
		setDoubleBuffered(false);
		
		
		addMouseListener(new MouseAdapter(){
			//guarda las coordenadas (x,y) cuando el mouse es presionado
			@Override
			public void mousePressed(MouseEvent e) {
				viejoX = e.getX();
				viejoY = e.getY();
			}
			
			public void mouseClicked(MouseEvent e){
				System.out.println("Valor en Area Dibujo "+ shape);
				switch (shape){
				case 1:
					System.out.println("caso 1");
					pinta = true;
					rectangulo = new Rectangulo(e.getX(), e.getY(), 50);
					rectangulo.setColor(color);
					repaint();
					break;
				case 2:
					System.out.println("caso 2");
					pintaTrian = true;
					triangulo = new Triangulo(e.getX(), e.getY(), 50);
					triangulo.setColor(color);
					repaint();
					break;
				case 3:
					System.out.println("caso 3");
					pintaCuadra = true;
					cuadrado = new Cuadrado(e.getX(), e.getY(), 50);
					cuadrado.setColor(color);
					repaint();
					break;
				case 4:
					System.out.println("caso 4");
					pintaCirculo = true;
					circulo = new Circulo(e.getX(), e.getY(), 50);
					circulo.setColor(color);
					repaint();
					break;
				}
			}
		});
		
		
		addMouseMotionListener(new MouseMotionAdapter(){
			//Estas son las cordenadas X,y mientras se mueve el mouse
			@Override
			public void mouseDragged(MouseEvent e) {
				actualX = e.getX();
				actualY = e.getY();
				if (g2 != null){
					// dibuja la linea si el contexto g2 no es vacio
					g2.drawLine(viejoX, viejoY, actualX, actualY);
				//refresca el area a pintar
					repaint();
					
					//guarda las cordenadas actuales y las sustituye por las antiguas
					viejoX = actualX;
					viejoY = actualY;
				}
			}
		});
		

	}
	

	protected void paintComponent(Graphics g){//OJO, es paint, no print
		if (image==null){
			//crea una imagen si no existe una
			image = createImage(getSize().width, getSize().height);
			g2 = (Graphics2D) image.getGraphics();
			//ANTIALIAS?
			//investigar sobre RENDERING HINTS
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			//limpiar area de dibujo
			clear();
		}
		g.drawImage(image, 0, 0, null);
		if (pinta){
			rectangulo.paint(g);
			pinta = false;
		}
		if (pintaCirculo){
			circulo.paint(g);
			pintaCirculo = false;
		}
		if (pintaTrian){
			triangulo.paint(g);
			pintaTrian = false;
		}
		if (pintaCuadra){
			cuadrado.paint(g);
			pintaCuadra = false;
		}
	}
	
	//metodo explícito clear
	
	public void clear(){
		//para limpiar el dibujo se inserta un recuadro blanco
		g2.setPaint(Color.white);
		g2.fillRect(0, 0, getSize().width, getSize().height);
		g2.setPaint(Color.black);
		repaint();
		pinta = false;
	}
	
	public void red(){
		g2.setPaint(Color.red);
		color = "red";
	}
	
	public void black(){
		g2.setPaint(Color.black);
		color = "black";
	}
	
	public void magenta(){
		g2.setPaint(Color.magenta);
		color = "purple";
	}
	
	public void green(){ 
		g2.setPaint(Color.green);
		color = "green";
	}
	
	public void blue(){
		g2.setPaint(Color.blue);
		color = "blue";
	}
	
	public void yellow(){
		g2.setPaint(Color.yellow);
		color = "yellow";
	}
	
	public void pink(){
		g2.setPaint(Color.pink);
		color = "pink";
	}
	
	public void gray(){
		g2.setPaint(Color.gray);
		color = "gray";
	}
	
	public void white(){
		g2.setPaint(Color.white);
		color = "white";
	}
	
	public void orange(){
		g2.setPaint(Color.orange);
		color = "orange";
	}
	
	public void cyan(){
		g2.setPaint(Color.cyan);
		color = "cyan";
	}
	
}
