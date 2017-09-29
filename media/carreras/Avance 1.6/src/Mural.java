import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Mural extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public int figu;
	Figures window = new Figures();
	public int caso;

	
	/**
	 * Launch the application.
	 */
	JButton clearBtn, blackBtn, blueBtn, redBtn, magnetaBtn, greenBtn, yellowBtn, orangeBtn, cyanBtn, grayBtn, pinkBtn, figureBtn,minusBtn, plusBtn, undoBtn, moveBtn;
	AreaDibujo areaDibujo;
	ActionListener actionListener =  new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == clearBtn ){
				areaDibujo.clear();
			}else if (e.getSource() == blackBtn){
				areaDibujo.black();
			}else if (e.getSource() == blueBtn){
				areaDibujo.blue();
			}else if (e.getSource() == greenBtn){
				areaDibujo.green();
			}else if (e.getSource() == redBtn){
				areaDibujo.red();
			}else if (e.getSource() == magnetaBtn){
				areaDibujo.magenta();
			}else if (e.getSource() == yellowBtn){
				areaDibujo.yellow();
			}else if (e.getSource() == orangeBtn){
				areaDibujo.orange();
			}else if (e.getSource() == cyanBtn){
				areaDibujo.cyan();
			}else if (e.getSource() == grayBtn){
				areaDibujo.gray();
			}else if (e.getSource() == pinkBtn){
				areaDibujo.pink();
			}
		}
	};
	
	public Mural() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//creamos los controles para los colores
		JPanel controles = new JPanel();
		controles.setBounds(6, 312, 639, 78);
		
		figureBtn = new JButton("Figures");
		figureBtn.setSize(76, 60);
		figureBtn.setLocation(89, 12);
		figureBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					window.setVisible(true);
					System.out.println("Desplegar una ventana con las figuras posibles");
			}
		});
		
		clearBtn = new JButton("Clear");
		clearBtn.setBounds(557, 17, 76, 40);
		clearBtn.addActionListener(actionListener);
		blackBtn = new JButton("Black");
		blackBtn.setForeground(Color.BLACK);
		blackBtn.setBackground(Color.BLACK);
		blackBtn.setBounds(294, 5, 29, 29);
		blackBtn.addActionListener(actionListener);
		greenBtn = new JButton("Green");
		greenBtn.setForeground(Color.GREEN);
		greenBtn.setBackground(Color.GREEN);
		greenBtn.setBounds(327, 5, 29, 29);
		greenBtn.addActionListener(actionListener);
		redBtn = new JButton("Red");
		redBtn.setBackground(Color.RED);
		redBtn.setForeground(Color.RED);
		redBtn.setBounds(360, 5, 29, 29);
		redBtn.addActionListener(actionListener);
		magnetaBtn = new JButton("Magenta");
		magnetaBtn.setForeground(Color.MAGENTA);
		magnetaBtn.setBackground(Color.MAGENTA);
		magnetaBtn.setBounds(394, 5, 29, 29);
		magnetaBtn.addActionListener(actionListener);
		blueBtn = new JButton("Blue");
		blueBtn.setForeground(Color.BLUE);
		blueBtn.setBackground(Color.BLUE);
		blueBtn.setBounds(261, 5, 29, 29);
		blueBtn.addActionListener(actionListener);
		
		areaDibujo = new AreaDibujo();
		areaDibujo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				areaDibujo.setShape(window.getFig());
			}
		});
		
				
		areaDibujo.setBounds(6, 1, 639, 299);
		contentPane.add(areaDibujo);
		
		yellowBtn = new JButton ("Yellow");
		yellowBtn.setForeground(Color.YELLOW);
		yellowBtn.setBackground(Color.YELLOW);
		yellowBtn.setBounds(294, 43, 29, 29);
		yellowBtn.addActionListener(actionListener);//OJO
		orangeBtn = new JButton ("Orange");
		orangeBtn.setForeground(Color.ORANGE);
		orangeBtn.setBackground(Color.ORANGE);
		orangeBtn.setBounds(261, 43, 29, 29);
		orangeBtn.addActionListener(actionListener);
		grayBtn = new JButton ("Gray");
		grayBtn.setForeground(Color.GRAY);
		grayBtn.setBackground(Color.GRAY);
		grayBtn.setSize(29, 29);
		grayBtn.setLocation(360, 43);
		grayBtn.addActionListener(actionListener);
		cyanBtn = new JButton ("Cyan");
		cyanBtn.setForeground(Color.CYAN);
		cyanBtn.setBackground(Color.CYAN);
		cyanBtn.setSize(29, 29);
		cyanBtn.setLocation(327, 43);
		cyanBtn.addActionListener(actionListener);
		pinkBtn= new JButton("Pink");
		pinkBtn.setBackground(Color.PINK);
		pinkBtn.setForeground(Color.PINK);
		pinkBtn.setSize(29, 29);
		pinkBtn.setLocation(394, 43);
		pinkBtn.addActionListener(actionListener);
		
		minusBtn= new JButton ("-");
		minusBtn.setSize(40, 40);
		minusBtn.setLocation(492, 17);
		plusBtn= new JButton ("+");
		plusBtn.setSize(40, 40);
		plusBtn.setLocation(440, 17);
		moveBtn = new JButton ("Move");
		moveBtn.setSize(71, 61);
		moveBtn.setLocation(6, 11);
		undoBtn = new JButton ("Undo");
		undoBtn.setSize(76, 60);
		undoBtn.setLocation(173, 12);
		
				
		controles.setLayout(null);
		controles.add(blueBtn);
		
		//agregar botones al panel de control
		controles.add(greenBtn);
		controles.add(blackBtn);
		controles.add(greenBtn);
		controles.add(redBtn);
		controles.add(magnetaBtn);
		controles.add(clearBtn);
		controles.add(yellowBtn);
		controles.add(orangeBtn);
		controles.add(cyanBtn);
		controles.add(grayBtn);
		controles.add(pinkBtn);
		controles.add(figureBtn);
		controles.add(minusBtn);
		controles.add(plusBtn);
		controles.add(moveBtn);
		controles.add(undoBtn);
		
		
		//agregar controles al panel de contenido
		contentPane.add(controles);
	}

}
