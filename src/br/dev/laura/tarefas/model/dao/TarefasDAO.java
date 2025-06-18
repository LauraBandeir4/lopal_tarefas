package br.dev.laura.tarefas.model.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.laura.tarefas.factory.FileFactory;
import br.dev.laura.tarefas.model.Funcionario;
import br.dev.laura.tarefas.model.TarefasCadastro;

public class TarefasDAO {
	private TarefasCadastro tarefas;

	// construtor que nao recebe nada
	public TarefasDAO() {

	}

	// construtor que recebe Tarefas
	public TarefasDAO(TarefasCadastro tarefas) {
		this.tarefas = tarefas;
	}

	// Método gravar
	public void gravar() {

		try {
			FileFactory ff = new FileFactory();
			ff.getBufferedWriter().write(tarefas.toString());
			ff.getBufferedWriter().flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Tarefas> Listar() {

		// Array é o mesmo que variedade

		List<Tarefas> tarefas = new ArrayList<Tarefas>();

		try {
			FileFactory ff = new FileFactory();

			BufferedReader br2 = ff.getBufferedReader();

			String linha = "";

			// System.out.println("Começando a interação...");

			br2.readLine();

			while (linha != null) {

				linha = br2.readLine();
				//System.out.println(linha);

				if (linha != null) {

					String funcionarioStr[] = linha.split(",");

					Tarefas tarefas = new Tarefas();
					tarefas.setTittulo(tarefas[0]);
					tarefas.setDescricao(tarefas[1]);
					tarefas.setDataInicial(tarefas[2]);
					tarefas.setPrazo(tarefas[3]);
					tarefas.setDataConclusao(tarefas[4]);
					tarefas.setResponsavel(tarefas[5]);
					tarefas.setStaus(tarefas[6]);
					
				
					

					tarefas.add(tarefas);
				}

			}

			return tarefas;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	
}
