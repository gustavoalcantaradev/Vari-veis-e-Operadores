package VariaveisOperadores;

import java.util.Scanner;

public class exercicio1 {
	

	public static void main(String[] args) {
		
	float salario,abono,novosalario;
		
	Scanner leia = new Scanner (System.in);	
	
	System.out.println("Digite o Salário:");
	salario = leia.nextFloat();
	System.out.println("Digite o Abono:");
	abono = leia.nextFloat();
	
	novosalario = (salario + abono);
	System.out.println("Salário atualizado: "+novosalario);

	}

}
