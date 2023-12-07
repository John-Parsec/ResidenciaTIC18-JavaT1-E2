package empresa;

import java.time.LocalDate;
import java.util.ArrayList;

public class FalhaDistribuicao extends Falha{
	ArrayList<Reparo> reparos;
	
	FalhaDistribuicao(String matricula, LocalDate previsao) {
		super(matricula, previsao);
	}
	
	FalhaDistribuicao() {
		super();
	}

	public ArrayList<Reparo> getReparos() {
		return reparos;
	}

	public void addReparos(Reparo reparo) {
		this.reparos.add(reparo);
	}
	
}
