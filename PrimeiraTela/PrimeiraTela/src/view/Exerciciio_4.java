package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calcular;
import model.Gasolina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Exerciciio_4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPreco;
	private JTextField textPrecoT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exerciciio_4 frame = new Exerciciio_4();
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
	public Exerciciio_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreço = new JLabel("Preço Gasolina:");
		lblPreço.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblPreço.setBounds(39, 46, 78, 14);
		contentPane.add(lblPreço);
		
		JLabel lblPreçoT = new JLabel("Valor total:");
		lblPreçoT.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblPreçoT.setBounds(39, 88, 78, 14);
		contentPane.add(lblPreçoT);
		
		textPreco = new JTextField();
		textPreco.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textPreco.setBounds(144, 43, 198, 20);
		contentPane.add(textPreco);
		textPreco.setColumns(10);
		
		textPrecoT = new JTextField();
		textPrecoT.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textPrecoT.setBounds(144, 85, 198, 20);
		contentPane.add(textPrecoT);
		textPrecoT.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Preco= textPreco.getText();
				String PrecoT= textPrecoT.getText();
				float P = Float.valueOf(Preco);
				float P1 = Float.valueOf(PrecoT);	
				
				Gasolina chama = new Gasolina();
				
				
				float litros = chama.calcP(P, P1);	
				
				
				JOptionPane.showMessageDialog(null,  " É possível colocar "+ String.format("%.2f", litros));
			}
		});
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCalcular.setBounds(49, 188, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPrecoT.setText("");
				textPreco.setText("");
			}
		});
		btnLimpar.setBounds(173, 188, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(289, 188, 89, 23);
		contentPane.add(btnFechar);
	}

}
