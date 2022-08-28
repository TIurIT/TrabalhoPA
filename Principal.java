package Eleições2022;

public class Principal {
	
	public static void main(String[] args) {
		
		Candidato C1 = new Candidato("Lula", "PT", "Não");
		Candidato C2 = new Candidato("Bolsonaro","PL", "SIM");

//		C2.status();
//		C1.status();
		
		TipoDePesquisa TP1 = new TipoDePesquisa();
		TP1.setDescricao("Induzida");
		TipoDePesquisa TP2 = new TipoDePesquisa();
		TP2.setDescricao("Livre");
		
//		MP1.status();
//		MP2.status();
		
		Pesquisa P1 = new Pesquisa("Data Folha", "M/07", "SP", 30, "Telefone", TP1);
		P1.status();
		
	
	}		
	
	
	
}
