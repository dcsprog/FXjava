package model;

public class Article {

	private String nome;
	private double preco;
	private String desc;
	
	public Article(String nome, double preco, String desc) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desc = desc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
}
