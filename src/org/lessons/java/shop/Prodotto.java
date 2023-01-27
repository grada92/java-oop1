package org.lessons.java.shop;



public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva ;
	
	

	public Prodotto(int codice, String nome, String descrizione, int prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	//metodo per Stampare Nome Completo
	String nomeCompletoProdotto() {
		
		return  codice + nome;
		
	}
	
     int prezzoBase() {
		
	  return prezzo;
	}
	
	int prezzoConIva () {
		
		return prezzo + iva;
	}
	
}
