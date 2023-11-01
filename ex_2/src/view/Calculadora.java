package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calculos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrim;
	private JTextField txtSeg;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPrim = new JLabel("Primeiro número inteiro: ");
		lblPrim.setBounds(31, 35, 147, 14);
		contentPane.add(lblPrim);

		JLabel lblSeg = new JLabel("Segundo número inteiro:");
		lblSeg.setBounds(31, 60, 147, 14);
		contentPane.add(lblSeg);

		txtPrim = new JTextField();
		txtPrim.setBounds(188, 32, 147, 20);
		contentPane.add(txtPrim);
		txtPrim.setColumns(10);

		txtSeg = new JTextField();
		txtSeg.setText("");
		txtSeg.setBounds(188, 57, 147, 20);
		contentPane.add(txtSeg);
		txtSeg.setColumns(10);

		JRadioButton rdbtnAdi = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdi);
		rdbtnAdi.setBounds(47, 95, 109, 23);
		contentPane.add(rdbtnAdi);

		JRadioButton rdbtnSub = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSub);
		rdbtnSub.setBounds(47, 121, 109, 23);
		contentPane.add(rdbtnSub);

		JRadioButton rdbtnMult = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMult);
		rdbtnMult.setBounds(47, 147, 131, 23);
		contentPane.add(rdbtnMult);

		JRadioButton rdbtnDiv = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDiv);
		rdbtnDiv.setBounds(47, 173, 109, 23);
		contentPane.add(rdbtnDiv);

		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(146, 214, 204, 14);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String prim = txtPrim.getText();
				String seg = txtSeg.getText();

				float n1 = Float.valueOf(prim);
				float n2 = Float.valueOf(seg);

				Calculos chama = new Calculos();
				Calculos chama1 = new Calculos();
				Calculos chama2 = new Calculos();
				Calculos chama3 = new Calculos();

				float Result = chama.CalcAdi(n1, n2);
				float Result1 = chama1.CalcSub(n1, n2);
				float Result2 = chama2.CalcMult(n1, n2);
				float Result3 = chama3.CalcDiv(n1, n2);
				
				if (rdbtnAdi.isSelected()) {
					
					lblResultado.setText("Resultado: " + Result);
				}
				else if (rdbtnSub.isSelected()) {
					
					lblResultado.setText("Resultado: " + Result1);
				}
				else if (rdbtnMult.isSelected()) {
					
					lblResultado.setText("Resultado: " + Result2);
				}
				else if (rdbtnDiv.isSelected()) {
					
					lblResultado.setText("Resultado: " + Result3);
				}

			
			}
		});
		btnCalcular.setBounds(47, 210, 89, 23);
		contentPane.add(btnCalcular);

		
	}
}
