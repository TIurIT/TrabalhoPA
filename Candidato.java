package Eleições2022;

public class Candidato {
	
	public String nome;
	public String partido;
	private String fichaLimpa;
	
	public Candidato(String nomeDoCandidato, String partidoDoCandidato, String fichaDoCandidato) {
		this.nome = nomeDoCandidato;
		this.partido = partidoDoCandidato;
		this.fichaLimpa = fichaDoCandidato;
	}
		
		public String getNome() {
			return nome;
	}
		public void setNome(String nomeDoCandidato) {
			this.nome = nomeDoCandidato;
	}
		public String getPartido() {
			return partido;
	}
		public void setPartido(String partidoDoCandidato) {
			this.partido = partidoDoCandidato;
	}
		public String getFichaLimpa() {
			return fichaLimpa;
	}
		public void setFichaLimpa(String fichaDoCandidato) {
			this.fichaLimpa = fichaDoCandidato;
	}
		public void status() {
			System.out.println("Informações do Candidato:");
			System.out.println("Nome: " + this.nome);
			System.out.println("Partido: " + this.partido);
			System.out.println("Ficha Limpa: "  + this.fichaLimpa);
		}
		
}
