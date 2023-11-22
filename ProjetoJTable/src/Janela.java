import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnNewButton_2;
	private JTextField txtIdade;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtTelefone;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 174, 596, 189);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
			
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);

		labelNome = new JLabel("Nome");
		labelNome.setBounds(44, 11, 46, 14);
		contentPane.add(labelNome);

		txtNome = new JTextField();
		txtNome.setBounds(44, 36, 174, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(254, 11, 46, 14);
		contentPane.add(lblNewLabel);

		txtCPF = new JTextField();
		txtCPF.setBounds(254, 36, 174, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				Integer telefone = Integer.parseInt(txtTelefone.getText());
				Integer idade = Integer.parseInt(txtTelefone.getText());
				Float peso = Float.parseFloat(txtPeso.getText());
				Float altura = Float.parseFloat(txtAltura.getText());

				Pessoa p = new Pessoa();

				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setIdade(idade);
				p.setPeso(peso);
				p.setTelefone(telefone);
				p.setAltura(altura);

				listaPessoas.add(p);

				atualizarJTableModel();
				limparCampos();

			}
		});
		btnNewButton.setBounds(139, 131, 112, 32);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton_1.setBounds(295, 131, 99, 33);
		contentPane.add(btnNewButton_1);

		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int linha = table.getSelectedRow();
				int cpf = (int) table.getValueAt(linha, 1);

				String nome = txtNome.getText();
				String cpf1 = txtCPF.getText();
				Integer telefone = Integer.parseInt(txtTelefone.getText());
				Integer idade = Integer.parseInt(txtTelefone.getText());
				Float peso = Float.parseFloat(txtPeso.getText());
				Float altura = Float.parseFloat(txtAltura.getText());

				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpf() == cpf) {

						pessoa.setNome(nome);
						pessoa.setCpf(Integer.parseInt(cpf1));
						pessoa.setIdade(idade);
						pessoa.setPeso(peso);
						pessoa.setTelefone(telefone);
						pessoa.setAltura(altura);

						atualizarJTableModel();
						limparCampos();

					}

				}
			}
		});
		btnNewButton_2.setBounds(435, 131, 114, 32);
		contentPane.add(btnNewButton_2);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(462, 11, 46, 14);
		contentPane.add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setBounds(462, 36, 178, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(44, 67, 46, 14);
		contentPane.add(lblPeso);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(254, 67, 46, 14);
		contentPane.add(lblAltura);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(462, 67, 106, 14);
		contentPane.add(lblTelefone);

		txtPeso = new JTextField();
		txtPeso.setBounds(44, 92, 174, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(254, 92, 174, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(462, 92, 178, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
	}

	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}

	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtIdade.setText("");
		txtAltura.setText("");
		txtPeso.setText("");
		txtTelefone.setText("");

	}
}
