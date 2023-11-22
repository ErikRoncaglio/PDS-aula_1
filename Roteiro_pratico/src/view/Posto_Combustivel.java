package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.Calculos;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import model.Combobox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import model.Calculos;
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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.Calculos;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import model.Combobox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.Calculos;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import model.Combobox;

public class Posto_Combustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDiesel;
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
		Calculos chama = new Calculos();

		setTitle("Posto de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 632);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		panel.setToolTipText("");
		panel.setBounds(36, 25, 300, 150);
		contentPane.add(panel);
		panel.setLayout(new MigLayout("", "[144px][144px]", "[32px][32px][32px][32px]"));

		JLabel lblDisel = new JLabel("Oleo Disel:");
		panel.add(lblDisel, "cell 0 0,alignx center,growy");

		txtDiesel = new JTextField();
		txtDiesel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.PrecoDiesel = Float.valueOf(txtDiesel.getText());
			}
		});
		panel.add(txtDiesel, "cell 1 0,grow");
		txtDiesel.setColumns(10);

		JLabel lblComum = new JLabel("Gas. Comum:");
		panel.add(lblComum, "cell 0 1,alignx center,growy");

		txtComum = new JTextField();
		txtComum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.PrecoComum = Float.valueOf(txtComum.getText());
			}
		});
		panel.add(txtComum, "cell 1 1,grow");
		txtComum.setColumns(10);

		JLabel lblAditivada = new JLabel("Gas. Aditivada:");
		panel.add(lblAditivada, "cell 0 2,alignx center,growy");

		txtAditivada = new JTextField();
		txtAditivada.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.PrecoAditiv = Float.valueOf(txtAditivada.getText());
			}
		});
		panel.add(txtAditivada, "cell 1 2,grow");
		txtAditivada.setColumns(10);

		JLabel lblEtanol = new JLabel("Etanol:");
		panel.add(lblEtanol, "cell 0 3,alignx center,growy");

		txtEtanol = new JTextField();
		txtEtanol.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.PrecoEtanool = Float.valueOf(txtEtanol.getText());
			}
		});
		panel.add(txtEtanol, "cell 1 3,grow");
		txtEtanol.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_1.setBounds(381, 25, 300, 150);
		contentPane.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[144px][144px]", "[32px][32px][32px]"));

		JLabel lblNewLabel_13 = new JLabel("Frasco 500ml");
		panel_1.add(lblNewLabel_13, "cell 0 0,alignx center,growy");

		txtPrecoFrascoM = new JTextField();
		txtPrecoFrascoM.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.Preco500ml = Float.valueOf(txtPrecoFrascoM.getText());
			}
		});
		panel_1.add(txtPrecoFrascoM, "cell 1 0,grow");
		txtPrecoFrascoM.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Frasco 1L");
		panel_1.add(lblNewLabel_12, "cell 0 1,alignx center,growy");

		txtPrecoFrascoL = new JTextField();
		txtPrecoFrascoL.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.Preco1L = Float.valueOf(txtPrecoFrascoL.getText());
			}
		});
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

		JLabel lblresultFrascoL = new JLabel("-");
		panel_2.add(lblresultFrascoL, "cell 4 5,alignx center,growy");

		JLabel lblresultFrascoM = new JLabel("-");
		panel_2.add(lblresultFrascoM, "cell 4 2,alignx center");

		JLabel lblTotalOleo = new JLabel("-");
		panel_2.add(lblTotalOleo, "cell 5 2,alignx center,growy");

		JLabel lblNewLabel_8 = new JLabel("Frasco de 500ml");
		panel_2.add(lblNewLabel_8, "cell 0 2,alignx center,growy");

		txtFrascoM = new JTextField();
		txtFrascoM.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				chama.Quant500ml = Float.valueOf(txtFrascoM.getText());
				lblresultFrascoM.setText("R$ " + chama.calcFrascoM());
				lblTotalOleo.setText("R$ " + chama.totalOleo());
			}

		});
		panel_2.add(txtFrascoM, "cell 2 2,grow");
		txtFrascoM.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Frasco 1L");
		panel_2.add(lblNewLabel_10, "cell 0 5,alignx center,growy");

		txtFrascoL = new JTextField();
		txtFrascoL.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				chama.Quant1L = Float.valueOf(txtFrascoL.getText());
				lblresultFrascoL.setText("R$ " + chama.calcFrascoL());
				lblTotalOleo.setText("R$ " + chama.totalOleo());

			}
		});
		panel_2.add(txtFrascoL, "cell 2 5,grow");
		txtFrascoL.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(36, 369, 300, 150);
		contentPane.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[144px][][][][][][][][][144px]", "[42px][][][][42px][][42px]"));

		JLabel lblNewLabel_17 = new JLabel("Combustivel:");
		panel_3.add(lblNewLabel_17, "cell 0 0,alignx center,growy");

		JComboBox comboBoxComb = new JComboBox();

		comboBoxComb.setModel(new DefaultComboBoxModel(Combobox.values()));
		panel_3.add(comboBoxComb, "cell 9 0,growx,aligny center");

		JLabel lblNewLabel_16 = new JLabel("Quantidade de Litros:");
		panel_3.add(lblNewLabel_16, "cell 0 3,alignx center,growy");

		JLabel lblTotalC = new JLabel("-");
		panel_3.add(lblTotalC, "cell 8 5 2 1,alignx center,growy");

		txtLitros = new JTextField();
		txtLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				int posicao = comboBoxComb.getSelectedIndex();
				float QuantLitros = Float.valueOf(txtLitros.getText());
				if (posicao == 0) {
					lblTotalC.setText("R$ " + chama.Diesel(QuantLitros));
				} else if (posicao == 1) {
					lblTotalC.setText("R$ " + chama.Comum(QuantLitros));
				} else if (posicao == 2) {
					lblTotalC.setText("R$ " + chama.Aditiv(QuantLitros));
				} else if (posicao == 3) {
					lblTotalC.setText("R$ " + chama.Etanol(QuantLitros));
				}

			}
		});
		panel_3.add(txtLitros, "cell 9 3,grow");
		txtLitros.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("Total Combustivel:");
		panel_3.add(lblNewLabel_14, "cell 0 5,alignx center,growy");

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(
				new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(381, 369, 300, 150);
		contentPane.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[109px][][][][][][5px][41px][][5px][40px][5px][46px]",
				"[23px][][23px][][][][][][][][][]"));

		JRadioButton rdbtnVista = new JRadioButton("À vista ");
		buttonGroup.add(rdbtnVista);
		panel_4.add(rdbtnVista, "cell 0 1 1 2,alignx left,aligny bottom");

		JLabel lblNewLabel_19 = new JLabel("Dias:");
		panel_4.add(lblNewLabel_19, "cell 1 1 1 4,alignx right,aligny center");

		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 3 1 10 4,alignx left,aligny center");
		txtDias.setColumns(10);

		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnPrazo);
		panel_4.add(rdbtnPrazo, "cell 0 3 1 2,alignx left,aligny top");

		JLabel lblNewLabel_18 = new JLabel("Total a Pagar:");
		panel_4.add(lblNewLabel_18, "cell 0 7 2 1,alignx right,aligny center");

		JLabel lblTotalPagar = new JLabel("-");
		panel_4.add(lblTotalPagar, "cell 3 7");

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtnVista.isSelected()) {
					String total = chama.TotalpagarVista();
					lblTotalPagar.setText("R$ " + total);
				} else if (rdbtnPrazo.isSelected()) {
					Integer dias = Integer.valueOf(txtDias.getText());
					if (dias <= 30) {
						String total = chama.totalPagarPrazo();
						lblTotalPagar.setText("R$ " + total);
					} else if (dias > 30) {
						String total = chama.totalPagarPrazo30();
						lblTotalPagar.setText("R$ " + total);
					}
				}

			}
		});
		btnCalcular.setBounds(160, 545, 89, 23);
		contentPane.add(btnCalcular);

		JButton btnNovoCalculo = new JButton("Novo Calculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtDiesel.setText(null);
				txtComum.setText(null);
				txtAditivada.setText(null);
				txtEtanol.setText(null);
				txtPrecoFrascoM.setText(null);
				txtPrecoFrascoL.setText(null);
				txtFrascoM.setText(null);
				txtFrascoL.setText(null);
				txtLitros.setText(null);
				txtDias.setText(null);
				lblTotalPagar.setText(null);
				lblTotalC.setText("-");
				lblresultFrascoL.setText("-");
				lblresultFrascoM.setText("-");
				lblTotalOleo.setText("-");

			}
		});
		btnNovoCalculo.setBounds(306, 545, 108, 23);
		contentPane.add(btnNovoCalculo);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(471, 545, 89, 23);
		contentPane.add(btnFechar);
	}
}
