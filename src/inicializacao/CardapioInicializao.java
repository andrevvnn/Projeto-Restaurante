package inicializacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.Bebidas;
import model.Lanches;
import model.Pratos;
import model.Sobremesa;

public class CardapioInicializao {
	
	
	public List<Bebidas> retornaListaBebidas (){
		
		List<Bebidas> bebidas = new ArrayList<Bebidas>();
		
		Bebidas bebida1 = new Bebidas();
		bebida1.setNome("Coca-Cola");
		bebida1.setMarca("Coca cola");
		bebida1.setPreco(new BigDecimal("5.50"));
		bebida1.setQuantidadeestoque(150);
		bebida1.setAlcoolico(false);
		bebida1.setQuantidadeML("350ML");
		
		Bebidas bebida2 = new Bebidas();
		bebida2.setNome("Guarana");
		bebida2.setMarca("Coca cola");
		bebida2.setPreco(new BigDecimal("4.50"));
		bebida2.setQuantidadeestoque(120);
		bebida2.setAlcoolico(false);
		bebida2.setQuantidadeML("350ML");
		
		Bebidas bebida3 = new Bebidas();
		bebida3.setNome("Pepsi");
		bebida3.setMarca("Coca cola");
		bebida3.setPreco(new BigDecimal("4.50"));
		bebida3.setQuantidadeestoque(50);
		bebida3.setAlcoolico(false);
		bebida3.setQuantidadeML("350ML");

		Bebidas bebida4 = new Bebidas();
		bebida4.setNome("Cerveja Skol");
		bebida4.setMarca("Coca cola");
		bebida4.setPreco(new BigDecimal("6.50"));
		bebida4.setQuantidadeestoque(200);
		bebida4.setAlcoolico(true);
		bebida4.setQuantidadeML("350ML");

		Bebidas bebida5 = new Bebidas();
		bebida5.setNome("Henriquem");
		bebida5.setMarca("Coca cola");
		bebida5.setPreco(new BigDecimal("9.50"));
		bebida5.setQuantidadeestoque(100);
		bebida5.setAlcoolico(true);
		bebida5.setQuantidadeML("350ML");
		
		
		bebidas.add(bebida1);
		bebidas.add(bebida2);
		bebidas.add(bebida3);
		bebidas.add(bebida4);
		bebidas.add(bebida5);
		
		return bebidas;
	}
	
	public List<Lanches> retornaListaLanches (){
		
		List<Lanches> lanches = new ArrayList<Lanches>();
		
		Lanches lanche1 = new Lanches();
		lanche1.setNome("Hamburguer");
		lanche1.setPreco(new BigDecimal("9.90"));
		lanche1.setQuantidade(30);
		
		Lanches lanche2 = new Lanches();
		lanche2.setNome("Cachorrão");
		lanche2.setPreco(new BigDecimal("10.50"));
		lanche2.setQuantidade(25);
		
		Lanches lanche3 = new Lanches();
		lanche3.setNome("Misto Quente");
		lanche3.setPreco(new BigDecimal("12.30"));
		lanche3.setQuantidade(8);
		
		Lanches lanche4 = new Lanches();
		lanche4.setNome("Sanduiche Natural");
		lanche4.setPreco(new BigDecimal("14.75"));
		lanche4.setQuantidade(13);
		
		Lanches lanche5 = new Lanches();
		lanche5.setNome("Sanduíche de presunto");
		lanche5.setPreco(new BigDecimal("15.8"));
		lanche5.setQuantidade(6);
		
		lanches.add(lanche1);
		lanches.add(lanche2);
		lanches.add(lanche3);
		lanches.add(lanche4);
		lanches.add(lanche5);
				
		return lanches;
	}
	 
	public List<Pratos> retornaListaPratos () {
		
		List<Pratos> pratos = new ArrayList<Pratos>();
		
		Pratos prato1 = new Pratos();
		prato1.setNome("Macarrão a Matriciana");
		prato1.setTipo("Macarronada");
		prato1.setQuantidade(1);
		prato1.setQuantidadeEstoque(10);
		prato1.setPreco(new BigDecimal("12.50"));
		
		Pratos prato2 = new Pratos();
		prato2.setNome("Berinjela a Bolonhesa");
		prato2.setTipo("Vegetariano");
		prato2.setQuantidade(0);
		prato2.setQuantidadeEstoque(13);
		prato2.setPreco(new BigDecimal("13.86"));
		
		Pratos prato3 = new Pratos();
		prato3.setNome("Carne De Panela");
		prato3.setTipo("Carne");
		prato3.setQuantidade(0);
		prato3.setQuantidadeEstoque(22);
		prato3.setPreco(new BigDecimal("11.75"));
		
		Pratos prato4 = new Pratos();
		prato4.setNome("Risoto de Camarão");
		prato4.setTipo("Peixe");
		prato4.setQuantidade(0);
		prato4.setQuantidadeEstoque(6);
		prato4.setPreco(new BigDecimal("13.75"));
		
		Pratos prato5 = new Pratos();
		prato5.setNome("Canelone De Presunto e Queijo!");
		prato5.setTipo("Massa");
		prato5.setQuantidade(0);
		prato5.setQuantidadeEstoque(10);
		prato5.setPreco(new BigDecimal("16.50"));
		
		pratos.add(prato1);
		pratos.add(prato2);
		pratos.add(prato3);
		pratos.add(prato4);
		pratos.add(prato5);
		
		
		return pratos;
	}
	public List<Sobremesa> retornaListaSobremesa() {
		
		List<Sobremesa> sobremesa = new ArrayList<Sobremesa>();
		
		Sobremesa sobremesa1 = new Sobremesa();
		sobremesa1.setNome("Bolo");
		sobremesa1.setMarca("Nestlé");
		sobremesa1.setQuantidadeEstoque(22);
		sobremesa1.setQuantidadeML("10");
		sobremesa1.setValor(new BigDecimal("5.00"));
		
		Sobremesa sobremesa2 = new Sobremesa();
		sobremesa2.setNome("Cheesecake");
		sobremesa2.setMarca("Nestlé");
		sobremesa2.setQuantidadeEstoque(8);
		sobremesa2.setQuantidadeML("100");
		sobremesa2.setValor(new BigDecimal("6.00"));
		
		Sobremesa sobremesa3 = new Sobremesa();
		sobremesa3.setNome("Torta de maçã");
		sobremesa3.setMarca("Padaria");
		sobremesa3.setQuantidadeEstoque(4);
		sobremesa3.setQuantidadeML("105");
		sobremesa3.setValor(new BigDecimal("7.00"));
		
		Sobremesa sobremesa4 = new Sobremesa();
		sobremesa4.setNome("Crème Brûlée");
		sobremesa4.setMarca("Jaquin");
		sobremesa4.setQuantidadeEstoque(7);
		sobremesa4.setQuantidadeML("125");
		sobremesa4.setValor(new BigDecimal("4.00"));
		
		Sobremesa sobremesa5 = new Sobremesa();
		sobremesa5.setNome("Alfajores");
		sobremesa5.setMarca("Havana");
		sobremesa5.setQuantidadeEstoque(32);
		sobremesa5.setQuantidadeML("135");
		sobremesa5.setValor(new BigDecimal("6.00"));
		
		sobremesa.add(sobremesa1);
		sobremesa.add(sobremesa2);
		sobremesa.add(sobremesa3);
		sobremesa.add(sobremesa4);
		sobremesa.add(sobremesa5);
		
		return sobremesa;
	}

}
