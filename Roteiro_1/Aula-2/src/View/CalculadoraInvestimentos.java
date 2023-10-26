package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Investimento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CalculadoraInvestimentos extends JFrame {

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
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepósitoMensal = new JLabel("Depósito Mensal R$:");
		lblDepósitoMensal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDepósitoMensal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepósitoMensal.setBounds(54, 11, 132, 14);
		contentPane.add(lblDepósitoMensal);
		
		txtDeposito = new JTextField();
		txtDeposito.setBounds(44, 25, 142, 20);
		contentPane.add(txtDeposito);
		txtDeposito.setColumns(10);
		
		JLabel lblNummeses = new JLabel("Num. de meses:");
		lblNummeses.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNummeses.setHorizontalAlignment(SwingConstants.CENTER);
		lblNummeses.setBounds(54, 56, 119, 14);
		contentPane.add(lblNummeses);
		
		txtMeses = new JTextField();
		txtMeses.setBounds(44, 73, 142, 20);
		contentPane.add(txtMeses);
		txtMeses.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblJurosMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblJurosMes.setBounds(44, 97, 129, 14);
		contentPane.add(lblJurosMes);
		
		txtJuros = new JTextField();
		txtJuros.setBounds(44, 117, 142, 20);
		contentPane.add(txtJuros);
		txtJuros.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total Investido + juros R$:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(28, 141, 181, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCalcular.addActionListener(new ActionListener() {
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
		btnCalcular.setBounds(70, 166, 89, 23);
		contentPane.add(btnCalcular);
	}
}
