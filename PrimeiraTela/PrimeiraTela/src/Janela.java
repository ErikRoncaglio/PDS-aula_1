import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("Tela do Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHelloWorld = new JLabel("Olá Mundo");
		lblHelloWorld.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "O foco esta no jLabel");
			}
		});
		
		lblHelloWorld.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblHelloWorld.setBounds(188, 50, 79, 14);
		contentPane.add(lblHelloWorld);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(298, 186, 89, 23);
		contentPane.add(btnFechar);
		
		txtNome = new JTextField();
		txtNome.setBounds(158, 129, 230, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(82, 132, 46, 14);
		contentPane.add(lblNome);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pegar o texto digitado do textField(txtNome)
				String nome = txtNome.getText();
				//mostrar o nome na tela usando o JOptionPane
				JOptionPane.showMessageDialog(null,  " O nome digitado é: "+nome);
			}
		});
		btnValidar.setBounds(178, 186, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
			}
		});
		btnLimpar.setBounds(50, 186, 89, 23);
		contentPane.add(btnLimpar);
	}
}
