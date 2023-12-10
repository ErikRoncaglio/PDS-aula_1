package Model;

public class Servico {

	private String nome;
	private String descricao;
	private String horario;
	private String local;
	private String FuncionarioResponsavel;
	private Integer Restricao_idade;
	private Integer capacidade_maxima;
	private Float Custo_servico;
	private String Equipamentos_fornecidos;
	private String Nivel_dificuldade;
	private String duracao;
	private Integer vagas_restantes;
	private String Feedback;
	private Integer vezes_reservado;

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

	public String getFuncionarioResponsavel() {
		return FuncionarioResponsavel;
	}

	public void setFuncionarioResponsavel(String funcionarioResponsavel) {
		FuncionarioResponsavel = funcionarioResponsavel;
	}

	public Integer getRestricao_idade() {
		return Restricao_idade;
	}

	public void setRestricao_idade(Integer restricao_idade2) {
		Restricao_idade = restricao_idade2;
	}

	public Integer getCapacidade_maxima() {
		return capacidade_maxima;
	}

	public void setCapacidade_maxima(Integer capacidade_maxima2) {
		this.capacidade_maxima = capacidade_maxima2;
	}

	public Float getCusto_servico() {
		return Custo_servico;
	}

	public void setCusto_servico(Float custo_servico2) {
		Custo_servico = custo_servico2;
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

	public Integer getVagas_restantes() {
		return vagas_restantes;
	}

	public void setVagas_restantes(Integer vagas_restantes2) {
		this.vagas_restantes = vagas_restantes2;
	}

	public String getFeedback() {
		return Feedback;
	}

	public void setFeedback(String feedback) {
		Feedback = feedback;
	}

	public Integer getVezes_reservado() {
		return vezes_reservado;
	}

	public void setVezes_reservado(Integer vezes_reservado2) {
		this.vezes_reservado = vezes_reservado2;
	}

}
