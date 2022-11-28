package com.gian.mvc;
import java.util.ArrayList;
import java.util.List;

public class Resultado extends Votantes {
	private int soma;

	private List<Votantes> lista = new ArrayList<Votantes>();;
	


	public Resultado(String nome, int idade, char sexo, String cpf) {
		super(nome, idade, sexo, cpf);

	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public List<Votantes> getLista() {
		return lista;
	}

	public void setLista(List<Votantes> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Resultado [soma=");
		builder.append(soma);
		builder.append(", lista=");
		builder.append(lista);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
} 
