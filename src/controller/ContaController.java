package controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Bebidas;
import model.Lanches;
import model.Pratos;

public class ContaController {
	
	
	/*	2 pratos de 15,00
	 *  1 prato de 17,70
	 *  1 refrigerante de 5,50
	 *  1 suco 12,00
	 *  2 sobremesas 5,00 e 17,20
	 *
	 * 
	 * */
	public static void main(String[] args) {
		//suco de 12
		//refri de 5.5
		
		ContaController conta = new ContaController();

		List<Bebidas> listaBebidas = new ArrayList<Bebidas>();
		List<Lanches> listaLanches = new ArrayList<Lanches>();
		List<Pratos> listaPratos = new ArrayList<Pratos>();
		
		
		Bebidas bebida = new Bebidas();
		bebida.setNome("guarana antartica");
		bebida.setMarca("guarana");
		bebida.setAlcoolico(false);
		bebida.setPreco(new BigDecimal("5.50"));
		bebida.setQuantidadeestoque(150);
		bebida.setQuantidadeML("350 ml");
		
		Bebidas bebida1 = new Bebidas();
		bebida1.setNome("Suco de laranja");
		bebida1.setAlcoolico(false);
		bebida1.setPreco(new BigDecimal("12.00"));
		bebida1.setQuantidadeestoque(30);
		bebida1.setQuantidadeML("1L");
		
		listaBebidas.add(bebida);
		listaBebidas.add(bebida1);
		
		Lanches lanche = new Lanches();
		lanche.setNome("Bauru");
		lanche.setQuantidade(1);
		lanche.setPreco(new BigDecimal("17.70"));
		
		listaLanches.add(lanche);
		
		Pratos prato = new Pratos();
		prato.setNome("Macarronada");
		prato.setQuantidade(1);
		prato.setQuantidadeemestoque(10);
		prato.setPreco(new BigDecimal("15.00"));
		prato.setTipo("Massa");
		
		Pratos prato1 = new Pratos();
		prato1.setNome("Bife Acebolado");
		prato1.setQuantidade(1);
		prato1.setQuantidadeemestoque(13);
		prato1.setPreco(new BigDecimal("18.50"));
		
		listaPratos.add(prato);
		listaPratos.add(prato1);
	
		
		BigDecimal valorTotal = new BigDecimal(0);
		
		valorTotal = valorTotal
				.add(conta.retornaValorTotalDaListaDeBebidas(listaBebidas))
				.add(conta.retornaValorTotalDaListaDeLanches(listaLanches))
				.add(conta.retornaValorTotalDaListaDePratos(listaPratos));
		
		System.out.println("Valor Total da conta : R$" + valorTotal);
		
	}
	
	
	
	public BigDecimal retornaValorTotalDaListaDePratos (List<Pratos>listaPratos) {
		
		BigDecimal somaPratos = new BigDecimal(0);
		BigDecimal pratosresultado = new BigDecimal(0);
		for (int i = 0; i < listaPratos.size(); i++) {
			somaPratos = listaPratos.get(i).getPreco();
			
			pratosresultado = pratosresultado.add(somaPratos);
		}
		return pratosresultado;
	}
	
	public BigDecimal retornaValorTotalDaListaDeLanches (List<Lanches>listaLanches) {
		
		BigDecimal somaLanches = new BigDecimal(0);
		BigDecimal lancheresultado = new BigDecimal(0);
		
		for (int i = 0; i < listaLanches.size(); i++) {
			somaLanches = listaLanches.get(i).getPreco();
			
			lancheresultado = lancheresultado.add(somaLanches);
		}
		return lancheresultado;
	}

	public BigDecimal retornaValorTotalDaListaDeBebidas (List<Bebidas>listaBebidas ) {
		
		BigDecimal somaBebidas = new BigDecimal(0);
		BigDecimal bebidasresultado = new BigDecimal(0);
		
		for (int i = 0; i < listaBebidas.size(); i++) {
			somaBebidas = listaBebidas.get(i).getPreco();
			
			bebidasresultado = bebidasresultado.add(somaBebidas);
			
		}
		return bebidasresultado;
		
	}
}
