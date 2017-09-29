

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;


public class Figures extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel figures;
	public int fig;
	

	public int getFig() {
		return fig;
	}

	public void setFig(int fig) {
		this.fig = fig;
	}
	
	public Figures() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(500, 200, 260, 240);
		figures = new JPanel();
		figures.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(figures);
		
		JButton RECTANGULO = new JButton("Rectangulo");
		RECTANGULO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFig(1);
				System.out.println("Esto genera un Rectangulo "+getFig());
			setVisible(false);
			}
		});
		
		JButton TRIANGULO = new JButton("Triangulo");
		TRIANGULO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFig(2);
				System.out.println("Esto genera un Triangulo "+getFig());
			setVisible(false);
			}
		});
		
		JButton CUADRADO = new JButton("Cuadrado");
		CUADRADO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFig(3);
				System.out.println("Esto genera al lapiz "+getFig());
				setVisible(false);
			}
		});
		
		JButton CIRCULO = new JButton("Circulo");
		CIRCULO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setFig(4);
				System.out.println("Esto genera un Circulo "+getFig());
				setVisible(false);
			}
		});
		
		
		GroupLayout gl_figures = new GroupLayout(figures);
		gl_figures.setHorizontalGroup(
			gl_figures.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_figures.createSequentialGroup()
					.addGroup(gl_figures.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_figures.createSequentialGroup()
							.addComponent(RECTANGULO, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TRIANGULO, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_figures.createSequentialGroup()
							.addComponent(CUADRADO, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(CIRCULO, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(82, Short.MAX_VALUE))
		);
		gl_figures.setVerticalGroup(
			gl_figures.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_figures.createSequentialGroup()
					.addGroup(gl_figures.createParallelGroup(Alignment.LEADING)
						.addComponent(RECTANGULO, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(TRIANGULO, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_figures.createParallelGroup(Alignment.LEADING)
						.addComponent(CUADRADO, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(CIRCULO, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		figures.setLayout(gl_figures);
	}

}
