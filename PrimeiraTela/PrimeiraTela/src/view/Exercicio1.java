package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setBounds(30, 78, 89, 14);
		contentPane.add(lblTemperatura);
		
		txtTemperatura = new JTextField();
		txtTemperatura.setBounds(142, 75, 213, 20);
		contentPane.add(txtTemperatura);
		txtTemperatura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pegar temperatura digitada no componente do texto
				String tempDigitada= txtTemperatura.getText();
				//converter temp string -> Float
				float tempConvertidaF=Float.valueOf(tempDigitada);
				//criar objeto da classe ConversãoTemperatura
				ConversaoTemperatura conv =new ConversaoTemperatura();
				//chamar método conversão
				float tempC= conv.converterFtoC(tempConvertidaF);
				//mostrartemperatura convertida
				JOptionPane.showMessageDialog(null,  "Temperatura convertida: "+tempC);
			}
		});
		btnCalcular.setBounds(176, 136, 89, 23);
		contentPane.add(btnCalcular);
	}

}
