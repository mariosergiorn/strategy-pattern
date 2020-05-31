package view;

import java.text.DecimalFormat;
import java.util.Scanner;

import Strategy.CaixaStrategy;
import Strategy.ItauStrategy;
import Strategy.SantanderStrategy;
import controller.Contexto;

public class StrategyDemo {
	
	public static void main(String[] args) {
		
	DecimalFormat df2 = new DecimalFormat("#.##");
	
	Scanner sc = new Scanner(System.in);
	
	Contexto ct = new Contexto();
	
	System.out.println("Valor do emprestimo em reais: ");
	double a = sc.nextDouble();
	
	System.out.println("Qual banco?\n1 -> Itau\n2 -> Caixa\n3 -> Santander");
	int op = sc.nextInt();
	
	if(op == 1) {
		ct.setStrategy(new ItauStrategy());
	}
	else if(op == 2) {
		ct.setStrategy(new CaixaStrategy());
	}
	else if(op == 3) {
		ct.setStrategy(new SantanderStrategy());
	}
	
	double result = ct.calcularJurosStrategy(a);
	
	System.out.println("O valor pago em juros é de R$"+ df2.format(result));
	
	sc.close();
	
	}
	
}
