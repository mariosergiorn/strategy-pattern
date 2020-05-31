package Strategy;

public class CaixaStrategy implements BankStrategy{

	@Override
	public double calcularJuros(double a) {
		return a * 0.05;
	}

}
