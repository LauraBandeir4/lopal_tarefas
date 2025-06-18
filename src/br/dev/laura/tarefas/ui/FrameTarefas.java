package br.dev.laura.tarefas.ui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTarefas {
	
	private JLabel labelTitulo;
	private JLabel labelTDescrcao;
	private JLabel labelDInicial;
	private JLabel labelPrazo;
	private JLabel labelDConclusao;
	private JLabel labelStatus;
	private JLabel labelResponsavel;
	private JButton btnSalvar;
	private JButton btnSair;
	
	public FrameTarefas(JDialog frame) {
		criarTela(frame);
	}

	private void criarTela(JDialog frame) {
		JDialog tela = new JDialog(frame, true);
		tela.setTitle("Cadastro Tarefas");
		tela.setSize(400, 400);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setLocationRelativeTo(frame);
		tela.setLayout(null);

		
	}
	

}
