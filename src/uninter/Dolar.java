package uninter;

public class Dolar extends Moeda {
	
	@Override
	public String toString() {
		return "Dolar [valor=" + valor + ", converter()=" + converter() + "]";
	}

	public Dolar (double valor) {
		super (valor);
	}
	
	@Override
	public void info() {
		System.out.println("Dolar: US$ " + valor);
	}

	@Override
	public double converter() {
			return this.valor * 5.74; //Método de conversão para o Dólar
	}
}
