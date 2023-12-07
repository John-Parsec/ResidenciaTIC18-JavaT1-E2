package empresa;

import java.util.ArrayList;

public class Imovel {
	private String matricula;
	private String endereço;
	private int ultimaLeitura;
	private int penultimaLeitura;
	private ArrayList<Fatura> faturas;
	private ArrayList<Falha> falhas;
	
	public Imovel(String matricula, String endereço) {
		super();
		this.matricula = matricula;
		this.endereço = endereço;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getEndereço() {
		return endereço;
	}
	
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public int getUltimaLeitura() {
		return ultimaLeitura;
	}
	
	public void setUltimaLeitura(int ultimaLeitura) {
		this.ultimaLeitura = ultimaLeitura;
	}
	
	public int getPenultimaLeitura() {
		return penultimaLeitura;
	}
	
	public void setPenultimaLeitura(int penultimaLeitura) {
		this.penultimaLeitura = penultimaLeitura;
	}
	
	public ArrayList<Fatura> getFaturas() {
		return faturas;
	}
	
	public void setFaturas(ArrayList<Fatura> faturas) {
		this.faturas = faturas;
	}
	
	public ArrayList<Falha> getFalhas() {
		return falhas;
	}
	
	public void setFalhas(ArrayList<Falha> falhas) {
		this.falhas = falhas;
	}
	
	public void realizarLeitura(int leituraAtual) {
		this.penultimaLeitura = this.ultimaLeitura;
		this.ultimaLeitura = leituraAtual;
		Fatura fatura = new Fatura(this.ultimaLeitura, this.penultimaLeitura);
		this.faturas.add(fatura);
	}
	
	public void vincularFalha(Falha falha) {
		this.falhas.add(falha);
	}
}
