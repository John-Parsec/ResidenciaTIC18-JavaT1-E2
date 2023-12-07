package empresa;

import java.util.Date;

public class Pagamento {
    private Reembolso reembolso;
    private float valor;
    private Date data;
    private String cpf;
    String matricula;

    public Pagamento(float valor, String cpf, String matricula) {
        this.data = new Date();
        this.valor = valor;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public void setReembolso(Reembolso reembolso) {
        this.reembolso = reembolso;
    }

    public Reembolso getReembolso() {
        return reembolso;
    }

    public float getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Pagamento [reembolso=" + reembolso + ", valor=" + valor + ", data=" + data + ", cpf=" + cpf
                + ", matricula=" + matricula + "]";
    }
}