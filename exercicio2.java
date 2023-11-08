package VariaveisOperadores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextFloat();
		System.out.println("Digite a quarta nota: ");
		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4)/4;
		System.out.println("Média final: "+media);

	}

}
