/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class calculator_in_java {
	public static void main(String[] args) {
		
		double num1;
		double num2;
        char operador;
		double resultado = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Digite o operador (+, -, *, /, ^): ");
		operador = scanner.next().charAt(0);
		
		System.out.print("Digite o segundo número: ");
		num2 = scanner.nextDouble();
		
		
		switch(operador) {
		case '+' -> resultado = num1 + num2;
		case '-' -> resultado = num1 - num2;
		case '*' -> resultado = num1 * num2;
		case '/' -> resultado = num1 / num2;
		case '^' -> resultado = Math.pow(num1, num2);
		default -> System.out.print("O operador não é válido");
		}
		
		
		if((num2 == 0) && (operador == '/')) {
			System.out.print("O segundo valor não pode ser igual a 0 na divisão");
		}
		else {
			System.out.printf("O valor de %.1f %c %.1f é: %.1f ", num1, operador, num2, resultado);
		}
		
		scanner.close();
	}
}