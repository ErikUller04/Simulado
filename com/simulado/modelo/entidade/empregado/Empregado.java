package com.simulado.modelo.entidade.empregado;

import com.simulado.modelo.entidade.departamento.Departamento;

public class Empregado {

	private String nome;
	private String cpf;
	private int ctps;
	private Departamento departamento;
	
	public Empregado (String nome, String cpf, String ctps) {
		setNome(nome);
		setCpf(cpf);
		setCtps(getCtps());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getCtps() {
		return ctps;
	}
	public void setCtps(int ctps) {
		this.ctps = ctps;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
