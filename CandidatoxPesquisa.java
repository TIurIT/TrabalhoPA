package Eleições2022;

public class CandidatoxPesquisa {
	
	public Candidato candidato;
	public Pesquisa pesquisa;
	public int votos;
	
	public CandidatoxPesquisa(Candidato candidato, Pesquisa pesquisa, int votos) {
		this.candidato = candidato;
		this.pesquisa = pesquisa;
		this.votos = votos;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
}
