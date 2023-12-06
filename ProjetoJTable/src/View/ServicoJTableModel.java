package View;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Model.Servico;

public class ServicoJTableModel extends AbstractTableModel {

	private ArrayList<Servico> lista;
	private String[] colunas = { "Nome", "Descrição", "Horário", "Local", "Funcionário", "Idade", "Vagas", "Custo",
			"Equipamentos", "Dificuldade", "Duração", "Vagas Livres", "Feedback", "Reservas" };

	public ServicoJTableModel(ArrayList<Servico> lista) {
		this.lista = lista;
	}

	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Servico s = lista.get(rowIndex);
		if (columnIndex == 0) {
			return s.getNome();
		} else if (columnIndex == 1) {
			return s.getDescricao();
		} else if (columnIndex == 2) {
			return s.getHorario();
		} else if (columnIndex == 3) {
			return s.getLocal();
		} else if (columnIndex == 4) {
			return s.getFuncionário_responsavel();
		} else if (columnIndex == 5) {
			return s.getRestricao_idade();
		} else if (columnIndex == 5) {
			return s.getCapacidade_maxima();
		} else if (columnIndex == 5) {
			return s.getCusto_servico();
		} else if (columnIndex == 5) {
			return s.getEquipamentos_fornecidos();
		} else if (columnIndex == 5) {
			return s.getNivel_dificuldade();
		} else if (columnIndex == 5) {
			return s.getDescricao();
		} else if (columnIndex == 5) {
			return s.getVagas_restantes();
		} else if (columnIndex == 5) {
			return s.getFeedback();
		} else if (columnIndex == 5) {
			return s.getVezes_reservado();
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}

}
