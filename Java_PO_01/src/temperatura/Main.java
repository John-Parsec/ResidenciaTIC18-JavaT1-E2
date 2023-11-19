package temperatura;
import temperatura.Temperatura;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		Temperatura tem0 = new Temperatura(15, "Fahrenheit");
		Temperatura tem = new Temperatura();
		
		System.out.println("Digite a temperatura : ");
		tem.setTemperatura(sc.nextFloat());
		
		System.out.println("Digite a unidade de origem: ");
		tem.setUnidade_origem(sc.next());
		
		float converteFah = Temperatura.converteFahrenheit(tem.getTemperatura());
		float converteCels = Temperatura.converteCelsius(tem.getTemperatura());
		
		if(tem.getUnidade_origem().equals("Celsius")) {
			System.out.println("Temperatura convertida para Fahrenheit: "+converteFah);
		}else if(tem.getUnidade_origem().equals("Fahrenheit")) {
			System.out.println("Temperatura convertida para Celsius: "+converteCels);
		}else {
			System.out.println("Unidade invalida");
		}
		
		sc.close();
	}

}
