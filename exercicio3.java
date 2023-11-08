package VariaveisOperadores;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float salario, adicional, horasextra, descontos, salarioliquido;
		
		
		System.out.println("Digite o seu saláro bruto: ");
		salario = leia.nextFloat();
		System.out.println("Digite o seu adicional noturno:");
		adicional = leia.nextFloat();
		System.out.println("Qual valor das horas extras? ");
		horasextra = leia.nextFloat();
		System.out.println("Digete os descontos: ");
		descontos = leia.nextFloat();
		
		salarioliquido = (salario + adicional + (horasextra * 5) - descontos);
		System.out.println("O seu salário liquido é: "+salarioliquido);
	}

}
