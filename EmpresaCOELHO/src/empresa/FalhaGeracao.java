package empresa;

import java.time.LocalDate;

public class FalhaGeracao extends Falha{
	
	FalhaGeracao(String matricula, LocalDate previsao) {
		super(matricula, previsao);
	}
	
	FalhaGeracao(LocalDate previsao) {
		super(previsao);
	}
}
