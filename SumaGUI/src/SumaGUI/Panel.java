package SumaGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Number addition: Introducción a la interfaz gráfica de usuario (GUI) Para
 * familiarizarte con los componentes del entorno gráfico, realiza el siguiente
 * tutorial para principiantes. Enseña cómo crear una interfaz gráfica de
 * usuario sencilla y añade una sencilla funcionalidad de back-end. En
 * particular, se muestra cómo codificar el comportamiento de los botones y
 * campos en un formulario Swing.
 * 
 * @author Antonio Luque Bravo
 * @author Óscar Heredia Tartajo
 * @version 2.0
 */
public class Panel {

	private JFrame frame;
	private Suma suma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel window = new Panel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnElementoMenu = new JMenu("Elemento Menu");
		menuBar.add(mnElementoMenu);

		JMenuItem mntmSuma = new JMenuItem("suma");
		mntmSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				suma = new Suma();
				suma.setVisible(true);
			}
		});
		mnElementoMenu.add(mntmSuma);
	}

}
