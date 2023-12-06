import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pagamento {
    private List<Pagamento> pagamentos;
    private List<Reembolso> reembolsos;
    private double valor;
    private Date data;

    public Pagamento() {
        this.pagamentos = new ArrayList<>();
        this.reembolsos = new ArrayList<>();
        this.data = new Date();
        this.valor = 0;
    }

    public void incluirPagamento(Fatura fatura, double valor) {
        if (fatura.isQuitado()) {
            System.out.println("Não é possível efetuar o pagamento. A fatura já está quitada.");
            return;
        }

        Pagamento pagamento = new Pagamento();
        fatura.addPagamento(pagamento);
        this.pagamentos.add(pagamento);

        if (fatura.getTotalPago() > fatura.getValor()) {
            double valorReembolso = fatura.getTotalPago() - fatura.getValor();
            Reembolso reembolso = new Reembolso(valorReembolso, this.data);
            this.reembolsos.add(reembolso);
            System.out.println("Reembolso gerado: " + reembolso);
        }

        if (fatura.getTotalPago() == fatura.getValor()) {
            fatura.setQuitado(true);
        }
    }

    public List<Pagamento> listarPagamentos() {
        return this.pagamentos;
    }

    public List<Pagamento> listarPagamentosFatura(Fatura fatura) {
        List<Pagamento> pagamentosFatura = new ArrayList<>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getFatura().equals(fatura)) {
                pagamentosFatura.add(pagamento);
            }
        }
        return pagamentosFatura;
    }

    public List<Reembolso> listarReembolsos() {
        return this.reembolsos;
    }
}