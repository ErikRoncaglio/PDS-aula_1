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
import javax.swing.ImageIcon;
import java.awt.Color;

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
		setBounds(100, 100, 1265, 726);
		contentPane = new JPanel();
		Janela estajanela = this;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 146, 1151, 427);
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

		JLabel lblCadastrar = new JLabel("");
		lblCadastrar.setBackground(new Color(255, 255, 255));
		lblCadastrar
				.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\PDS-aula_1\\ProjetoJTable\\Button.png"));
		lblCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				JanelaCadastrar abrircadastrar = new JanelaCadastrar(estajanela);

				abrircadastrar.setVisible(true);

				atualizarJTableModel();

			}
		});
		lblCadastrar.setBounds(323, 597, 137, 49);
		contentPane.add(lblCadastrar);

		JLabel lblExcluir = new JLabel("");
		lblExcluir
				.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\PDS-aula_1\\ProjetoJTable\\Excluir1.png"));
		lblExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx_linha = table.getSelectedRow();
				lista.remove(idx_linha);
				atualizarJTableModel();

			}
		});
		lblExcluir.setBounds(1130, 86, 48, 49);
		contentPane.add(lblExcluir);

		JLabel lblAlterar = new JLabel("");
		lblAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				JanelaAlterar abrirAlterar = new JanelaAlterar(estajanela);

				abrirAlterar.setVisible(true);

				atualizarJTableModel();

			}
		});
		lblAlterar
				.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\PDS-aula_1\\ProjetoJTable\\Alterar.png"));

		lblAlterar.setBounds(556, 597, 137, 49);
		contentPane.add(lblAlterar);

		lblServicos = new JLabel("Serviços");
		lblServicos.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblServicos.setBounds(556, 37, 147, 47);
		contentPane.add(lblServicos);

		JLabel lblFechar = new JLabel("");
		lblFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		lblFechar.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\PDS-aula_1\\ProjetoJTable\\Fechar.png"));
		lblCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		lblFechar.setBounds(792, 597, 137, 49);
		contentPane.add(lblFechar);
	}

	public void atualizarJTableModel() {
		table.setModel(new ServicoJTableModel(lista));
	}

	public void Export(Servico exportar) {
		lista.add(exportar);
		atualizarJTableModel();
	}

}
