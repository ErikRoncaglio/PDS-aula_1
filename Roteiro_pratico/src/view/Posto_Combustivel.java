package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class Posto_Combustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDisel;
	private JTextField txtComum;
	private JTextField txtAditivada;
	private JTextField txtFrascoM;
	private JTextField txtFrascoL;
	private JTextField txtPrecoFrascoM;
	private JTextField txtPrecoFrascoL;
	private JTextField txtLitros;
	private JTextField txtDias;
	private JTextField txtEtanol;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Posto_Combustivel frame = new Posto_Combustivel();
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
	public Posto_Combustivel() {
		setTitle("Posto de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 632);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setToolTipText("");
		panel.setBounds(36, 25, 300, 150);
		contentPane.add(panel);
		panel.setLayout(new MigLayout("", "[144px][144px]", "[32px][32px][32px][32px]"));
		
		JLabel lblDisel = new JLabel("Oleo Disel:");
		panel.add(lblDisel, "cell 0 0,alignx center,growy");
		
		txtDisel = new JTextField();
		panel.add(txtDisel, "cell 1 0,grow");
		txtDisel.setColumns(10);
		
		JLabel lblComum = new JLabel("Gas. Comum:");
		panel.add(lblComum, "cell 0 1,alignx center,growy");
		
		txtComum = new JTextField();
		panel.add(txtComum, "cell 1 1,grow");
		txtComum.setColumns(10);
		
		JLabel lblAditivada = new JLabel("Gas. Aditivada:");
		panel.add(lblAditivada, "cell 0 2,alignx center,growy");
		
		txtAditivada = new JTextField();
		panel.add(txtAditivada, "cell 1 2,grow");
		txtAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		panel.add(lblEtanol, "cell 0 3,alignx center,growy");
		
		txtEtanol = new JTextField();
		panel.add(txtEtanol, "cell 1 3,grow");
		txtEtanol.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(381, 25, 300, 150);
		contentPane.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[144px][144px]", "[32px][32px][32px]"));
		
		JLabel lblNewLabel_13 = new JLabel("Frasco 500ml");
		panel_1.add(lblNewLabel_13, "cell 0 0,alignx center,growy");
		
		txtPrecoFrascoM = new JTextField();
		panel_1.add(txtPrecoFrascoM, "cell 1 0,grow");
		txtPrecoFrascoM.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Frasco 1L");
		panel_1.add(lblNewLabel_12, "cell 0 1,alignx center,growy");
		
		txtPrecoFrascoL = new JTextField();
		panel_1.add(txtPrecoFrascoL, "cell 1 1,grow");
		txtPrecoFrascoL.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(36, 205, 645, 138);
		contentPane.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[158px][][158px][][158px][158px]", "[38px][38px][][][][][][][][38px]"));
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade");
		panel_2.add(lblNewLabel_5, "cell 2 0,alignx center,growy");
		
		JLabel lblNewLabel_6 = new JLabel("Valor a Pagar");
		panel_2.add(lblNewLabel_6, "cell 4 0,alignx center,growy");
		
		JLabel lblNewLabel_7 = new JLabel("Total Oleo");
		panel_2.add(lblNewLabel_7, "cell 5 0,alignx center,growy");
		
		JLabel lblNewLabel = new JLabel("-");
		panel_2.add(lblNewLabel, "cell 4 2,alignx center");
		
		JLabel lblNewLabel_9 = new JLabel("-");
		panel_2.add(lblNewLabel_9, "cell 5 2,alignx center,growy");
		
		JLabel lblNewLabel_8 = new JLabel("Frasco de 500ml");
		panel_2.add(lblNewLabel_8, "cell 0 2,alignx center,growy");
		
		txtFrascoM = new JTextField();
		panel_2.add(txtFrascoM, "cell 2 2,grow");
		txtFrascoM.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Frasco 1L");
		panel_2.add(lblNewLabel_10, "cell 0 5,alignx center,growy");
		
		txtFrascoL = new JTextField();
		panel_2.add(txtFrascoL, "cell 2 5,grow");
		txtFrascoL.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("-");
		panel_2.add(lblNewLabel_4, "cell 4 5,alignx center,growy");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(36, 369, 300, 150);
		contentPane.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[144px][][][][][][][][][144px]", "[42px][][][][42px][][42px]"));
		
		JLabel lblNewLabel_17 = new JLabel("Combustivel:");
		panel_3.add(lblNewLabel_17, "cell 0 0,alignx center,growy");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Oleo Disel", "Gas. Comum", "Gas. Aditivada", "Etanol"}));
		panel_3.add(comboBox, "cell 9 0,grow");
		
		JLabel lblNewLabel_16 = new JLabel("Quantidade de Litros:");
		panel_3.add(lblNewLabel_16, "cell 0 3,alignx center,growy");
		
		txtLitros = new JTextField();
		panel_3.add(txtLitros, "cell 9 3,grow");
		txtLitros.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("-");
		panel_3.add(lblNewLabel_15, "cell 8 5 2 1,alignx center,growy");
		
		JLabel lblNewLabel_14 = new JLabel("Total Combustivel:");
		panel_3.add(lblNewLabel_14, "cell 0 5,alignx center,growy");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(381, 369, 300, 150);
		contentPane.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[109px][][][][][][5px][41px][][5px][40px][5px][46px]", "[23px][][23px][][][][][][][][][]"));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("À vista ");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel_4.add(rdbtnNewRadioButton_1, "cell 0 1 1 2,alignx left,aligny bottom");
		
		JLabel lblNewLabel_19 = new JLabel("Dias:");
		panel_4.add(lblNewLabel_19, "cell 1 1 1 4,alignx right,aligny center");
		
		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 3 1 10 4,alignx left,aligny center");
		txtDias.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnNewRadioButton);
		panel_4.add(rdbtnNewRadioButton, "cell 0 3 1 2,alignx left,aligny top");
		
		JLabel lblNewLabel_18 = new JLabel("Total a Pagar:");
		panel_4.add(lblNewLabel_18, "cell 0 7 2 1,alignx right,aligny center");
		
		JLabel lblNewLabel_20 = new JLabel("-");
		panel_4.add(lblNewLabel_20, "cell 3 7");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 545, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNovoCalculo = new JButton("Novo Calculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovoCalculo.setBounds(306, 545, 108, 23);
		contentPane.add(btnNovoCalculo);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(471, 545, 89, 23);
		contentPane.add(btnFechar);
	}
}
