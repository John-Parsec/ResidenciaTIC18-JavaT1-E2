package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Coelho {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Fatura> faturas = new ArrayList<Fatura>();
    ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
    ArrayList<Falha> falhas = new ArrayList<Falha>();
    ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    ListaClientes listaClientes = new ListaClientes();
    ListaReparos lista_reparos = new ListaReparos();
    private static Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
        while(true){
            System.out.println("\n===== Menu =====");
            System.out.println("1. Menu de Clientes");
            System.out.println("2. Menu de Imóveis");
            System.out.println("3. Menu de Faturas");
            System.out.println("4. Menu de Pagamentos");
            System.out.println("5. Incluir Falhas");
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
                    menuImoveis();
                    break;
                case 3:
                    menuFaturas();
                    break;
                case 4:
                    menuPagamentos();
                    break;
                case 5:
                	incluirFalha();
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

    public void menuClientes() {
        while (true) {
            System.out.println("\n===== Menu de Gerenciamento de Clientes =====");
            System.out.println("1. Criar Cliente");
            System.out.println("2. Consultar Cliente");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Alterar Cliente");
            System.out.println("5. Remover Cliente");
            System.out.println("0. Sair do Menu");
            System.out.println("============================================");
            System.out.print("Escolha uma opção: ");

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

    private void criarCliente() {
        System.out.println("\n===== Criar Novo Cliente =====");
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        Cliente novoCliente = new Cliente(cpf, nome);
        listaClientes.criaCliente(novoCliente);

        System.out.println("Cliente criado com sucesso!");
    }

    private void consultarCliente() {
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

    private void listarClientes() {
        System.out.println("\n===== Listagem de Clientes =====");
        listaClientes.listarClientes();
    }

    private void alterarCliente() {
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

    private void removerCliente() {
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

    // Fatura

    // Imovel

     public void menuImoveis() {
        while (true) {
            System.out.println("\n===== Menu de Gerenciamento de Imóveis =====");
            System.out.println("1. Criar Imóvel");
            System.out.println("2. Consultar Imóvel");
            System.out.println("3. Listar Imóveis");
            System.out.println("4. Alterar Imóvel");
            System.out.println("5. Remover Imóvel");
            System.out.println("6. Realizar Leitura");
            System.out.println("7. Vincular Falha");
            System.out.println("0. Sair do Menu");
            System.out.println("===========================================");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    criarImovel();
                    break;
                case 2:
                    consultarImovel();
                    break;
                case 3:
                    listarImoveis();
                    break;
                case 4:
                    alterarImovel();
                    break;
                case 5:
                    removerImovel();
                    break;
                case 6:
                    realizarLeitura();
                    break;
                case 7:
                    vincularFalha();
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

    private void criarImovel() {
        System.out.println("\n===== Criar Novo Imóvel =====");
        System.out.print("Digite a matrícula do imóvel: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o endereço do imóvel: ");
        String endereco = scanner.nextLine();

        Imovel novoImovel = new Imovel(matricula, endereco);
        imoveis.add(novoImovel);

        System.out.println("Imóvel criado com sucesso!");
    }

    private void consultarImovel() {
        System.out.println("\n===== Consultar Imóvel =====");
        System.out.print("Digite a matrícula do imóvel: ");
        String matricula = scanner.nextLine();

        Imovel imovelEncontrado = consultarImovelPorMatricula(matricula);

        if (imovelEncontrado != null) {
            System.out.println("Imóvel encontrado:");
            System.out.println("Matrícula: " + imovelEncontrado.getMatricula());
            System.out.println("Endereço: " + imovelEncontrado.getEndereço());
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private void listarImoveis() {
        System.out.println("\n===== Listagem de Imóveis =====");
        for (Imovel imovel : imoveis) {
            System.out.println("Matrícula: " + imovel.getMatricula());
            System.out.println("Endereço: " + imovel.getEndereço());
            System.out.println("------------------------------");
        }
    }

    private void alterarImovel() {
        System.out.println("\n===== Alterar Imóvel =====");
        System.out.print("Digite a matrícula do imóvel a ser alterado: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o novo endereço: ");
        String novoEndereco = scanner.nextLine();

        Imovel imovelParaAlterar = consultarImovelPorMatricula(matricula);

        if (imovelParaAlterar != null) {
            imovelParaAlterar.setEndereço(novoEndereco);
            System.out.println("Endereço do imóvel alterado com sucesso!");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private void removerImovel() {
        System.out.println("\n===== Remover Imóvel =====");
        System.out.print("Digite a matrícula do imóvel a ser removido: ");
        String matricula = scanner.nextLine();

        Imovel imovelParaRemover = consultarImovelPorMatricula(matricula);

        if (imovelParaRemover != null) {
            imoveis.remove(imovelParaRemover);
            System.out.println("Imóvel removido com sucesso!");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private void realizarLeitura() {
        System.out.println("\n===== Realizar Leitura =====");
        System.out.print("Digite a matrícula do imóvel: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite a leitura atual do relógio: ");
        int leituraAtual = scanner.nextInt();

        Imovel imovel = consultarImovelPorMatricula(matricula);

        if (imovel != null) {
            imovel.realizarLeitura(leituraAtual);
            System.out.println("Leitura realizada com sucesso!");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private void vincularFalha() {
        System.out.println("\n===== Vincular Falha =====");
        System.out.print("Digite a matrícula do imóvel: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o tipo da falha: ");
        String tipoFalha = scanner.nextLine().toLowerCase();
        System.out.print("Digite a descrição da falha: ");
        String descricaoFalha = scanner.nextLine();

        Imovel imovel = consultarImovelPorMatricula(matricula);

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataFutura = dataAtual.plusWeeks(1);

        if (imovel != null) {
            if (tipoFalha == "distribuição"){
                FalhaDistribuicao FalhaDistribuicao = new FalhaDistribuicao(matricula, dataFutura);
                imovel.vincularFalha(FalhaDistribuicao);
                FalhaDistribuicao.setDescricao(descricaoFalha);
                System.out.println("Falha vinculada com sucesso!");
            } else if (tipoFalha == "geração"){
                FalhaGeracao FalhaGeracao = new FalhaGeracao(matricula, dataFutura);
                imovel.vincularFalha(FalhaGeracao);
                FalhaGeracao.setDescricao(descricaoFalha);
                System.out.println("Falha vinculada com sucesso!");
            }

        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private Imovel consultarImovelPorMatricula(String matricula) {
        for (Imovel imovel : imoveis) {
            if (imovel.getMatricula().equalsIgnoreCase(matricula)) {
                return imovel;
            }
        }
        return null;
    }

    private void incluirFalha(){
        System.out.println("\n===== Criar Nova Falha =====");
        System.out.print("A Falha é de um imóvel? (S/N) ");
        String opcaoImovel = scanner.nextLine();
        
        if(opcaoImovel.equals("S") || opcaoImovel.equals("s")) {
        	System.out.print("Qual a matrícula do imóvel? ");
            String matricula = scanner.nextLine();
            
            System.out.print("Qual a data de previsão? ");
            LocalDate previsao = LocalDate.now().plusWeeks(1);            
            System.out.print("Qual o tipo de falha?");
            System.out.print("1. Falha de geração");
            System.out.print("2. Falha de distribuição");
            int opcaoFalha = scanner.nextInt();
            
            if(opcaoFalha == 1) {
            	FalhaGeracao falha = new FalhaGeracao(matricula, previsao);
            	falhas.add(falha);
            } else if (opcaoFalha == 2) {
            	FalhaDistribuicao falha = new FalhaDistribuicao(matricula, previsao);
            	falhas.add(falha);
            	
            	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            	
                System.out.println("\n===== Criar Novo Reparo =====");
                System.out.print("Digite a descrição do Repare: ");
                String descricao = scanner.nextLine();
                System.out.print("Digite a data da Previsão (dd/mm/yyyy): "); 
                LocalDate dataPrevisao = LocalDate.parse(scanner.nextLine(), formatter);

                Reparo novoReparo = new Reparo(descricao, dataPrevisao);
                lista_reparos.criaReparo(novoReparo);
                falha.addReparos(novoReparo);
                System.out.println("Reparo criado com sucesso!");
            } else {
            	System.out.print("Opção inválida!");
            }
        } else {
        	System.out.print("Qual a data de previsão? ");
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String data = scanner.nextLine();
            LocalDate previsao = LocalDate.parse(data, formato);
        	
        	System.out.print("Qual o tipo de falha?");
            System.out.print("1. Falha de geração");
            System.out.print("2. Falha de distribuição");
            int opcaoFalha = scanner.nextInt();
            
            if(opcaoFalha == 1) {
            	FalhaGeracao falha = new FalhaGeracao(previsao);
            	falhas.add(falha);
            } else if (opcaoFalha == 2) {
            	FalhaDistribuicao falha = new FalhaDistribuicao();
            	falhas.add(falha);
            	
            	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            	
                System.out.println("\n===== Criar Novo Reparo =====");
                System.out.print("Digite a descrição do Repare: ");
                String descricao = scanner.nextLine();
                System.out.print("Digite a data da Previsão (dd/mm/yyyy): "); 
                LocalDate dataPrevisao = LocalDate.parse(scanner.nextLine(), formatter);

                Reparo novoReparo = new Reparo(descricao, dataPrevisao);
                lista_reparos.criaReparo(novoReparo);
                falha.addReparos(novoReparo);
                System.out.println("Reparo criado com sucesso!");
            } else {
            	System.out.print("Opção inválida!");
            }
        }       
    }


    public void menuReparos() {
        while (true) {
            System.out.println("\n===== Menu de Gerenciamento de Reparo =====");
            System.out.println("1. Criar Reparo");
            System.out.println("2. Consultar Reparo");
            System.out.println("3. Listar Reparo");
            System.out.println("4. Alterar Reparo");
            System.out.println("5. Remover Reparo");
            System.out.println("6. Resolver Reparo");
            System.out.println("0. Sair do Menu");
            System.out.println("============================================");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    criarReparo();
                    break;
                case 2:
                    consultarReparo();
                    break;
                case 3:
                    listarReparo();
                    break;
                case 4:
                    alterarReparo();
                    break;
                case 5:
                    removerReparo();
                    break;
                case 6:
                	ResolverReparo();
                    break;
                case 0:
                    System.out.println("Saindo do menu de gerenciamento de Roparo. Até mais!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void criarReparo(){
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	
        System.out.println("\n===== Criar Novo Reparo =====");
        System.out.print("Digite a descrição do Repare: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite a data da Previsão (dd/mm/yyyy): "); 
        LocalDate dataPrevisao = LocalDate.parse(scanner.nextLine(), formatter);

        Reparo novoReparo = new Reparo(descricao, dataPrevisao);
        lista_reparos.criaReparo(novoReparo);
        System.out.println("Reparo criado com sucesso!");
    }

    private void consultarReparo() {
        System.out.println("\n===== Consultar Reparo =====");
        System.out.print("Digite a descrição: ");
        String descricao = scanner.nextLine();

        Reparo reparoPorDescricao = lista_reparos.consultarReparoPorDescricao(descricao);
        
        if (reparoPorDescricao != null) {
            System.out.println("Descrição: " + reparoPorDescricao.getDescricao() +
            ", Previsão: " + reparoPorDescricao.getPrevisao() +
            ", Resolvido: " + reparoPorDescricao.isResolveu());

        } else {
            System.out.println("lista_reparos não encontrado.");
        }
    }

    private void listarReparo() {
        System.out.println("\n===== Listagem de Reparo =====");
        lista_reparos.listarReparos();
    }

    private void alterarReparo() {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	
        System.out.println("\n===== Criar Novo Reparo =====");
        System.out.print("Digite a nova descrição do Repare: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite a nova descrição do Repare: ");
        String nova_descricao = scanner.nextLine();
        System.out.print("Digite a nova data da Previsão (dd/mm/yyyy): "); 
        LocalDate nova_previsao = LocalDate.parse(scanner.nextLine(), formatter);

        if (lista_reparos.alterarReparo(descricao, nova_previsao, nova_descricao)) {
            System.out.println("Nome do Reparo alterado com sucesso!");
        } else {
            System.out.println("Reparo não encontrado.");
        }
    }

    private void removerReparo(){
        System.out.println("\n===== Remover Reparo =====");
        System.out.print("Digite a descrição: ");
        String descricao = scanner.nextLine();

        Reparo reparoParaRemover = lista_reparos.consultarReparoPorDescricao(descricao);
        
        if (reparoParaRemover != null) {
            lista_reparos.removerReparo(reparoParaRemover);
            System.out.println("Roparo removido com sucesso!");
        } else {
            System.out.println("Roparo não encontrado.");
        }
    }
    
    private void ResolverReparo() {
        System.out.println("\n===== Resolver Reparo =====");
        System.out.print("Digite a descrição: ");
        String descricao = scanner.nextLine();

        Reparo reparoParaRemover = lista_reparos.consultarReparoPorDescricao(descricao);
        if (reparoParaRemover != null) {
            lista_reparos.ResolveReparo(reparoParaRemover);
            System.out.println("Reparo removido com sucesso!");
        } else {
            System.out.println("Reparo não encontrado.");
        }
    }

    // Reparo

    // Pagamento

    public void menuPagamentos() {
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
                sc.close();
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

	private void adcionarPagamento() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n===== Criar um Novo Pagamento =====");
		System.out.print("Digite o a matricula do imovel: ");
		String matricula = sc.nextLine();
		
		Imovel imovelEncontrado = consultarImovelPorMatricula(matricula);
		
		if (imovelEncontrado ==  null) {
			System.out.println("Imve não encontrado");
			sc.close();
			return;
		}
		
        System.out.println("Digite o CPF do cliente:");
        String cpf = sc.nextLine();
		System.out.print("Digite o valor a ser pago: ");
		float valor = sc.nextFloat();
		
		Pagamento pagamento = new Pagamento(valor, cpf, matricula);
		
		this.pagamentos.add(pagamento);
        sc.close();
	}

	private void listarPagamento() {
		System.out.println("\n===== Listar Todos os Pagamentos =====");
		for (Pagamento pagamento : this.pagamentos) {
			System.out.println(pagamento);
		}
	}

	private void listarPagamentoEmAberto() {
		System.out.println("\n===== Listar Pagamentos Em Aberto =====");
		for (Fatura fatura : this.faturas) {
			if(!fatura.isQuitado()){
				System.out.println(fatura.pagamento);
			}
		}
	}
}
