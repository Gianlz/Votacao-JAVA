package com.gian.mvc;
import java.util.Date;

public class Pessoas {
	private String nome;
	private int idade;
	private char sexo;
	private String cpf;
	private Date data;
	
	
	
	
	
	public Pessoas() {// Date data) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		try {
		if ((this.nome).length() > 45){
			System.out.println("Nome maior que o permitido, Contate o ADM");
		}
		else {
			this.nome = nome;
		}}catch(Exception e){
			
		}
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome = ");
		builder.append(nome);
		builder.append(" Idade = ");
		builder.append(idade);
		builder.append(" Sexo = ");
		builder.append(sexo);
		builder.append(" Cpf = ");
		builder.append(cpf);
		//builder.append(" Data = ");
		//builder.append(data);
		return builder.toString();
	}
	
	
}
