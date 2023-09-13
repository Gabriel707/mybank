package mybank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Primeira conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);

		segundaConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}