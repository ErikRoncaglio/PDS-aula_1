package View;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Servico;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class JanelaCadastrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList<Servico> lista = new ArrayList<Servico>();
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtFuncionario;
	private JTextField txtIdade;
	private JTextField txtLocal;
	private JTextField txtDificuldade;
	private JTextField txtVagasRestantes;
	private JTextField txtCapacidade;
	private JTextField txtDuracao;
	private JTextField txtHorario;
	private JTextField txtVezesReservado;
	private JTextField txtCusto;
	private JTextField txtEquipamentos;
	private JTextField txtFeedback;
	private JLabel lblCadastrarServios;

	public JanelaCadastrar(Janela JPrincipal) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JLabel lblNome = new JLabel("Nome do Serviço:");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel = new JLabel("Descrição do Serviço:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_1 = new JLabel("Horário do Servico:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewel_2 = new JLabel("Local do Serviço:");
		lblNewel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_3 = new JLabel("Funcionário Responsável:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_4 = new JLabel("Restrição de Idade:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_5 = new JLabel("Capacidade Máxima:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_6 = new JLabel("Custo do Serviço:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_7 = new JLabel("Equipamentos Fornecidos:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_8 = new JLabel("Nível de Dificuldade:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_12 = new JLabel("Duração do Serviço:");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_13 = new JLabel("Número de vagas Restantes:");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_14 = new JLabel("Feedback Médio dos Clientes:");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel lblNewLabel_11 = new JLabel("Número de Vezes que o Serviço foi Reservado:");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JLabel btnCadastrar = new JLabel("");

		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar
				.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\PDS-aula_1\\ProjetoJTable\\Salvar.png"));
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String nome = txtNome.getText();
				String descricao = txtDescricao.getText();
				String horario = txtHorario.getText();
				String local = txtLocal.getText();
				String Funcionário_responsavel = txtFuncionario.getText();
				String Restricao_idade = txtIdade.getText();
				String capacidade_maxima = txtCapacidade.getText();
				String Custo_servico = txtCusto.getText();
				String Equipamentos_fornecidos = txtEquipamentos.getText();
				String Nivel_dificuldade = txtDificuldade.getText();
				String duracao = txtDuracao.getText();
				String vagas_restantes = txtVagasRestantes.getText();
				String Feedback = txtFeedback.getText();
				String vezes_reservado = txtVezesReservado.getText();

				Servico s = new Servico();

				s.setNome(nome);
				s.setDescricao(descricao);
				s.setHorario(horario);
				s.setLocal(local);
				s.setFuncionário_responsavel(Funcionário_responsavel);
				s.setRestricao_idade(Restricao_idade);
				s.setCapacidade_maxima(capacidade_maxima);
				s.setCusto_servico(Custo_servico);
				s.setEquipamentos_fornecidos(Equipamentos_fornecidos);
				s.setNivel_dificuldade(Nivel_dificuldade);
				s.setFuncionário_responsavel(Funcionário_responsavel);
				s.setDuracao(duracao);
				s.setVagas_restantes(vagas_restantes);
				s.setFeedback(Feedback);
				s.setVezes_reservado(vezes_reservado);

				JPrincipal.Export(s);
				dispose();

			}

		});

		txtNome = new JTextField();
		txtNome.setForeground(new Color(64, 128, 128));
		txtNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtNome.setColumns(10);

		txtDescricao = new JTextField();
		txtDescricao.setForeground(new Color(64, 128, 128));
		txtDescricao.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDescricao.setColumns(10);

		txtFuncionario = new JTextField();
		txtFuncionario.setForeground(new Color(64, 128, 128));
		txtFuncionario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFuncionario.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setForeground(new Color(64, 128, 128));
		txtIdade.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtIdade.setColumns(10);

		txtLocal = new JTextField();
		txtLocal.setForeground(new Color(64, 128, 128));
		txtLocal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtLocal.setColumns(10);

		txtDificuldade = new JTextField();
		txtDificuldade.setForeground(new Color(64, 128, 128));
		txtDificuldade.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDificuldade.setColumns(10);

		txtVagasRestantes = new JTextField();
		txtVagasRestantes.setForeground(new Color(64, 128, 128));
		txtVagasRestantes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtVagasRestantes.setColumns(10);

		txtCapacidade = new JTextField();
		txtCapacidade.setForeground(new Color(64, 128, 128));
		txtCapacidade.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtCapacidade.setColumns(10);

		txtDuracao = new JTextField();
		txtDuracao.setForeground(new Color(64, 128, 128));
		txtDuracao.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDuracao.setColumns(10);

		txtHorario = new JTextField();
		txtHorario.setForeground(new Color(64, 128, 128));
		txtHorario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtHorario.setColumns(10);

		txtVezesReservado = new JTextField();
		txtVezesReservado.setForeground(new Color(64, 128, 128));
		txtVezesReservado.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtVezesReservado.setColumns(10);

		txtCusto = new JTextField();
		txtCusto.setForeground(new Color(64, 128, 128));
		txtCusto.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtCusto.setColumns(10);

		txtEquipamentos = new JTextField();
		txtEquipamentos.setForeground(new Color(64, 128, 128));
		txtEquipamentos.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtEquipamentos.setColumns(10);

		txtFeedback = new JTextField();
		txtFeedback.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFeedback.setForeground(new Color(64, 128, 128));
		txtFeedback.setColumns(10);

		lblCadastrarServios = new JLabel("Cadastrar Serviços");
		lblCadastrarServios.setFont(new Font("Times New Roman", Font.BOLD, 32));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(299).addComponent(lblCadastrarServios,
						GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(124).addComponent(txtNome,
										GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(536).addComponent(
										txtFuncionario, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(392).addComponent(lblNewLabel_3,
										GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(124)
								.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)
								.addGap(137)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtDuracao, GroupLayout.PREFERRED_SIZE, 139,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(txtHorario, GroupLayout.PREFERRED_SIZE, 139,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(498).addComponent(lblNewLabel_12,
								GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(622).addComponent(txtIdade,
								GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(498).addComponent(lblNewLabel_1,
								GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(498).addComponent(lblNewLabel_4,
								GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewel_2, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)
								.addGroup(
										gl_contentPane.createSequentialGroup().addGap(124).addComponent(txtLocal,
												GroupLayout.PREFERRED_SIZE, 637, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(124).addComponent(txtDificuldade,
								GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(235).addComponent(lblNewLabel_13,
								GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(538).addComponent(lblNewLabel_5,
								GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(403).addComponent(txtVagasRestantes,
								GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE))
						.addGap(10)
						.addComponent(txtCapacidade, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(246).addComponent(txtVezesReservado,
								GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(436).addComponent(lblNewLabel_6,
								GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(550).addComponent(txtCusto,
								GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(549).addComponent(txtEquipamentos,
								GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(402).addComponent(lblNewLabel_7,
								GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(166).addComponent(txtFeedback,
								GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(351).addComponent(btnCadastrar,
						GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(6)
				.addComponent(lblCadastrarServios, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
				.addGap(30)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNome,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtFuncionario, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_3,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
				.addGap(19)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(48)
								.addComponent(txtDuracao, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGap(32)
								.addComponent(txtHorario, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(51).addComponent(lblNewLabel_12,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(103).addComponent(lblNewLabel_1,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_4,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
				.addGap(16)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewel_2,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtLocal, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGap(26)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDificuldade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_13,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_5,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtVagasRestantes, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_8,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtCapacidade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGap(20)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtVezesReservado, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_11,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_6,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtCusto, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGap(19)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtEquipamentos, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFeedback, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
				.addGap(19).addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
	}
}
