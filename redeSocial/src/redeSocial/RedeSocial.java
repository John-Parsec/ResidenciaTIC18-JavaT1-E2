package redeSocial;

import java.util.Scanner;

public class RedeSocial {

}

public static void main(String[] args) {


int opcao;
Scanner entrada = new Scanner(System.in);

do {
    System.out.println("Menu Principal");
    System.out.println("1. Novo Usuário");
    System.out.println("2. Remover Usuário");
    System.out.println("3. Logar");
    System.out.println("0. Sair");

    opcao = entrada.nextInt();

    switch (opcao) {
        case 1:
            break;
        case 2:
            break;
        case 3:
            break;
        case 0:
            break;
        default:
            System.out.println("Opção inválida");
    }while (opcao != 3){

        if (opcao == 3) {
            do {
            System.out.println("Menu de sessão");
            System.out.println("1. Listar postagens");
            System.out.println("2. CriarPostagem");
            System.out.println("3. CriarAmizade (string nomeUsuario)");
            System.out.println("4. DesfazerAmizade (string nomeUsuario)");
            System.out.println("0. Menu anterior");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    listarPostagens();
                    break;
                case 2:
                    incluirPostagem();
                    break;
                case 3:
                    System.out.println("Digite o nome do novo amigo: ");
                    String novoAmigo = entrada.next();
                    try {
                        Usuario amigo = localizaUsuario(novoAmigo);
                        criarAmizade(amigo);
                    } catch (UsuarioNaoEncontradoException e) {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do ex-amigo: ");
                    String exAmigo = entrada.next();
                    try {
                        Usuario amigo = localizaUsuario(exAmigo);
                        destruirAmizade(amigo);
                    } catch (UsuarioNaoEncontradoException e) {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
                case 0:
                    deslogar();
                    return;
                default:
                    System.out.println("Opção inválida");
            } 
        }while (opcao != 0);
    }
    }
}

}