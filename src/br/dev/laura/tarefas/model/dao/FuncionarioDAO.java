package br.dev.laura.tarefas.model.dao;

import java.io.IOException;

import br.dev.laura.tarefas.factory.FileFactory;
import br.dev.laura.tarefas.model.Funcionario;

public class FuncionarioDAO {

	private Funcionario funcionario;

	// construtor que nao recebe nada
	public FuncionarioDAO() {

	}

	// construtor que recebe funcionário
	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	// Método gravar
	public void gravar() {

		try {
			FileFactory ff = new FileFactory();
			ff.getBufferedWriter().write(funcionario.toString());
			ff.getBufferedWriter().flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
