package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Comida;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio_5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPeso;
	private JTextField textValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_5 frame = new Exercicio_5();
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
	public Exercicio_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblPeso.setBounds(68, 41, 46, 14);
		contentPane.add(lblPeso);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(68, 81, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textPeso = new JTextField();
		textPeso.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textPeso.setBounds(158, 38, 180, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		textValor = new JTextField();
		textValor.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textValor.setBounds(158, 78, 180, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PesoDigitado = textPeso.getText();
				String ValorDigitado = textValor.getText();

				float Pesof = Float.valueOf(PesoDigitado);
				float Valorf = Float.valueOf(ValorDigitado);

				Comida res = new Comida();


				float puxa = res.calculo(Pesof, Valorf);

				JOptionPane.showMessageDialog(null, " Preço a pagar = " + String.format("%.2f", puxa));
			}
		});
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCalcular.setBounds(60, 204, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValor.setText("");
				textValor.setText("");
			}
		});
		btnLimpar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLimpar.setBounds(183, 204, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnFechar.setBounds(307, 204, 89, 23);
		contentPane.add(btnFechar);
	}

}
