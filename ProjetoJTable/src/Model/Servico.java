package Model;

public class Servico {

	private String nome;
	private String descricao;
	private String horario;
	private String local;
	private String Funcionário_responsavel;
	private String Restricao_idade;
	private String capacidade_maxima;
	private String Custo_servico;
	private String Equipamentos_fornecidos;
	private String Nivel_dificuldade;
	private String duracao;
	private String vagas_restantes;
	private String Feedback;
	private String vezes_reservado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getFuncionário_responsavel() {
		return Funcionário_responsavel;
	}

	public void setFuncionário_responsavel(String funcionario_responsavel) {
		Funcionário_responsavel = funcionario_responsavel;
	}

	public String getRestricao_idade() {
		return Restricao_idade;
	}

	public void setRestricao_idade(String restricao_idade) {
		Restricao_idade = restricao_idade;
	}

	public String getCapacidade_maxima() {
		return capacidade_maxima;
	}

	public void setCapacidade_maxima(String capacidade_maxima) {
		this.capacidade_maxima = capacidade_maxima;
	}

	public String getCusto_servico() {
		return Custo_servico;
	}

	public void setCusto_servico(String custo_servico) {
		Custo_servico = custo_servico;
	}

	public String getEquipamentos_fornecidos() {
		return Equipamentos_fornecidos;
	}

	public void setEquipamentos_fornecidos(String equipamentos_fornecidos) {
		Equipamentos_fornecidos = equipamentos_fornecidos;
	}

	public String getNivel_dificuldade() {
		return Nivel_dificuldade;
	}

	public void setNivel_dificuldade(String nivel_dificuldade) {
		Nivel_dificuldade = nivel_dificuldade;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getVagas_restantes() {
		return vagas_restantes;
	}

	public void setVagas_restantes(String vagas_restantes) {
		this.vagas_restantes = vagas_restantes;
	}

	public String getFeedback() {
		return Feedback;
	}

	public void setFeedback(String feedback) {
		Feedback = feedback;
	}

	public String getVezes_reservado() {
		return vezes_reservado;
	}

	public void setVezes_reservado(String vezes_reservado) {
		this.vezes_reservado = vezes_reservado;
	}

}
