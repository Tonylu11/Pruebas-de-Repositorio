package CelsiusGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CelsiusConverterGUI extends JFrame {

	private JPanel contentPane;
	private JTextField jTextField1;
	JLabel fahrenheitLabel = new JLabel("Fahrenheit");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelsiusConverterGUI frame = new CelsiusConverterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CelsiusConverterGUI() {
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 245, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		jTextField1 = new JTextField();
		jTextField1.setBounds(20, 11, 86, 20);
		jTextField1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(jTextField1);
		jTextField1.setColumns(10);

		JLabel celsius = new JLabel("Celsius");
		celsius.setBounds(119, 14, 46, 14);
		contentPane.add(celsius);

		JButton convertButton = new JButton("Convert");
		convertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tempFahr = (int) ((Double.parseDouble(jTextField1.getText())) * 1.8 + 32);
				fahrenheitLabel.setText(tempFahr + " Fahrenheit");
			}
		});
		convertButton.setBounds(20, 42, 86, 23);
		contentPane.add(convertButton);

		fahrenheitLabel.setBounds(119, 46, 86, 14);
		contentPane.add(fahrenheitLabel);
	}
}
