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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastrar frame = new JanelaCadastrar();
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
	public JanelaCadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome do Serviço:");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNome.setBounds(69, 83, 652, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Descrição do Serviço:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setBounds(69, 122, 652, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Horário do Servico:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(567, 222, 154, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewel_2 = new JLabel("Local do Serviço:");
		lblNewel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewel_2.setBounds(69, 258, 652, 14);
		contentPane.add(lblNewel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Funcionário Responsável:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(461, 83, 260, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Restrição de Idade:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(567, 122, 154, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Capacidade Máxima:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(607, 304, 114, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Custo do Serviço:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(505, 344, 216, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Equipamentos Fornecidos:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(471, 380, 250, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Nível de Dificuldade:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(69, 304, 652, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_12 = new JLabel("Duração do Serviço:");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(567, 170, 154, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Número de vagas Restantes:");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(304, 304, 417, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Feedback Médio dos Clientes:");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(69, 380, 652, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_11 = new JLabel("Número de Vezes que o Serviço foi Reservado:");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(69, 344, 652, 14);
		contentPane.add(lblNewLabel_11);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String  descricao= txtDescricao.getText();
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
				
				lista.add(s);

				Janela abrir = new Janela;
				
				atualizarJTableModel();
				limparCampos();
				
				
				
				
			}
		});
		btnCadastrar.setBounds(356, 502, 182, 39);
		contentPane.add(btnCadastrar);
		
		txtNome = new JTextField();
		txtNome.setForeground(new Color(64, 128, 128));
		txtNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtNome.setBounds(193, 80, 260, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setForeground(new Color(64, 128, 128));
		txtDescricao.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDescricao.setBounds(193, 119, 361, 117);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		txtFuncionario = new JTextField();
		txtFuncionario.setForeground(new Color(64, 128, 128));
		txtFuncionario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFuncionario.setBounds(605, 80, 225, 20);
		contentPane.add(txtFuncionario);
		txtFuncionario.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setForeground(new Color(64, 128, 128));
		txtIdade.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtIdade.setBounds(691, 119, 139, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtLocal = new JTextField();
		txtLocal.setForeground(new Color(64, 128, 128));
		txtLocal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtLocal.setBounds(193, 255, 637, 20);
		contentPane.add(txtLocal);
		txtLocal.setColumns(10);
		
		txtDificuldade = new JTextField();
		txtDificuldade.setForeground(new Color(64, 128, 128));
		txtDificuldade.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDificuldade.setBounds(193, 301, 103, 20);
		contentPane.add(txtDificuldade);
		txtDificuldade.setColumns(10);
		
		txtVagasRestantes = new JTextField();
		txtVagasRestantes.setForeground(new Color(64, 128, 128));
		txtVagasRestantes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtVagasRestantes.setBounds(472, 301, 123, 20);
		contentPane.add(txtVagasRestantes);
		txtVagasRestantes.setColumns(10);
		
		txtCapacidade = new JTextField();
		txtCapacidade.setForeground(new Color(64, 128, 128));
		txtCapacidade.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtCapacidade.setBounds(731, 301, 99, 20);
		contentPane.add(txtCapacidade);
		txtCapacidade.setColumns(10);
		
		txtDuracao = new JTextField();
		txtDuracao.setForeground(new Color(64, 128, 128));
		txtDuracao.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDuracao.setBounds(691, 167, 139, 20);
		contentPane.add(txtDuracao);
		txtDuracao.setColumns(10);
		
		txtHorario = new JTextField();
		txtHorario.setForeground(new Color(64, 128, 128));
		txtHorario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtHorario.setBounds(691, 219, 139, 20);
		contentPane.add(txtHorario);
		txtHorario.setColumns(10);
		
		txtVezesReservado = new JTextField();
		txtVezesReservado.setForeground(new Color(64, 128, 128));
		txtVezesReservado.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtVezesReservado.setBounds(315, 341, 175, 20);
		contentPane.add(txtVezesReservado);
		txtVezesReservado.setColumns(10);
		
		txtCusto = new JTextField();
		txtCusto.setForeground(new Color(64, 128, 128));
		txtCusto.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtCusto.setBounds(619, 341, 211, 20);
		contentPane.add(txtCusto);
		txtCusto.setColumns(10);
		
		txtEquipamentos = new JTextField();
		txtEquipamentos.setForeground(new Color(64, 128, 128));
		txtEquipamentos.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtEquipamentos.setBounds(618, 380, 212, 94);
		contentPane.add(txtEquipamentos);
		txtEquipamentos.setColumns(10);
		
		txtFeedback = new JTextField();
		txtFeedback.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFeedback.setForeground(new Color(64, 128, 128));
		txtFeedback.setBounds(235, 380, 225, 94);
		contentPane.add(txtFeedback);
		txtFeedback.setColumns(10);
		
		lblCadastrarServios = new JLabel("Cadastrar Serviços");
		lblCadastrarServios.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblCadastrarServios.setBounds(304, 11, 269, 39);
		contentPane.add(lblCadastrarServios);
	}
}
