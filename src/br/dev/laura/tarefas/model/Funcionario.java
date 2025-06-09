package br.dev.laura.tarefas.model;

import br.dev.laura.tarefas.utils.Utills;

public class Funcionario {
	private String nome;
	private String matricula;
	private String cargo;
	private double salario;

	// método construtor
	public Funcionario(String nome) {
		this.nome = nome;
		this.matricula = Utills.gerarUUID8();
	}

	// Construtor padrão (Default)
	public Funcionario() {
		this.matricula = Utills.gerarUUID8();
	}

	public Funcionario(String nome, String cargo) {
		this.cargo = cargo;
		this.nome = nome;
		this.matricula = Utills.gerarUUID8();

	}

	public Funcionario(String nome, String cargo, double salario) {
		this.cargo = cargo;
		this.nome = nome;
		this.matricula = Utills.gerarUUID8();
		this.salario = salario;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Quem gera a matrícula é o set e não o get
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = Utills.gerarUUID8();

	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		String funcionario = matricula + "," + nome + "," + cargo + "," + salario + "\n";
		return funcionario;
	}

}
