package br.dev.laura.tarefas.model;

public class Funcionario {
	private String nome;
	private int matricula;
	private String cargo;

	// método construtor
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	// Construtor padrão (Default)
	public Funcionario () {
		
	}
	

	public Funcionario(String nome, String cargo) {
		this.cargo = cargo;
		this.nome = nome;

	}

	public Funcionario(String nome, String cargo, int matricula) {
		this.cargo = cargo;
		this.nome = nome;
		this.matricula = matricula;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		String funcionario = matricula +","+ nome + "," + cargo + "\n";
		return funcionario;
	}

}
