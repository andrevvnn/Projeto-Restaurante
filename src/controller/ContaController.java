package controller;

import java.math.BigDecimal;
import java.util.List;

import inicializacao.CardapioInicializao;
import model.Bebidas;
import model.Lanches;
import model.Pratos;
import model.Sobremesa;

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
		CardapioInicializao cardapioInicializao = new CardapioInicializao();
		
		
		List<Bebidas> listaBebidas = cardapioInicializao.retornaListaBebidas();
		List<Lanches> listaLanches = cardapioInicializao.retornaListaLanches();
		List<Pratos> listaPratos = cardapioInicializao.retornaListaPratos();
		List<Sobremesa> listaSobremesas = cardapioInicializao.retornaListaSobremesa();
		
		
			
		BigDecimal valorTotal = new BigDecimal(0);
		
		valorTotal = valorTotal
				.add(conta.retornaValorTotalDaListaDeBebidas(listaBebidas))
				.add(conta.retornaValorTotalDaListaDeLanches(listaLanches))
				.add(conta.retornaValorTotalDaListaDePratos(listaPratos))
				.add(conta.retornaValorTotalDasListasDeSobremesas(listaSobremesas));
			
		
		System.out.println("Valor Total da conta : R$" + valorTotal);

	}
	
	
	
	public BigDecimal retornaValorTotalDaListaDePratos (List<Pratos>listaPratos) {
		
		BigDecimal somaPratos = new BigDecimal(0);
		BigDecimal pratosresultado = new BigDecimal(0);
		for (int i = 0; i < listaPratos.size(); i++) {
			somaPratos = listaPratos.get(i).getPreco();
			
			pratosresultado = pratosresultado.add(somaPratos);
		}
		System.out.println(pratosresultado);
		return pratosresultado;
	}
	
	public BigDecimal retornaValorTotalDaListaDeLanches (List<Lanches>listaLanches) {
		
		BigDecimal somaLanches = new BigDecimal(0);
		BigDecimal lancheresultado = new BigDecimal(0);
		
		for (int i = 0; i < listaLanches.size(); i++) {
			somaLanches = listaLanches.get(i).getPreco();
			
			lancheresultado = lancheresultado.add(somaLanches);
		}
		System.out.println(lancheresultado);
		return lancheresultado;
	}

	public BigDecimal retornaValorTotalDaListaDeBebidas (List<Bebidas>listaBebidas ) {
		
		BigDecimal somaBebidas = new BigDecimal(0);
		BigDecimal bebidasresultado = new BigDecimal(0);
		
		for (int i = 0; i < listaBebidas.size(); i++) {
			somaBebidas = listaBebidas.get(i).getPreco();
			
			bebidasresultado = bebidasresultado.add(somaBebidas);
			
		}
		System.out.println(bebidasresultado);
		return bebidasresultado;
		
	}
	public BigDecimal retornaValorTotalDasListasDeSobremesas (List<Sobremesa>listaSobremesas) {
		
		BigDecimal somaSobremesas = new BigDecimal(0);
		BigDecimal
		sobremesasResultado = new BigDecimal(0);
		
		for (int i = 0; i < listaSobremesas.size(); i++) {
			somaSobremesas = listaSobremesas.get(i).getValor();
			
			sobremesasResultado = somaSobremesas.add(sobremesasResultado);		
			
		}
		System.out.println(sobremesasResultado);
		return sobremesasResultado;
	}
}
