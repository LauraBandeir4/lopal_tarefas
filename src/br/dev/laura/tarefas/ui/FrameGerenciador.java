package br.dev.laura.tarefas.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class FrameGerenciador {
	
	private JButton Funcionários;
	private JButton Tarefas;
	
	public FrameGerenciador (JFrame frame) {
		criarTela(frame);
	}
	
	private void criarTela(JFrame frame) {
		JDialog tela = new JDialog(frame, true);
		tela.setTitle("Gerenciador de tarefas");
		tela.setSize(400, 400);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setLocationRelativeTo(frame);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
	}
}
