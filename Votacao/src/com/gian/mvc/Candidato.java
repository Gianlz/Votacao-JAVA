package com.gian.mvc;

public class Candidato {
	private String cand;

	public String getCand() {
		return cand;
	}

	public void setCand(String cand) {
		this.cand = cand;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidato [cand=");
		builder.append(cand);
		builder.append("]");
		return builder.toString();
	}
	
	
}
