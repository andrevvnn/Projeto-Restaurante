package model;

import java.math.BigDecimal;

public class Sobremesa {

	private BigDecimal valor;
	private String marca;
	private String nome;
	private String quantidadeML;
	private int quantidadeEstoque;

	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
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
	public String getQuantidadeML() {
		return quantidadeML;
	}
	public void setQuantidadeML(String quantidadeML) {
		this.quantidadeML = quantidadeML;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

}
