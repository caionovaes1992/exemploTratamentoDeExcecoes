package exemplotratamentoexcecoes;

import java.util.Scanner;

public class ExemploTratamentoExcecoes {
   
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, deno, resultado;
        
        try {
            System.out.println("Digite o numerador para a divisão: ");
            num = Integer.parseInt(ent.nextLine());
            System.out.println("Digite o denominador para a divisão: ");
            deno = Integer.parseInt(ent.nextLine());
            resultado = num / deno;
            System.out.println("O resultado da divisão e: " + resultado);
        }
        
        catch (ArithmeticException e) {
            System.out.println("Exceção gerada: " + e.getMessage());
            System.out.println("Foi gerada uma exceção aritmética, divisão por zero.");
            System.out.println("O denominador não pode ser 0 (zero).");
        }
        
        catch (NumberFormatException e){
            System.out.println("Exceção gerada: " + e.getMessage());
            System.out.println("Foi gerada uma exceção de conversão de dados.");
            System.out.println("Os valores devem ser números inteiros");
        }
        
        catch (Exception e) {
            System.out.println("Outras exceções geradas poderão ser tratadas aqui.");
        }
    }   
}
