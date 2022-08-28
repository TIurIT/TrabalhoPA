package Eleições2022;

public class Pesquisa {

	public String instituicao;
	public String data;
	public String local;
	public int mediaIdade;
	public String formato;
	public TipoDePesquisa tipo;
	
	public Pesquisa(String inst, String data , String local, int mediaIdade, String form, TipoDePesquisa tipo) {
		this.instituicao = inst;
		this.data = data ;
		this.local = local;
		this.mediaIdade = mediaIdade ;
		this.formato = form;
		this.tipo = tipo;
	}
	
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String inst) {
		this.instituicao = inst;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getMediaIdade() {
		return mediaIdade;
	}
	public void setMediaIdade(int mediaIdade) {
		this.mediaIdade = mediaIdade;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String form) {
		this.formato = form;
	}
	public TipoDePesquisa getTipo() {
		return tipo;
	}
	public void setTipo(TipoDePesquisa tipo) {
		this.tipo = tipo;
	}
	
	
	public void status() {
		System.out.println("Informações da Pesquisa:");
		System.out.println("Instituição: " + this.instituicao);
		System.out.println("Data: " + this.data);
		System.out.println("Local: "  + this.local);
		System.out.println("Média de Idade: "  + this.mediaIdade);
		System.out.println("Formato: "  + this.formato);
		System.out.println("Tipo: "  + this.tipo);
	}
}
