package View;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.DificuldadeBox;
import Model.Servico;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class JanelaAlterar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList<Servico> lista = new ArrayList<Servico>();
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtFuncionario_1;
	private JTextField txtIdade;
	private JTextField txtLocal;
	private JTextField txtVagasRestantes;
	private JTextField txtCapacidade;
	private JTextField txtDuracao;
	private JTextField txtHorario;
	private JTextField txtVezesReservado;
	private JTextField txtCusto;
	private JTextField txtEquipamentos;
	private JTextField txtFeedback;
	private JLabel lblAlterarServios;

	public JanelaAlterar(Servico s, Janela SalvarAlt) {

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
		JComboBox comboBox = new JComboBox();

		comboBox.setModel(new DefaultComboBoxModel(DificuldadeBox.values()));
		JLabel lblNewLabel_11 = new JLabel("Número de Vezes que o Serviço foi Reservado:");

		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFuncionario_1 = new JTextField();
		txtFuncionario_1.setForeground(new Color(64, 128, 128));
		txtFuncionario_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFuncionario_1.setColumns(10);
		comboBox.setSelectedIndex(-1);
		txtFuncionario_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtFuncionario_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço!");
				} else if (!txtFuncionario_1.getText().matches("[a-zA-Zç]+")) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas letras!");
				}
			}
		});
		JLabel btnAlterar = new JLabel("");

		btnAlterar.setBackground(new Color(255, 255, 255));
		btnAlterar.setIcon(
				new ImageIcon(JanelaAlterar.class.getResource("/Icones/Salvar.png")));
		btnAlterar.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Object campo = comboBox.getSelectedItem();
				String dificuldade;
				if (campo != null) {
					dificuldade = campo.toString();
				} else {
					dificuldade = "";
				}

				Integer idade = 0;
				try {
					idade = Integer.parseInt(txtIdade.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas números para idade!");
					return;
				}
				Integer vagas = 0;
				try {
					vagas = Integer.parseInt(txtVagasRestantes.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Dados inválidos, utilize apenas números para vagas restantes!");
					return;
				}

				Integer capacidade = 0;
				try {
					capacidade = Integer.parseInt(txtCapacidade.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas números para capacidade!");
					return;
				}
				Integer reservas = 0;
				try {
					reservas = Integer.parseInt(txtVezesReservado.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas números vezes reservado!");
					return;
				}
				float Custo = 0;
				try {
					Custo = Float.parseFloat(txtCusto.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas números para custo!");
					return;
				}

				if (txtNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço nome!");
				} else if (!txtNome.getText().matches("[a -z A-Zç]+")) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas letras para nome!");
				} else if (txtDescricao.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço descrição!");
				} else if (!txtDescricao.getText().matches("[a -z A-Zç]+")) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas letras para descrição!");
				} else if (txtFuncionario_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço funcionário responsável!");
				} else if (!txtFuncionario_1.getText().matches("[a -z A-Zç]+")) {
					JOptionPane.showMessageDialog(null,
							"Dados inválidos, utilize apenas letras pra funcionario responsável!");
				} else if (txtLocal.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço local!");
				} else if (!txtLocal.getText().matches("[a -z A-Zç]+")) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas letras para local!");
				} else if (txtDuracao.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço duração!");
				} else if (!txtDuracao.getText().matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
					JOptionPane.showMessageDialog(null, "Digite a hora corretamente em duração(no formato HH:mm)");
					txtDuracao.requestFocus();
				} else if (txtHorario.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço horario!");
				} else if (!txtHorario.getText().matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
					JOptionPane.showMessageDialog(null, "Digite a hora corretamente em horario(no formato HH:mm)");
					txtHorario.requestFocus();
				} else if (txtEquipamentos.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço equipamentos!");
				} else if (!txtEquipamentos.getText().matches("[a -z A-Zç]+")) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas letras para equipamentos!");
				} else if (txtFeedback.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o espaço feedback!");
				} else if (!txtFeedback.getText().matches("[a -z A-Zç]+")) {
					JOptionPane.showMessageDialog(null, "Dados inválidos, utilize apenas letras para feedback!");
				} else {

					SalvarAlt.atualizar(s);
					dispose();
					JOptionPane.showMessageDialog(btnAlterar, "Serviço Alterado!");
				}
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

		txtFuncionario_1.setForeground(new Color(64, 128, 128));
		txtFuncionario_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFuncionario_1.setColumns(10);
		txtFuncionario_1 = new JTextField();

		txtIdade = new JTextField();

		txtIdade.setForeground(new Color(64, 128, 128));
		txtIdade.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtIdade.setColumns(10);

		txtLocal = new JTextField();

		txtLocal.setForeground(new Color(64, 128, 128));
		txtLocal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtLocal.setColumns(10);

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

		lblAlterarServios = new JLabel("Alterar Serviços");
		lblAlterarServios.setFont(new Font("Times New Roman", Font.BOLD, 32));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(64)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addGap(110)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE).addGap(8)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(144).addComponent(
										txtFuncionario_1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 260,
										GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(498).addComponent(lblNewLabel_12,
								GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(622).addComponent(txtDuracao,
								GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(622).addComponent(txtIdade,
								GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(498).addComponent(lblNewLabel_4,
								GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(110).addComponent(txtDescricao,
								GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(498).addComponent(lblNewLabel_1,
								GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(622).addComponent(txtHorario,
								GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(110).addComponent(txtLocal,
										GroupLayout.PREFERRED_SIZE, 651, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewel_2, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(110)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
								.addGap(16)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addGap(140).addComponent(
												txtVagasRestantes, GroupLayout.PREFERRED_SIZE, 123,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(275).addComponent(
												lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 114,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(399).addComponent(
												txtCapacidade, GroupLayout.PREFERRED_SIZE, 99,
												GroupLayout.PREFERRED_SIZE))
										.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 417,
												GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(436).addComponent(lblNewLabel_6,
								GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(246).addComponent(txtVezesReservado,
								GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(550).addComponent(txtCusto,
								GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(549).addComponent(txtEquipamentos,
								GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(156).addComponent(txtFeedback,
								GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(402).addComponent(lblNewLabel_7,
								GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 652, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(351).addComponent(btnAlterar,
						GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addContainerGap(313, Short.MAX_VALUE)
						.addComponent(lblAlterarServios, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
						.addGap(271)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addComponent(lblAlterarServios, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE).addGap(25)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFuncionario_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_3,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3)
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
				.addGap(19)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(51).addComponent(lblNewLabel_12,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(48).addComponent(txtDuracao,
								GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_4,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(103).addComponent(lblNewLabel_1,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(100).addComponent(txtHorario,
								GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
				.addGap(16)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtLocal, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3)
								.addComponent(lblNewel_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
				.addGap(25)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(1).addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addComponent(txtVagasRestantes, GroupLayout.PREFERRED_SIZE, 20,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_5,
										GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtCapacidade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_13,
										GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(lblNewLabel_8,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
				.addGap(24)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_6,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtVezesReservado, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCusto, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel_11,
								GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
				.addGap(19)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtEquipamentos, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFeedback, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
				.addGap(19).addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);

		String nome = String.valueOf(s.getNome());
		txtNome.setText(nome);
		String descricao = String.valueOf(s.getDescricao());
		txtDescricao.setText(descricao);
		String horario = String.valueOf(s.getHorario());
		txtHorario.setText(horario);
		String local = s.getLocal();
		txtLocal.setText(local);
		String FuncionarioResponsavel = s.getFuncionarioResponsavel();
		txtFuncionario_1.setText(FuncionarioResponsavel);
		Integer Restricao_idade = s.getRestricao_idade();
		txtIdade.setText(String.valueOf(Restricao_idade));
		Integer capacidade_maxima = s.getCapacidade_maxima();
		txtCapacidade.setText(String.valueOf(capacidade_maxima));
		Float Custo_servico = s.getCusto_servico();
		txtCusto.setText(String.valueOf(Custo_servico));
		String Equipamentos_fornecidos = s.getEquipamentos_fornecidos();
		txtEquipamentos.setText(Equipamentos_fornecidos);
		String duracao = s.getDuracao();
		txtDuracao.setText(duracao);
		Integer vagas_restantes = s.getVagas_restantes();
		txtVagasRestantes.setText(String.valueOf(vagas_restantes));
		String Feedback = s.getFeedback();
		txtFeedback.setText(Feedback);
		Integer vezes_reservado = s.getVezes_reservado();
		txtVezesReservado.setText(String.valueOf(vezes_reservado));

	}
}
