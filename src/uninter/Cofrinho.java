package uninter;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	
	private List<Moeda> listaMoedas = new ArrayList<>();

	
	public void adicionar(Moeda moeda) { //Metodo para adicionar moedas
		listaMoedas.add(moeda);
		System.out.println("MOEDA ADICIONADA");
	}
	public void remover(int indice) { //Metodo para remover moedas
		if(indice >= 1 && indice <= listaMoedas.size()) {
			listaMoedas.remove(indice - 1);
			System.out.println("MOEDA REMOVIDA");
		}
		else {
			System.out.println("ERRO AO REMOVER MOEDA");
		}
	}
	public void listarMoedas() { //Metodo para listar todas as moedas
		if(listaMoedas.isEmpty()) {
			System.out.println("O COFRINHO ESTA VAZIO");
			return;
		}
		int i = 1;
		for(Moeda moeda : listaMoedas) {
			System.out.print(i + " - ");
			moeda.info();
			i++;
		}
	}
	public double totalConvertido() { //Metodo para calcular o total convertido em reais
		return listaMoedas.stream().mapToDouble(Moeda::converter).sum();
		}
}
