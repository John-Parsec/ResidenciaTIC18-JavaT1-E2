package empresa;

import java.util.Date;

public class Reembolso {
    private double valor;
    private Date data;

    public Reembolso(double valor) {
        this.valor = valor;
        this.data = new Date();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Reembolso{" +
                "valor=" + valor +
                ", data=" + data +
                '}';
    }
}