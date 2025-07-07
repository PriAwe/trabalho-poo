package uninter;

public abstract class Moeda {
	double valor;
	
	public Moeda(double valor) { //Construtor da classe moeda
		super ();
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Moeda other = (Moeda) obj;
		return Double.compare(this.valor, other.valor) == 0;
	}

	@Override
	public String toString() {
		return "Moeda [valor=" + valor + ", converter()=" + converter() + ", getValor()=" + getValor() + "]";
	}

	public abstract void info();
	public abstract double converter(); //Metodo para converter o valor da moeda
	
	public void reduzirValor(double montante) { //Metodo para reduzir o valor da moeda escolhida 
		if (montante >= valor) {
			valor = 0;
		}
		else {
			valor -= montante;
		}
	}

	public double getValor() { //Método para pegar o valor da moeda escolhida
		return valor;
	}
}
