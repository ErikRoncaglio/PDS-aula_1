package View;

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

import Model.Servico;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	ArrayList<Servico> lista = new ArrayList<Servico>();
	private JButton btnNewButton_2;
	private JLabel lblServicos;
	private JButton btnNewButton;

	public void ExportarVariaveis(Servico s) {
		lista.add(s);
		atualizarJTableModel();
	}

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
		setBounds(100, 100, 1265, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 115, 1151, 427);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Servico pessoaSelecionada = lista.get(linha);

			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JanelaAdicionar abrircadastrarproduto = new JanelaAdicionar(Janela);

				abrircadastrarproduto.setVisible(true);

				atualizarJTableModel();
				limparCampos();

			}
		});
		btnCadastrar.setBounds(271, 584, 130, 40);
		contentPane.add(btnCadastrar);

		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				lista.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton_1.setBounds(680, 584, 130, 40);
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

				for (Servico pessoa : listaPessoas) {
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
		btnNewButton_2.setBounds(479, 584, 130, 40);
		contentPane.add(btnNewButton_2);

		lblServicos = new JLabel("Serviços");
		lblServicos.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblServicos.setBounds(556, 37, 147, 47);
		contentPane.add(lblServicos);

		btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(881, 584, 130, 40);
		contentPane.add(btnNewButton);
	}

	public void atualizarJTableModel() {
		table.setModel(new ServicoJTableModel(lista));

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
