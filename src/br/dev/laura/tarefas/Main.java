package br.dev.laura.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.dev.laura.tarefas.model.Funcionario;

public class Main {

	private static String path = "c:\\Users\\25132517\\ProjetoTarefas\\tarefas.txt";

	public static void main(String[] args) {
		

		Funcionario funcionario1 = new Funcionario("Maria da Silva");
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.setMatricula(9);
		funcionario2.setNome("Patricia Gomes");
		funcionario2.setCargo("Gerente de TI");
		
		Funcionario funcionario3 = new Funcionario("Promagador" , "Ana Maria");
		Funcionario funcionario4 = new Funcionario("Promagador" , "Pedro", 2);
		
	 System.out.println(funcionario1);
	 System.out.println(funcionario2);
	 System.out.println(funcionario3);
	 System.out.println(funcionario4);
	 

	

	}

	private static void gravarArquivo() {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(path, true);
			bw = new BufferedWriter(fw);

			String novaLinha = "Isso é uma nova linha!!\n";
			String novaLinha4 = "Senai de Jandira!\n";
			String novaLinha5 = "Turma DS1TB!\n";
			
			

			bw.write(novaLinha);
			bw.write(novaLinha4);
			bw.write(novaLinha5);
			
			bw.flush();

		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

	}

	private static void lerArquivo() {
		String path = "c:\\Users\\25132517\\ProjetoTarefas\\tarefas.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String linha = br.readLine();

			while (linha != null) {
				String registro[] = linha.split(";");
				System.out.println("Nome: " + registro[0]);
				System.out.println("Tarefa: " + registro[1]);
				System.out.println("--------------------------");
				linha = br.readLine();
			}

		} catch (FileNotFoundException erro) {
			System.out.println(erro.getMessage());
		} catch (IOException erro) {
			System.out.println(erro.getMessage());
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	}

}
