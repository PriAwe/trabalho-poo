package uninter;

public class Real extends Moeda {

	public Real(double valor) {
		super (valor);
	}

	@Override
	public String toString() {
		return "Real [valor=" + valor + ", converter()=" + converter() + "]";
	}

	@Override
	public void info() {
		System.out.println("Real: R$ " + valor);
	}

	@Override
	public double converter() {
			return this.valor;
	}
	
}
