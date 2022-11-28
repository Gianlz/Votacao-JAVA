package com.gian.mvc;

import java.util.Date;

public class Votantes extends Pessoas {
	private int votoFem;
	private int votoMasc;
	


	public Votantes(String nome, int idade, char sexo, String cpf) {


	}

	public int getVotoFem() {
		return votoFem;
	}

	public void setVotoFem(int votoFem) {
		this.votoFem = votoFem;
	}

	public int getVotoMasc() {
		return votoMasc;
	}

	public void setVotoMasc(int votoMasc) {
		this.votoMasc = votoMasc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Votantes [votoFem=");
		builder.append(votoFem);
		builder.append(", votoMasc=");
		builder.append(votoMasc);
		builder.append("]");
		return builder.toString();
	}
	
	
}
