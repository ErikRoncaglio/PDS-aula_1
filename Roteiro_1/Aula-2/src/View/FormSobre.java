package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FormSobre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSobre frame = new FormSobre();
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
	public FormSobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("CalcInvest - Calculadora de Investimentos");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Versão: 1.0");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Autor: Erik Roncáglio");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Contato: erikroncaglio@gmail.com");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton);
	}

}
