package uninter;

public class Euro extends Moeda {

	@Override
	public String toString() {
		return "Euro [valor=" + valor + ", converter()=" + converter() + "]";
	}

	public Euro(double valor) {
		super(valor);
	}
	
	@Override
	public void info() {
		System.out.println("Euro: € " + valor);
	}

	@Override
	public double converter() {
			return this.valor * 6.25; //Método de conversão para o Euro
	}
}
