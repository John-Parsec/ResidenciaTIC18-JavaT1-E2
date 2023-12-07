package p002;

import java.util.Scanner;

public class ConversorMoeda {
    private double taxaCambio;

    public ConversorMoeda() {
        super();
    }

    public ConversorMoeda(double taxaCambio) {
        super();
        this.taxaCambio = taxaCambio;
    }

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public void setTaxaCambio(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    public double converter(double valorDolar) {
        return valorDolar * this.taxaCambio;
    }

    public static void main(String[] args) {
        ConversorMoeda conversorReal = new ConversorMoeda();
        double taxaCambio;
        double valorDolar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a taxa de câmbio: ");
        taxaCambio = sc.nextDouble();
        
        conversorReal.setTaxaCambio(taxaCambio);

        System.out.println("Digite o valor em dólar: ");
        valorDolar = sc.nextDouble();

        System.out.println("Valor convertido: " + conversorReal.converter(valorDolar)); 

        sc.close();
    }
    
}
