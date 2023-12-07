package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuGerenciarReparos {
    private static Scanner scanner = new Scanner(System.in);
    private static ListaReparos lista_reparos = new ListaReparos();

    public static void main(String[] args) {
        while (true) {
            exibirMenu();

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
                    removerRoparo();
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

    private static void exibirMenu() {
        System.out.println("\n===== Menu de Gerenciamento de Roparo =====");
        System.out.println("1. Criar Reparo");
        System.out.println("2. Consultar Reparo");
        System.out.println("3. Listar Roparo");
        System.out.println("4. Alterar Reparo");
        System.out.println("5. Remover Reparo");
        System.out.println("6. Resolver Reparo");
        System.out.println("0. Sair do Menu");
        System.out.println("============================================");
        System.out.print("Escolha uma opção: ");
    }
    private static void criarReparo(){
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

    private static void consultarReparo() {
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

    private static void listarReparo() {
        System.out.println("\n===== Listagem de Reparo =====");
        lista_reparos.listarReparos();
    }

    private static void alterarReparo() {
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

    private static void removerRoparo(){
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
    
    private static void ResolverReparo() {
        System.out.println("\n===== Resolver Reparo =====");
        System.out.print("Digite a descrição: ");
        String descricao = scanner.nextLine();

        Reparo reparoParaRemover = lista_reparos.consultarReparoPorDescricao(descricao);
        if (reparoParaRemover != null) {
            lista_reparos.ResolveReparo(reparoParaRemover);
            System.out.println("Roparo removido com sucesso!");
        } else {
            System.out.println("Roparo não encontrado.");
        }
    }
    
    
    
    
    
}
