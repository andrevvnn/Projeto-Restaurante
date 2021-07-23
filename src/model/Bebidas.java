package model;

import java.math.BigDecimal;

public class Bebidas {
	
	private BigDecimal preco;
	private String marca;
	private String nome;
	private Boolean alcoolico;
	private String quantidadeML;
	private int quantidadeestoque;
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getAlcoolico() {
		return alcoolico;
	}
	public void setAlcoolico(Boolean alcoolico) {
		this.alcoolico = alcoolico;
	}
	public String getQuantidadeML() {
		return quantidadeML;
	}
	public void setQuantidadeML(String quantidadeML) {
		this.quantidadeML = quantidadeML;
	}
	public int getQuantidadeestoque() {
		return quantidadeestoque;
	}
	public void setQuantidadeestoque(int quantidadeestoque) {
		this.quantidadeestoque = quantidadeestoque;
	}
}
