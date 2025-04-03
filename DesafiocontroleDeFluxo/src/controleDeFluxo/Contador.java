package controleDeFluxo;

import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            contarNumeros(); 
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você deve digitar apenas números inteiros!");
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado. Tente novamente.");
        }
    }
    
    static void contarNumeros() {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro valor: ");
            int primeiro = sc.nextInt();

            System.out.print("Digite o segundo valor: ");
            int segundo = sc.nextInt();

            if (primeiro > segundo) {
                int diferenca = primeiro - segundo; 
                
                System.out.println("A diferença entre os números é: " + diferenca);

                for (int i = 1; i <= diferenca; i++) {
                    System.out.println("Contagem: " + i);
                }
            } else {
                System.out.println("O segundo valor deve ser maior que o primeiro!");
            }
    }

}  
   
