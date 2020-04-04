// Pacote que esta classe faz parte
package lista.pkg01;

// Importação da classe Scanner
import java.util.Scanner;

// Início da classe
public class L1E1Calculadora {
    
    // Declaração do método main
    // Início do método
    // Atalho = psvm
    public static void main(String[] args) {
        
        /* Criação do objeto da classe Scanner.
        Utilizada para ler teclado.*/
        Scanner leitor = new Scanner(System.in);
        
        /* println exibe a mensagem e posiciona na próxima linha.
        Atalho = sout*/
        System.out.println("Digite um número para calcular: ");
        //Leitura do número digitado e atribuição para variável "n1".
        Double n1 = leitor.nextDouble();
        
        System.out.println("Digite outro número para calcular: ");
        Double n2 = leitor.nextDouble();
        
        // Exibe uma mensagem ao usúario juntamente a nota digitada com concatenação.
        System.out.println("Resultado da soma dos números é igual a: "+(n1+n2));
        System.out.println("Resultado da subtração dos números é igual a: "+(n1-n2));
        System.out.println("Resultado da multiplicação dos números é igual a: "+(n1*n2));
        System.out.println("Resultado da divisão dos números é igual a: "+(n1/n2));
    }   
}