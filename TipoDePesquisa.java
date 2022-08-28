package Eleições2022;

public class TipoDePesquisa {

	public String tipo;
	
	public String getDescricao() {
		return tipo;
}
	public void setDescricao(String descricao) {
		this.tipo = descricao;
}
	public void status() {
		System.out.println("Informações dos Métodos:");
		System.out.println("Tipo de Pesquisa: " + this.tipo);	
}

}
