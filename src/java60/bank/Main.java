package java60.bank;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		int numeroConto = 0;
		String sceltaUtente = "";
		double denaro;
		
		// Creo Scanner per far inserire dati Utente
		
		Scanner s = new Scanner(System.in);
		System.out.println("Dimmi il tuo nome:");
		nome = s.nextLine();

		Random r = new Random();
		numeroConto = r.nextInt(1000);

		Conto c = new Conto(nome, numeroConto);
		
		// Stampo Conto Utente
		System.out.println("Nome: " + nome);
		System.out.println("Numero Conto : " + numeroConto);
		System.out.println("Saldo: " + c.saldo);

		while (!sceltaUtente.equals("chiudere")) {
			System.out.println("Vuoi depositare, prelevare o chiudere?");
			sceltaUtente = s.nextLine();
			
			
			// Condizione per depositare o prelevare
			
			if (sceltaUtente.equals("depositare")) {
				System.out.println("Quanto depositi?");
				denaro = s.nextDouble();
				s.nextLine();
				c.inseriscidenaro(denaro);
				System.out.println("Saldo: " + c.saldo);
			} else if (sceltaUtente.equals("prelevare")) {
				System.out.println("Quanto prelevi?");
				denaro = s.nextDouble();
				s.nextLine();
				if (denaro > c.saldo) {
					
					System.out.println("Non hai denaro sul tuo conto!");
					System.out.println("Saldo: " + c.saldo);
				} else {
					c.preleva(denaro);
					System.out.println("Saldo: " + c.saldo);
				}
			}
		}
		
		// Condizione per Chiudere Conto
		
		if (sceltaUtente.equals("chiudere")) {
			
			System.out.println("Arrivederci!");
		}

		s.close();
		
	}

}