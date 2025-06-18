package br.dev.laura.tarefas.factory;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileFactory {

	private String arquivo = "C:\\Users\\Laura\\tarefas\\funcionarios2.csv";

	private FileWriter fw;
	private BufferedWriter bw;

	private FileReader fr;
	private BufferedReader br;

	public FileFactory() throws IOException {
		// importante para gravar no arquivo
		fw = new FileWriter(arquivo, true);
		bw = new BufferedWriter(fw);

		// importante para ler no arquivo
		fr = new FileReader(arquivo);
		br = new BufferedReader(fr);
	}

	public BufferedWriter getBufferedWriter() {
		return bw;
	}

	public BufferedReader getBufferedReader() {
		return br;
	}
}
