package model;

import java.math.BigDecimal;

public class Pratos {
  private String nome;
  private String tipo;
  private int quantidade;
  private int quantidadeemestoque;
  private String erro;
  private BigDecimal preco;
  
public String getNome() {
	return nome;
}
public BigDecimal getPreco() {
	return preco;
}
public void setPreco(BigDecimal preco) {
	this.preco = preco;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public int getQuantidadeemestoque() {
	return quantidadeemestoque;
}
public void setQuantidadeemestoque(int quantidadeemestoque) {
	this.quantidadeemestoque = quantidadeemestoque;
}
  
}
