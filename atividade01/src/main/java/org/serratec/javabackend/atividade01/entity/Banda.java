package org.serratec.javabackend.atividade01.entity;

public class Banda {
			
		private Integer id;
		private String nomeBanda;
		private String genero;
		
		public Banda() {}

		public Banda(Integer id, String nomeBanda, String genero) {
			super();
			this.id = id;
			this.nomeBanda = nomeBanda;
			this.genero = genero;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNomeBanda() {
			return nomeBanda;
		}

		public void setNomeBanda(String nomeBanda) {
			this.nomeBanda = nomeBanda;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		
		
		

}
