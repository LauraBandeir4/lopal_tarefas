package br.dev.laura.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.dev.laura.tarefas.model.Funcionario;
import br.dev.laura.tarefas.model.dao.FuncionarioDAO;
import br.dev.laura.tarefas.ui.FrameFuncionario;
import br.dev.laura.tarefas.ui.FrameFuncionarioList;
import br.dev.laura.tarefas.ui.FrameGerenciador;

public class Main {

	private static String path = "c:\\Users\\25132517\\ProjetoTarefas\\tarefas.txt";

	public static void main(String[] args) {

		// new FrameFuncionario();
		new FrameGerenciador();

//		FuncionarioDAO dao = new FuncionarioDAO();
//		dao.Listar();
//
//		List<Funcionario> funcionarios = dao.Listar();
//
//		for (Funcionario f : funcionarios) {
//
//			System.out.println(f.getNome());
//			System.out.println(f.getCargo());
//			System.out.println("----------");
//		}

		// Funcionario f = new Funcionario();
		// f.setNome("Paulo Gomes");
		// f.setCargo("Programador Júnior");
		// f.setSalario(1989.73);

		// FuncionarioDAO dao = new FuncionarioDAO(f);
		// dao.gravar();

	}

	// Manipulando arquivos e diretórios
//	private static void gravarArquivo() {
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//
//		try {
//			fw = new FileWriter(path, true);
//			bw = new BufferedWriter(fw);
//
//			String novaLinha = "Isso é uma nova linha!!\n";
//			String novaLinha4 = "Senai de Jandira!\n";
//			String novaLinha5 = "Turma DS1TB!\n";
//
//			bw.write(novaLinha);
//			bw.write(novaLinha4);
//			bw.write(novaLinha5);
//
//			bw.flush();
//
//		} catch (Exception erro) {
//			System.out.println(erro.getMessage());
//		}

//	}
//
//	private static void lerArquivo() {
//		String path = "c:\\Users\\25132517\\ProjetoTarefas\\tarefas.txt";
//		FileReader fr = null;
//		BufferedReader br = null;
//
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//
//			String linha = br.readLine();
//
//			while (linha != null) {
//				String registro[] = linha.split(";");
//				System.out.println("Nome: " + registro[0]);
//				System.out.println("Tarefa: " + registro[1]);
//				System.out.println("--------------------------");
//				linha = br.readLine();
//			}
//
//		} catch (FileNotFoundException erro) {
//			System.out.println(erro.getMessage());
//		} catch (IOException erro) {
//			System.out.println(erro.getMessage());
//		} catch (Exception erro) {
//			System.out.println(erro.getMessage());
//		}
//	}

}
