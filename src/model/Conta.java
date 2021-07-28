package model;

import java.math.BigDecimal;

public class Conta {
	
	private int numeroDaMesa;
	private BigDecimal valorDaConta;
	private int formaDePagamento;
	
	public int getNumeroDaMesa() {
		return numeroDaMesa;
	}
	public void setNumeroDaMesa(int numeroDaMesa) {
		this.numeroDaMesa = numeroDaMesa;
	}
	public BigDecimal getValorDaConta() {
		return valorDaConta;
	}
	public void setValorDaConta(BigDecimal valorDaConta) {
		this.valorDaConta = valorDaConta;
	}
	public int getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(int formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
}
