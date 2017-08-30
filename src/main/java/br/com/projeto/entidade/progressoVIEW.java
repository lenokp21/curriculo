package br.com.projeto.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class progressoVIEW {

	private List<Progresso> progressos;
	
	@PostConstruct
	public void init(){
		progressos = new ArrayList<Progresso>();
		
		progressos.add(new Progresso("JAVA", 3));
		progressos.add(new Progresso("PL/SQL", 2));
		progressos.add(new Progresso("MySql", 4));
		
	}

	public List<Progresso> getProgressos() {
		return progressos;
	}

	public void setProgressos(List<Progresso> progressos) {
		this.progressos = progressos;
	}
	
	
	
}
