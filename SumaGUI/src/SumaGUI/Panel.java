package SumaGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Number addition: Introducci�n a la interfaz gr�fica de usuario (GUI) Para
 * familiarizarte con los componentes del entorno gr�fico, realiza el siguiente
 * tutorial para principiantes. Ense�a c�mo crear una interfaz gr�fica de
 * usuario sencilla y a�ade una sencilla funcionalidad de back-end. En
 * particular, se muestra c�mo codificar el comportamiento de los botones y
 * campos en un formulario Swing.
 * 
 * @author Antonio Luque Bravo
 * @author �scar Heredia Tartajo
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
