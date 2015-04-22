package SumaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Suma extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField sumando1;
	private JTextField sumando2;
	private JTextField resultado;

	/**
	 * Create the dialog.
	 */
	public Suma() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblSumando = new JLabel("Sumando");
			lblSumando.setBounds(137, 13, 44, 14);
			contentPanel.add(lblSumando);
		}
		{
			sumando1 = new JTextField();
			sumando1.setBounds(202, 10, 86, 20);
			contentPanel.add(sumando1);
			sumando1.setColumns(10);
		}

		sumando2 = new JTextField();
		sumando2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				sumando2.setCaretColor(Color.RED);
			}
		});
		sumando2.setBounds(202, 43, 86, 20);
		contentPanel.add(sumando2);
		sumando2.setColumns(10);

		JLabel lblSumando_1 = new JLabel("Sumando");
		lblSumando_1.setBounds(137, 46, 46, 14);
		contentPanel.add(lblSumando_1);

		resultado = new JTextField();
		resultado.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				String total = String.valueOf(Integer.parseInt(sumando1
						.getText()) + Integer.parseInt(sumando2.getText()));
				resultado.setText(total.toString());
			}
		});
		resultado.setEditable(false);
		resultado.setBounds(202, 117, 86, 20);
		contentPanel.add(resultado);
		resultado.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(137, 120, 55, 14);
		contentPanel.add(lblResultado);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				    sumando1.setText("");
				    sumando2.setText("");
				    resultado.setText("");
			}
		});
		btnLimpiar.setBounds(202, 161, 89, 23);
		contentPanel.add(btnLimpiar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Atr\u00E1s");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
