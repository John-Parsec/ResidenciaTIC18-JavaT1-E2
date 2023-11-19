package temperatura;

public class Temperatura {
	private float temperatura;
	private String unidade_origem;
	
	public Temperatura(float temperatura, String unidade_origem) {
		super();
		this.temperatura = temperatura;
		this.unidade_origem = unidade_origem;
	}

	public Temperatura() {
		super();
		
	}
	
	public float getTemperatura() {
		return temperatura;
	}

	public String getUnidade_origem() {
		return unidade_origem;
	}

	public void setUnidade_origem(String unidade_origem) {
		this.unidade_origem = unidade_origem;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public static float converteFahrenheit(float temperatura) {
		float F = (temperatura * 1.8f) + 32;
		
		return F;
	}
	
	public static float converteCelsius(float temperatura) {
		float C = (temperatura -32) / 1.8f;
		
		return C;
	
	}

}
