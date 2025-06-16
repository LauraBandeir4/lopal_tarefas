package br.dev.laura.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FrameGerenciador {
	
	private JButton btnFuncionarios;
	private JButton btnTarefas;
	
	public FrameGerenciador () {
		criarTela();
	}
	
	private void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle("Gerenciador de tarefas");
		tela.setSize(400, 200);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
		
		btnFuncionarios = new JButton("Funcionários");
		btnFuncionarios.setBounds(50, 40, 140, 50);
		
		
		btnTarefas = new JButton("Tarefas");
		btnTarefas.setBounds(190, 40, 140, 50);
		
		
		painel.add(btnFuncionarios);
		painel.add(btnTarefas);
		
		btnFuncionarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			     
				new FrameFuncionarioList();

				
			}
		});
	
		tela.setVisible(true);
   }
}