package org.lessons.java.shop;
import java.util.Random;


public class Main {
	
	public static void main(String[] args) {
		
			
			Random r = new Random();

			int codiceProdotto = r.nextInt(1000);
			

			Prodotto i = new Prodotto(codiceProdotto, "Pasta", "Bel prodotto", 20, 22);
			
			
			// Stampo il Nome Completo Prodotto
			System.out.println("Nome Prodotto:  " + i.nomeCompletoProdotto());
			
			// Stampo il prezzo base
			System.out.println("Il prezzo è:  " + i.prezzoBase());
			
			
			System.out.println("Prezzo con iva: " +i.prezzoConIva());
			
		}
		
	
	
	
}
