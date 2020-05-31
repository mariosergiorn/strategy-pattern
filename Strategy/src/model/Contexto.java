package model;

import strategy.Calculadora;

public class Contexto {
	
	private Calculadora calculadora;

	public Contexto() {}
	
	public void setStrategy(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	
	public int operacaoStrategy(int a, int b) {
		return calculadora.operacao(a, b);
		
	}

}
