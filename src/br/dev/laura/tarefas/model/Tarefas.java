package br.dev.laura.tarefas.model;

public class Tarefas {

		private String titulo;
		private String descricao;
		private String dataInicial;
		private String prazo;
		private String dataConclusao;
		private String status;
		private String responsavel;
		
	
		
		public Tarefas(String titulo, String descricao, String dataInicial, String prazo, String dataConclusao, String status, String responsavel ) {
			this.titulo = titulo;
			this.dataInicial = dataInicial;
			this.prazo = prazo;
			this.dataConclusao = dataConclusao;
			this.status= status;
			this.responsavel = responsavel;
		}
		
	
		public Tarefas (String titulo) {
			this.titulo = titulo;
			
			}
		public Tarefas(String titulo, String descricao) {
			this.descricao = descricao;
			this.titulo = titulo;
			

		}
		


		public Tarefas(String titulo, String descricao, String dataInicial) {
			this.titulo = titulo;
			this.descricao = descricao;
			this.dataInicial = dataInicial;

		}
		
		public Tarefas(String titulo, String descricao, String dataInicial,  String prazo) {
			this.titulo = titulo;
			this.descricao = descricao;
			this.dataInicial = dataInicial;
			this.prazo = prazo;

		}
		public Tarefas(String titulo, String descricao, String dataInicial,  String prazo, String dataConclusao) {
			this.titulo = titulo;
			this.descricao = descricao;
			this.dataInicial= dataInicial;
			this.prazo = prazo;
			this.dataConclusao = dataConclusao;
			

		}
		public Tarefas(String titulo, String descricao, String dataInicial,  String prazo, String dataConclusao, String status) {
			this.titulo = titulo;
			this.descricao = descricao;
			this.dataInicial= dataInicial;
			this.prazo = prazo;
			this.dataConclusao = dataConclusao;
			this.status = status;
			

		}
		
		
		public String getTitulo() {
			return titulo;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
	
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getDataInicial() {
			return dataInicial;
		}
		public void setDataInicial(String dataInicial) {
			this.dataInicial = dataInicial;
		}
		public String getPrazo() {
			return prazo;
		}
		public void setPrazo(String prazo) {
			this.prazo = prazo;
		}
		public String getDataConclusao() {
			return dataConclusao;
		}
		public void setDataConclusao(String dataConclusao) {
			this.dataConclusao = dataConclusao;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getResponsavel() {
			return responsavel;
		}
		public void setResponsavel(String responsavel) {
			this.responsavel = responsavel;
		}
		public void add(Tarefas tarefas) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public String toString() {

			String tarefas = titulo + ", " + descricao + ", " + dataInicial  + ", " + prazo + ", " + dataConclusao + "," + status + "," + responsavel + "\n";
			return tarefas;

		}

}
