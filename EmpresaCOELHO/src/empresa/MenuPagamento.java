package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPagamento {
	private ArrayList<Pagamento> pagamentos;
	
	public MenuPagamento(ArrayList<Pagamento> pagamentos) {
		super();
		this.pagamentos = pagamentos;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n===== Menu de Pagamentos =====");
			System.out.println("1. Criar um novo Pagamento");
			System.out.println("2. Listar Todos os Pagamentos");
			System.out.println("3. Listar Pagamentos Em Aberto");
			System.out.println("0. Sair do Menu");
			System.out.println("===========================================");
			System.out.print("Escolha uma opção: ");
			

			switch (sc.nextInt()) {
			case 1:
				adcionarPagamento();
				break;
			case 2:
				listarPagamento();
				break;
			case 3:
				listarPagamentoEmAberto();
				break;
			case 0:
				System.out.println("Saindo do Menu de Pagamentos...");
				return;
			}
		}
	}

	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void addPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
	}

	private static void adcionarPagamento() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n===== Criar um Novo Pagamento =====");
		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Digite o valor a ser pago: ");
		double valor = sc.nextDouble();
		
		Pagamentos pagamento = new Pagamentos(nomeCliente, valor);
        pagamento.setNomeCliente(nomeCliente);
        pagamento.setValor(valor);
		
		this.pagamentos.add(pagamento);
	}

	private void listarPagamento() {
		System.out.println("\n===== Listar Todos os Pagamentos =====");
		for (Pagamento pagamento : this.pagamentos) {
			System.out.println(pagamento);
		}
	}

	private static void listarPagamentoEmAberto() {
		System.out.println("\n===== Listar Pagamentos Em Aberto =====");
		for (Pagamento pagamento : this.pagamentos) {
			if(!pagamento.isQuitado()){
				System.out.println(pagamento);
			}
		}
	}
}
