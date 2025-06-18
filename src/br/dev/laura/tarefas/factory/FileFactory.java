package br.dev.laura.tarefas.factory;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileFactory {

	private String arquivo = "C:\\Users\\Laura\\tarefas\\funcionarios2.csv";
	private String arquivo2 = "C:\\Users\\Laura\\tarefas\\tarefas.csv";

	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	
	// Fazendo um FileReader e um BufferedWritter para tarefas
	private FileWriter fw2;
	private BufferedWriter bw2;
	private FileReader fr2;
	private BufferedReader br2;

	
  
	
	public FileFactory() throws IOException {
		// importante para gravar no arquivo
		fw = new FileWriter(arquivo, true);
		bw = new BufferedWriter(fw);

		// importante para ler no arquivo
		fr = new FileReader(arquivo);
		br = new BufferedReader(fr);
		
		// importante para gravar no arquivo
		fw2 = new FileWriter(arquivo, true);
		bw2 = new BufferedWriter(fw2);

		// importante para ler no arquivo
		fr2 = new FileReader(arquivo);
		br2 = new BufferedReader(fr2);
	}

	public BufferedWriter getBufferedWriter() {
		return bw;
	}

	public BufferedReader getBufferedReader() {
		return br;
	}
	
	public BufferedWriter getBufferedWriter2() {
		return bw2;
	}

	public BufferedReader getBufferedReader2() {
		return br2;
	}
}
