package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;

public class CalculadoraInvestimentosGrid1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDeposito;
	private JTextField txtMeses;
	private JTextField txtJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosGrid1 frame = new CalculadoraInvestimentosGrid1();
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
	public CalculadoraInvestimentosGrid1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$ :");
		lblDepositoMensal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblDepositoMensal);
		
		txtDeposito = new JTextField();
		contentPane.add(txtDeposito);
		txtDeposito.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		lblNumMeses.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNumMeses);
		
		txtMeses = new JTextField();
		contentPane.add(txtMeses);
		txtMeses.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblJurosMes);
		
		txtJuros = new JTextField();
		contentPane.add(txtJuros);
		txtJuros.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total Investido + juros R$:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String DepositoDigitado = txtDeposito.getText();
				String NumMesesDigitado = txtMeses.getText();
				String JurosDigitado = txtJuros.getText();
				
				double DepositoF = Double.valueOf(DepositoDigitado);
				int MesesF = Integer.valueOf(NumMesesDigitado);
				double JurosF = Double.valueOf(JurosDigitado);
				
				Investimento Chama = new Investimento(MesesF, JurosF, DepositoF);
				
				
				double calculo = (double) Chama.calculaTotal();
				
				JOptionPane.showMessageDialog(null," O Resultado R$:  " + calculo);
				
				
			}
		});
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		contentPane.add(btnNewButton);
	}

}
