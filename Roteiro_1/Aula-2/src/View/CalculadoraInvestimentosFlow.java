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
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import java.awt.Button;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;

public class CalculadoraInvestimentosFlow extends JFrame {

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
					CalculadoraInvestimentosFlow frame = new CalculadoraInvestimentosFlow();
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
	public CalculadoraInvestimentosFlow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormSobre puxa = new FormSobre();
				
				FormSobre formSobre = new FormSobre();
				formSobre.setVisible(true);
			}
		});
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$ :");
		lblDepositoMensal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblDepositoMensal);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtDeposito = new JTextField();
		panel.add(txtDeposito);
		txtDeposito.setColumns(15);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		lblNumMeses.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNumMeses);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtMeses = new JTextField();
		panel_1.add(txtMeses);
		txtMeses.setColumns(15);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblJurosMes);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtJuros = new JTextField();
		panel_2.add(txtJuros);
		txtJuros.setColumns(15);
		
		JLabel lblNewLabel = new JLabel("Total Investido + juros R$:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblResultado = new JLabel();
		panel_3.add(lblResultado);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel_5.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String DepositoDigitado = txtDeposito.getText();
				String NumMesesDigitado = txtMeses.getText();
				String JurosDigitado = txtJuros.getText();
				
				double DepositoF = Double.valueOf(DepositoDigitado);
				int MesesF = Integer.valueOf(NumMesesDigitado);
				double JurosF = Double.valueOf(JurosDigitado);
				
				Investimento chama = new Investimento(MesesF, JurosF, DepositoF);
				
				
				double calculo = (double) chama.calculaTotal();
				
				
					lblResultado.setText("Resultado: " + calculo);
					
								
				

				
			}
		});
	}

}
