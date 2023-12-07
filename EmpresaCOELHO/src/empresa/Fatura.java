package empresa;

import java.time.LocalDateTime;

public class Fatura {
	private LocalDateTime data;
	private	int ultimaLeitura;
	private int penultimaLeitura;
	private float valor;
	private boolean quitado;
	
	public Fatura(int ultimaLeitura, int penultimaLeitura) {
		super();
		this.data = LocalDateTime.now();
		this.ultimaLeitura = ultimaLeitura;
		this.penultimaLeitura = penultimaLeitura;
		this.quitado = false;
	}

	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
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
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public boolean isQuitado() {
		return quitado;
	}
	
	public void setQuitado(boolean quitado) {
		this.quitado = quitado;
	}
	
	public float calculaValor() {
		return (this.ultimaLeitura - this.penultimaLeitura) * 10;
	}
	
	public void adicionaPagamento(Pagamento pagamento){
		if(this.quitado){
			System.out.println("A fatura já está quitada!");
			return;
		}

		if(pagamento.getValor() >= this.calculaValor()){
			this.quitado = true;
			if(pagamento.getValor() > this.calculaValor()){
				Reembolso reembolso = new Reembolso(pagamento.getValor() - this.calculaValor());
				pagamento.setReembolso(reembolso);
				System.out.printf("Reembolso feito de R$%.2f%n", pagamento.getReembolso().getValor());
			}
		}
	}
}
