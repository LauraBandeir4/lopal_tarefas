package br.dev.laura.tarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.dev.laura.tarefas.model.Funcionario;
import br.dev.laura.tarefas.model.dao.FuncionarioDAO;

public class FrameTarefasList {
	
	private JLabel labelTitulo;
	private JButton btnSalvar;
	private JButton btnSair;
    private JTable tabelaTarefas;
	private JScrollPane scrollTarefas;
	private DefaultTableModel modelTarefas;
	
	public FrameTarefasList(JFrame frame) {
		criarTela(frame);
	}

	public void criarTela(JFrame frame) {

		JDialog tela = new JDialog(frame, true);
		tela.setSize(500, 500);
		tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setTitle("Listar Tarefas");
		tela.setResizable(false);

		Container painel = tela.getContentPane();

		labelTitulo = new JLabel("Cadastro de Funcionários");
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		labelTitulo.setForeground(Color.RED);
		labelTitulo.setBounds(10, 10, 400, 40);

	
		tabelaTarefas = new JTable(modelTarefas);
		tabelaTarefas.getTableHeader().setReorderingAllowed(false);
		scrollTarefas = new JScrollPane(tabelaTarefas);
		scrollTarefas.setBounds(10, 60, 470, 300);
		
		carregarDados();
		
		//Criando botão salvar tarefa 
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 380, 200, 40);
		
		// Adicionando um Action Listener
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new FrameFuncionario(tela);
				carregarDados();
				
			}
			
		});
		
		//Criando botão Sair
		btnSair = new JButton("Sair");
		btnSair.setBounds(240, 380, 200, 40);
		
		// Adicionando um Action Listener
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tela.dispose();
				carregarDados();
				
			}
			
			
		});
		

		painel.add(labelTitulo);
		painel.add(scrollTarefas);
		painel.add(btnSalvar);
		painel.add(btnSair);

		tela.setVisible(true);

	}
	
	
	
	private void carregarDados() {
		FuncionarioDAO dao = new FuncionarioDAO();
		List<Funcionario> funcionarios = dao.Listar();
		
		Object[][] dados = new Object[funcionarios.size()][3];
		
		int i = 0;
		for (Funcionario f : funcionarios) {
			dados[i][0] = f.getMatricula();
			dados[i][1] = f.getNome();
			dados[i][2] = f.getCargo();
			i++;
		}
		
		modelFuncionario.setDataVector(dados, colunas);
		
		
	}

}
