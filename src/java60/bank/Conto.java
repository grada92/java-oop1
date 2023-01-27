package java60.bank;

public class Conto {
	
	int numeroConto;
	String nome;
	double saldo;

	public Conto(String nome, int numeroConto) {
		this.numeroConto = numeroConto;
		this.saldo = 0;
		this.nome = nome;
	}
	
	// Creo metodo per Depositare
	
	void inseriscidenaro(double denaro) {
		this.saldo += denaro;
	}
	
	// Creo metodo per Prelevare
	
	boolean preleva(double denaro) {
		if (denaro > this.saldo) {
			return false;
		} else {
			this.saldo -= denaro ;
			return true;
		}
	}
	

}
	