package controller;

import Strategy.BankStrategy;

public class Contexto {
	
	private BankStrategy bankStrategy;
	
	public Contexto(){}
	
	public void setStrategy(BankStrategy bankStrategy) {
		this.bankStrategy = bankStrategy;
	}
	
	public double calcularJurosStrategy(double a) {
		return bankStrategy.calcularJuros(a);
	}

}
