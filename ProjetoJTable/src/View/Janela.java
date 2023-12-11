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
	private JLabel lblServicos;

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

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 146, 1151, 427);
		contentPane.add(scrollPane);

		table = new JTable();
		Janela estajanela = this;
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
		lblCadastrar.setIcon(
				new ImageIcon(Janela.class.getResource("/Icones/Button.png")));
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
		lblExcluir.setIcon(
				new ImageIcon(Janela.class.getResource("/Icones/Excluir1.png")));
		lblExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				if (linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione um serviço para excluir!");

				} else {
					lista.remove(linha);

				}
				atualizarJTableModel();

			}
		});
		lblExcluir.setBounds(1130, 86, 48, 49);
		contentPane.add(lblExcluir);
		Janela SalvarAlt = this;
		JLabel lblAlterar = new JLabel("");
		lblAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Servico x = lista.get(linha);
				if (linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione um serviço para excluir!");
				} else {
					JanelaAlterar janelaAlterar = new JanelaAlterar(x, SalvarAlt);
					janelaAlterar.setVisible(true);

				}
			}
		});
		lblAlterar.setIcon(
				new ImageIcon(Janela.class.getResource("/Icones/Alterar.png")));

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
		lblFechar.setIcon(
				new ImageIcon(Janela.class.getResource("/Icones/Fechar.png")));
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

	public void atualizar(Servico s) {
		int linha = table.getSelectedRow();
		lista.set(linha, s);
		atualizarJTableModel();
	}

}
