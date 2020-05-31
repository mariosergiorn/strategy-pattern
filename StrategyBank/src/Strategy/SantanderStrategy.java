package Strategy;

public class SantanderStrategy implements BankStrategy{

	@Override
	public double calcularJuros(double a) {
		return a*0.07;
	}

}
