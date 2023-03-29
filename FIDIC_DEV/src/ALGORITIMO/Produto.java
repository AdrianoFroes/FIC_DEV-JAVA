package ALGORITIMO;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double valorProduto = 0;
		double desconto = 0;
		
		System.out.println("Informe o valor do produto ");
		valorProduto = s.nextInt();
		
		System.out.println("Informe o percentual do desconto ");
		desconto = s.nextInt();
		
		
	    double	precoFinal = valorProduto - (( desconto  / 100) * valorProduto);
	    
	    
	    System.out.println("e o Valor do produto final é "  + precoFinal);
		
		
		
		s.close();
		
		
		

	}

}
