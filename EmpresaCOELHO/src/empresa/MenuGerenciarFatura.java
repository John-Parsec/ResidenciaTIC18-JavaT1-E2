package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuGerenciarFatura {
	private ArrayList<Fatura> faturas;
	
	public MenuGerenciarFatura(ArrayList<Fatura> faturas) {
		super();
		this.faturas = faturas;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n===== Menu de Gerenciamento de Faturas =====");
			System.out.println("1. Criar Nova Fatura");
			System.out.println("2. Listar Todas Faturas");
			System.out.println("3. Listar faturas Em Aberto");
			System.out.println("0. Sair do Menu");
			System.out.println("===========================================");
			System.out.print("Escolha uma opção: ");
			

			switch (sc.nextInt()) {
			case 1:
				adcionarFatura();
				break;
			case 2:
				listarFaturas();
				break;
			case 3:
				listarFaturasEmAberto();
				break;
			case 0:
				System.out.println("Saindo do Menu de Gerenciamento de Faturas...");
				return;
			}
		}
	}

	public ArrayList<Fatura> getFaturas() {
		return faturas;
	}

	public void addFatura(Fatura fatura) {
		this.faturas.add(fatura);
	}

	private void adcionarFatura() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n===== Criar Nova Fatura =====");
		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Digite o valor da fatura: ");
		double valor = sc.nextDouble();
		System.out.println("Digite a penultima leitura: ");
		int penultimaLeitura = sc.nextInt();
		System.out.println("Digite a ultima leitura: ");
		int ultimaLeitura = sc.nextInt();

		Fatura fatura = new Fatura(ultimaLeitura,penultimaLeitura);
		fatura.setNomeCliente(nomeCliente);
		fatura.setValor(valor);

		this.faturas.add(fatura);
	}

	private void listarFaturas() {
		System.out.println("\n===== Listar Todas Faturas =====");
		for (Fatura fatura : this.faturas) {
			System.out.println(fatura);
		}
	}

	private void listarFaturasEmAberto() {
		System.out.println("\n===== Listar Faturas Em Aberto =====");
		for (Fatura fatura : this.faturas) {
			if(!fatura.isQuitado()){
				System.out.println(fatura);
			}
		}
	}
}
