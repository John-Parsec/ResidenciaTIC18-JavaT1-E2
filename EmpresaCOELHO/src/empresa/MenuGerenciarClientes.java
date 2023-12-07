package empresa;

import java.util.Scanner;

public class MenuGerenciarClientes {
    private static Scanner scanner = new Scanner(System.in);
    private static ListaClientes listaClientes = new ListaClientes();

    public static void main(String[] args) {
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
}

