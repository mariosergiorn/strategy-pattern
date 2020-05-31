package view;

import java.util.Scanner;
import model.Contexto;
import strategy.StrategyAdicao;
import strategy.StrategyDivisao;
import strategy.StrategyMultiplicacao;
import strategy.StrategySubtracao;

public class StrategyDemo {
	
	public static void main(String[] args) {
		
		int op;
		
		Scanner sc = new Scanner(System.in);
		
		Contexto et = new Contexto();
		
		System.out.println("Digite o primeiro numero: ");
		int a = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int b = sc.nextInt();
		
		System.out.println("Qual operação deseja realizar?\n1 -> SOMA\n2 - >SUBTRAÇÃO\n3 -> DIVISÃO\n4 -> MULTIPLICAÇÃO");
		op = sc.nextInt();
		
		
		if(op == 1) {
			et.setStrategy(new StrategyAdicao());
		}
		else if(op == 2) {
			et.setStrategy(new StrategySubtracao());
		}
		else if(op == 3) {
			et.setStrategy(new StrategyDivisao());
		}
		else if(op == 4) {
			et.setStrategy(new StrategyMultiplicacao());
		}
		
		int resultado = et.operacaoStrategy(a, b);
		
		System.out.println("O resultado desta operacao eh: "+resultado);
		
		sc.close();
		
	}

}
