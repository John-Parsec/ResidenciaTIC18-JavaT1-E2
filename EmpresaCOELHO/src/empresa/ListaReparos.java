package empresa;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ListaReparos {
	private static ArrayList<Reparo> lista_reparo = new ArrayList<Reparo>();
	
	public void criaReparo(Reparo reparo) {
		lista_reparo.add(reparo);
	}
	public void removerReparo(Reparo reparo) {
		lista_reparo.remove(reparo);
	}
	
    public Reparo consultarReparoPorDescricao(String descricao) {
        for (Reparo reparo : lista_reparo) {
            if (reparo.getDescricao().equals(descricao)) {
                return reparo;
            }
        }
        return null;
    }
    
    
    public void listarReparos() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for (Reparo reparo : lista_reparo) {
            LocalDate dataPrevisao = reparo.getPrevisao();
            String dataFormatada = dataPrevisao.format(formatter);
    
            System.out.println("Descrição: " + reparo.getDescricao() +
                               ", Previsão: " + dataFormatada +
                               ", Resolvido: " + reparo.isResolveu());
        }
    }

    public boolean alterarReparo(String descricao, LocalDate previsao,  String novaDescricao) {
        Reparo reparoParaAlterar = consultarReparoPorDescricao(descricao);

        if (reparoParaAlterar != null) {
            reparoParaAlterar.setDescricao(novaDescricao);
            reparoParaAlterar.setPrevisao(previsao);
            return true;
        } else {
            return false;
        }
    }
    public void ResolveReparo(Reparo resolverReparo) {
       resolverReparo.setResolveu(true);
    }
	
	
}
