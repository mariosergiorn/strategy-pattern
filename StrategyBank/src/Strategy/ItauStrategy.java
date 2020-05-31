package Strategy;

public class ItauStrategy implements BankStrategy{

	@Override
	public double calcularJuros(double a) {
		return a*0.10;
	}

}
