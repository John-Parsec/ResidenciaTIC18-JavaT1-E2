package empresa;

import java.util.ArrayList;

public class MenuPrincipal {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Fatura> faturas = new ArrayList<Fatura>();
    ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
    ArrayList<Falha> falhas = new ArrayList<Falha>();
    ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

    public static void main(String[] args) {
        MenuGerenciarClientes.main(args);   
    }
}
