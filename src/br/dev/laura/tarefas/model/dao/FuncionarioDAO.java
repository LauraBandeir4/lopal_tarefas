package br.dev.laura.tarefas.model.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


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
	
	public List<Funcionario> Listar() {

		//Array é o mesmo que variedade
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		try {
			FileFactory ff = new FileFactory();

			BufferedReader br = ff.getbufferedReader();

			String linha = "";

			System.out.println("Começando a iteração...");

			br.readLine();

			while (linha != null) {

				linha = br.readLine();
				System.out.println(linha);

				if (linha != null) {

					String funcionarioStr[] = linha.split(",");

					Funcionario funcionario = new Funcionario();
					funcionario.setMatricula(funcionarioStr[0]);
					funcionario.setNome(funcionarioStr[1]);
					funcionario.setCargo(funcionarioStr[2]);
					funcionario.setSalario(Double.parseDouble(funcionarioStr[3]));

					funcionarios.add(funcionario);
				}

			}

			return funcionarios;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
}
