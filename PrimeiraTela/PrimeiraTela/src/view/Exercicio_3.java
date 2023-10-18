package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calcular;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_3 frame = new Exercicio_3();
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
	public Exercicio_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAltura = new JTextField();
		textAltura.setBounds(151, 38, 165, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textBase = new JTextField();
		textBase.setBounds(151, 82, 165, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String altura= textAltura.getText();
			String base= textBase.getText();
			float basef = Float.valueOf(base);
			float alturaf = Float.valueOf(altura);	
			
			Calcular chama = new Calcular();
			Calcular chama1 = new Calcular();
			
			float calcA = chama.CalcularAr(basef, alturaf);	
			float calcP = chama1.Calcularp(basef, alturaf);
			
			JOptionPane.showMessageDialog(null,  " A area resultante é "+calcA+" e o perimetro resultante é  "+calcP);
			}
		});
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCalcular.setBounds(59, 168, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblAltura = new JLabel("Insira a altura");
		lblAltura.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblAltura.setBounds(33, 41, 71, 14);
		contentPane.add(lblAltura);
		
		JLabel lblBase = new JLabel("Insira a base");
		lblBase.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblBase.setBounds(33, 85, 89, 14);
		contentPane.add(lblBase);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAltura.setText("");
				textBase.setText("");
			}
		});
		btnLimpar.setBounds(180, 168, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnFechar.setBounds(294, 168, 89, 23);
		contentPane.add(btnFechar);
	}
}
