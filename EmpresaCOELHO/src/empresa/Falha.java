package empresa;

import java.time.LocalDate;

public abstract class Falha {
	private String matricula;
	private String descricao;
	private LocalDate previsao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	Falha(){
		super();
	}
	
	Falha(String matricula){
		super();
		this.matricula = matricula;
	}
	
	Falha(String matricula, LocalDate previsao){
		super();
		this.matricula = matricula;
		this.previsao = previsao;
	}
	
	Falha(LocalDate previsao){
		super();
		this.previsao = previsao;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getPrevisao() {
		return previsao;
	}

	public void setPrevisao(LocalDate previsao) {
		this.previsao = previsao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
}
