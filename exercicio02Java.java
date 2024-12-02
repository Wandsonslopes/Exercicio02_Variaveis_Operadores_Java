package exercicio02Java;

import java.util.Scanner;

public class exercicio02Java {

	public static void main(String[] args) {
		    // Variaveis
			float nota1;
		    float nota2;
			float nota3;
			float nota4;
			float media;
						
			// Construindo o leia
			Scanner leia = new Scanner(System.in);
					
			// Entrada de Dados			
			System.out.println("Informe a sua Nota 1");
			nota1 = leia.nextFloat();
						
			System.out.println("Informe a sua Nota 2");
			nota2 = leia.nextFloat();
			
			System.out.println("Informe a sua Nota 3");
			nota3 = leia.nextFloat();
			
			System.out.println("Informe a sua Nota 4");
			nota4 = leia.nextFloat();
					
			// Processamento				
			media = (nota1 + nota2 + nota3 + nota4)/4;
						
			// Saida dos Dados
			System.out.println("A sua media é:" + media);

	}

}
