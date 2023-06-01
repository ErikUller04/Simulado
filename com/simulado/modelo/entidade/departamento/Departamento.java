package com.simulado.modelo.entidade.departamento;

import com.simulado.modelo.entidade.empregado.Empregado;

public class Departamento {

	private String nome;
	private Empregado[] empregado;
	private int quantidadeEmpregados;
	
	public Departamento (String nome, int quantidadeEmpregados ) {
		setNome(nome);
		setEmpregado(new Empregado[quantidadeEmpregados]);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getquantidadeEmpregados() {
		return quantidadeEmpregados;
	}

	public Empregado[] getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado[] empregado) {
		this.empregado = empregado;
	}
	
	
	
	
	
}
