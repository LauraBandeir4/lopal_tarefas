package br.dev.laura.tarefas.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTarefas {
	
	private JLabel labelTitulo;
	private JLabel labelTDescricao;
	private JLabel labelDInicial;
	private JLabel labelPrazo;
	private JLabel labelDConclusao;
	private JLabel labelStatus;
	private JLabel labelResponsavel;
	private JTextField txtTitulo;
	private JTextField txtDescricao;
	private JTextField txtTDInicial;
	private JTextField txtPrazo;
	private JTextField txtConclusao;
	private JTextField txtResponsavel;
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
		
		Container painel = tela.getContentPane();

		labelTitulo = new JLabel("Título");
		labelTitulo.setBounds(10, 10, 200, 30);
		txtTitulo = new JTextField();
		txtTitulo.setBounds(10, 40, 150, 30);
		txtTitulo.setEnabled(false);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 300, 120, 50);

		btnSair = new JButton("Sair");
		btnSair.setBounds(140, 300, 80, 50);
		
	}
	

}
