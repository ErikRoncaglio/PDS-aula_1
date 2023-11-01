import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calcular;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Ex_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtBase;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex_1 frame = new Ex_1();
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
	public Ex_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(122, 37, 46, 14);
		contentPane.add(lblAltura);

		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(264, 37, 46, 14);
		contentPane.add(lblBase);

		txtAltura = new JTextField();
		txtAltura.setBounds(93, 62, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		txtBase = new JTextField();
		txtBase.setBounds(235, 62, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);

		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(72, 161, 238, 14);
		contentPane.add(lblResultado);

		JRadioButton rdbOp1 = new JRadioButton("Área");
		rdbOp1.setBounds(93, 126, 77, 23);
		contentPane.add(rdbOp1);
		buttonGroup.add(rdbOp1);

		JRadioButton rdbOp2 = new JRadioButton("Perímetro");
		rdbOp2.setBounds(235, 126, 109, 23);
		contentPane.add(rdbOp2);
		buttonGroup.add(rdbOp2);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String altura = txtAltura.getText();
				String base = txtBase.getText();
				float basef = Float.valueOf(base);
				float alturaf = Float.valueOf(altura);

				Calcular chama = new Calcular();

				if (rdbOp2.isSelected()) {
					float calcP = chama.Calcularp(basef, alturaf);
					lblResultado.setText("Perímetro: " + calcP);
				}
				if (rdbOp1.isSelected()) {
					float calcA = chama.CalcularAr(basef, alturaf);
					lblResultado.setText("Area: " + calcA);
				}

			}
		});
		btnCalcular.setBounds(72, 206, 89, 23);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText(null);
				txtAltura.setText(null);
			}
		});
		btnLimpar.setBounds(182, 206, 89, 23);
		contentPane.add(btnLimpar);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(292, 206, 89, 23);
		contentPane.add(btnFechar);

	}
}
