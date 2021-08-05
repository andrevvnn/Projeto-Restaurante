package inicializacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.Bebidas;

public class CardapioInicializao {

	
	
	public List<Bebidas> retornaCardapioBebidas (){
		
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
	

}
