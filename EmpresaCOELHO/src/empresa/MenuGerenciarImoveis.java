package empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuGerenciarImoveis {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Imovel> listaImoveis = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            exibirMenu();

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

    private static void exibirMenu() {
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
    }

    private static void criarImovel() {
        System.out.println("\n===== Criar Novo Imóvel =====");
        System.out.print("Digite a matrícula do imóvel: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o endereço do imóvel: ");
        String endereco = scanner.nextLine();

        Imovel novoImovel = new Imovel(matricula, endereco);
        listaImoveis.add(novoImovel);

        System.out.println("Imóvel criado com sucesso!");
    }

    private static void consultarImovel() {
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

    private static void listarImoveis() {
        System.out.println("\n===== Listagem de Imóveis =====");
        for (Imovel imovel : listaImoveis) {
            System.out.println("Matrícula: " + imovel.getMatricula());
            System.out.println("Endereço: " + imovel.getEndereço());
            System.out.println("------------------------------");
        }
    }

    private static void alterarImovel() {
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

    private static void removerImovel() {
        System.out.println("\n===== Remover Imóvel =====");
        System.out.print("Digite a matrícula do imóvel a ser removido: ");
        String matricula = scanner.nextLine();

        Imovel imovelParaRemover = consultarImovelPorMatricula(matricula);

        if (imovelParaRemover != null) {
            listaImoveis.remove(imovelParaRemover);
            System.out.println("Imóvel removido com sucesso!");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private static void realizarLeitura() {
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

    private static void vincularFalha() {
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

    private static Imovel consultarImovelPorMatricula(String matricula) {
        for (Imovel imovel : listaImoveis) {
            if (imovel.getMatricula().equalsIgnoreCase(matricula)) {
                return imovel;
            }
        }
        return null;
    }
}
