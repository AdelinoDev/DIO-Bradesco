package Principal;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.print("Por favor, informe o número da agência: ");
		numero = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Por favor, informe a agência: ");
		agencia = sc.nextLine();
		System.out.print("Por favor, informe o nome do cliente: ");
		nomeCliente = sc.nextLine();
		System.out.print("Por favor, informe o saldo da conta do cliente: ");
		saldo = sc.nextDouble(); 
		
		System.out.printf("Cliente: %s, número da agência %d, agência %s seu saldo é R$ %.2f.%n"
				, nomeCliente, numero, agencia, saldo);
		
		sc.close();
	}

}
