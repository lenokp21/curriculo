package br.com.projeto.entidade;

public class Progresso {

	private String conhecimento;
	private Integer progresso;
	
	public Progresso(String conhecimento, Integer progresso) {
		this.conhecimento = conhecimento;
		this.progresso = progresso;
	}

	public String getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(String conhecimento) {
		this.conhecimento = conhecimento;
	}

	public Integer getProgresso() {
		return progresso;
	}

	public void setProgresso(Integer progresso) {
		this.progresso = progresso;
	}

}
