package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setFont(new Font("Times New Roman", Font.BOLD, 16));
		setTitle("Tela Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNome.setBounds(57, 55, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSobrenome.setBounds(57, 91, 84, 14);
		contentPane.add(lblSobrenome);
		
		txtNome = new JTextField();
		txtNome.setBounds(151, 52, 200, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(151, 88, 200, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				JOptionPane.showMessageDialog(null,  " O nome digitado é: "+nome+" "+sobrenome);
			}
		});
		btnMostrar.setBounds(57, 149, 89, 23);
		contentPane.add(btnMostrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtSobrenome.setText("");
			}
		});
		btnLimpar.setBounds(171, 149, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(284, 149, 89, 23);
		contentPane.add(btnFechar);
	}

}
