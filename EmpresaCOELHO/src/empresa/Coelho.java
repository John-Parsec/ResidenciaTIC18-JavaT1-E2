package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Coelho {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Fatura> faturas = new ArrayList<Fatura>();
    ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
    ArrayList<Falha> falhas = new ArrayList<Falha>();
    ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private static Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
        while(true){
            System.out.println("\n===== Menu de Gerenciamento de Imóveis =====");
            System.out.println("1. Menu de Clientes");
            System.out.println("2. Menu de Imóveis");
            System.out.println("3. Menu de Faturas");
            System.out.println("4. Menu de Pagamentos");
            System.out.println("5. Menu de Falhas");
            System.out.println("0. Sair do Menu");
            System.out.println("===========================================");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    menuClientes();
                    break;
                case 2:
                    menuFaturas();
                    break;
                case 3:
                    //MenuGerenciarFaturas.main(args);
                    break;
                case 4:
                    //MenuGerenciarPagamentos.main(args);
                    break;
                case 5:
                    //MenuGerenciarFalhas.main(args);
                    break;
                case 0:
                    System.out.println("Saindo do menu de gerenciamento de imóveis. Até mais!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Cliente

    public static void menuClientes() {
        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    criarCliente();
                    break;
                case 2:
                    consultarCliente();
                    break;
                case 3:
                    listarClientes();
                    break;
                case 4:
                    alterarCliente();
                    break;
                case 5:
                    removerCliente();
                    break;
                case 0:
                    System.out.println("Saindo do menu de gerenciamento de clientes. Até mais!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n===== Menu de Gerenciamento de Clientes =====");
        System.out.println("1. Criar Cliente");
        System.out.println("2. Consultar Cliente");
        System.out.println("3. Listar Clientes");
        System.out.println("4. Alterar Cliente");
        System.out.println("5. Remover Cliente");
        System.out.println("0. Sair do Menu");
        System.out.println("============================================");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarCliente() {
        System.out.println("\n===== Criar Novo Cliente =====");
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        Cliente novoCliente = new Cliente(cpf, nome);
        listaClientes.criaCliente(novoCliente);

        System.out.println("Cliente criado com sucesso!");
    }

    private static void consultarCliente() {
        System.out.println("\n===== Consultar Cliente =====");
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = listaClientes.consultarClientePorCPF(cpf);

        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("CPF: " + clienteEncontrado.getCPF());
            System.out.println("Nome: " + clienteEncontrado.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void listarClientes() {
        System.out.println("\n===== Listagem de Clientes =====");
        listaClientes.listarClientes();
    }

    private static void alterarCliente() {
        System.out.println("\n===== Alterar Cliente =====");
        System.out.print("Digite o CPF do cliente a ser alterado: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();

        if (listaClientes.alterarCliente(cpf, novoNome)) {
            System.out.println("Nome do cliente alterado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void removerCliente() {
        System.out.println("\n===== Remover Cliente =====");
        System.out.print("Digite o CPF do cliente a ser removido: ");
        String cpf = scanner.nextLine();

        Cliente clienteParaRemover = listaClientes.consultarClientePorCPF(cpf);

        if (clienteParaRemover != null) {
            listaClientes.removerCliente(clienteParaRemover);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    // Cliente

    // Fatura

    public void menuFaturas() {
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
                sc.close();
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
		System.out.print("Digite o valor da fatura: ");
		float valor = sc.nextFloat();
		System.out.println("Digite a penultima leitura: ");
		int penultimaLeitura = sc.nextInt();
		System.out.println("Digite a ultima leitura: ");
		int ultimaLeitura = sc.nextInt();

		Fatura fatura = new Fatura(ultimaLeitura,penultimaLeitura);
		fatura.setValor(valor);

		this.faturas.add(fatura);

        sc.close();
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
