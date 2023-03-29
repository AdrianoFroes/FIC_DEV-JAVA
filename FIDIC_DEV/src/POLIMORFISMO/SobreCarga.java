package POLIMORFISMO;

public class SobreCarga {
	/*Exemplo de polimorfismo de sobreCarga*/
	public int somar(int n1, int n2) {
		int soma = n1 + n2;
		return soma;
	}
	
	public int somar(int n1, int n2, int n3) {
		int soma = n1 + n2 + n3;
		return soma;
	}

	public double somar(double n1, double n2) {
		double soma = n1 + n2;
		return soma;
	}
	
	public static void main(String[] args) {
		SobreCarga calc = new SobreCarga();
		System.out.println("Resultado da somar é: " + calc.somar(7,2));
	}
}
