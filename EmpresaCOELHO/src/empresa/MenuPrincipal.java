package empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Fatura> faturas = new ArrayList<Fatura>();
    ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
    ArrayList<Falha> falhas = new ArrayList<Falha>();
    ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	exibirMenu();
    	
		int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (opcao) {
            case 1:
                MenuGerenciarClientes.main(args);
                break;
            case 2:
            	MenuGerenciarImoveis.main(args);
                break;
            case 3:
                MenuGerenciarFaturas.main(args);
                break;
            case 4:
            	MenuGerenciarPagamentos.main(args);
                break;
            case 5:
            	MenuGerenciarFalhas.main(args);
                break;
            case 0:
                System.out.println("Saindo do menu de gerenciamento de imóveis. Até mais!");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    
    private static void exibirMenu() {
        System.out.println("\n===== Menu de Gerenciamento de Imóveis =====");
        System.out.println("1. Menu de Clientes");
        System.out.println("2. Menu de Imóveis");
        System.out.println("3. Menu de Faturas");
        System.out.println("4. Menu de Pagamentos");
        System.out.println("5. Menu de Falhas");
        System.out.println("0. Sair do Menu");
        System.out.println("===========================================");
        System.out.print("Escolha uma opção: ");
    }
}
