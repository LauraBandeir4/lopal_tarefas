package br.dev.laura.tarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.sql.rowset.RowSetFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.dev.laura.tarefas.model.Funcionario;
import br.dev.laura.tarefas.model.dao.FuncionarioDAO;

public class FrameFuncionarioList {
	private JLabel labelTitulo;
	private JButton btnCadastro;
	private JButton btnVoltar;

	private JTable tabelaFuncionarios;
	private JScrollPane scrollFuncionarios;
	private DefaultTableModel modelFuncionario;
	private String[] colunas = { "CÓDIGO", "NOME", "CARGO" };

	public FrameFuncionarioList(JFrame frame) {
		criarTela(frame);
	}

	public void criarTela(JFrame frame) {

		JDialog tela = new JDialog(frame, true);
		tela.setSize(500, 500);
		tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setTitle("Listar Funcionários");
		tela.setResizable(false);

		Container painel = tela.getContentPane();

		labelTitulo = new JLabel("Cadastro de Funcionários");
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		labelTitulo.setForeground(Color.RED);
		labelTitulo.setBounds(10, 10, 400, 40);

		modelFuncionario = new DefaultTableModel(colunas, 5) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tabelaFuncionarios = new JTable(modelFuncionario);
		tabelaFuncionarios.getTableHeader().setReorderingAllowed(false);
		scrollFuncionarios = new JScrollPane(tabelaFuncionarios);
		scrollFuncionarios.setBounds(10, 60, 470, 300);
		
		carregarDados();
		
		//Criando botão cadastro
		
		btnCadastro = new JButton("Cadastro");
		btnCadastro.setBounds(10, 380, 200, 40);
		
		// Adicionando um Action Listener
		btnCadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new FrameFuncionario(tela);
				carregarDados();
				
			}
			
		});
		
		//Criando botão Voltar
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(240, 380, 200, 40);
		
		// Adicionando um Action Listener
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tela.dispose();
				carregarDados();
				
			}
			
			
		});
		

		painel.add(labelTitulo);
		painel.add(scrollFuncionarios);
		painel.add(btnCadastro);
		painel.add(btnVoltar);

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


