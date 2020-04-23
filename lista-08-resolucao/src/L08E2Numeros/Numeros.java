package L08E2Numeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeros {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<Integer> lista = new ArrayList();
        
        Integer num = 1;
        Integer somaNumeros = 0;
        Integer maiorNumLista1 = 0;
        Integer maiorNumLista = 0;
        Integer menorNumeroLista1 = 0;
        Integer menorNumeroLista = 0;
        
        //Laço de repetição até digitar 0
        System.out.println("Digite números inteiros até cansar, depois digite zero.");
        while(num != 0){
            num = leitor.nextInt();
            lista.add(num);
        }
        
        //Parte da soma e dos maiores-menores numeros
        for(Integer numLista : lista){
            if(maiorNumLista1 < numLista){
                maiorNumLista = numLista;
            }
            
            if(menorNumeroLista1 > numLista){
                menorNumeroLista = numLista;
            }
            
            somaNumeros += numLista;
            maiorNumLista1 = numLista;
            menorNumeroLista1 = numLista;
        }
        
        //Parte dos números pares-impares em lista
        System.out.println("Números pares que você digitou: ");
        for(Integer numLista : lista){
            if(numLista %2 == 0){
                System.out.println(String.format("%d ",numLista));
            }          
        }
        
        System.out.println("Números impares que você digitou: ");
        for(Integer numLista : lista){
            if(numLista %2 != 0){
                System.out.println(String.format("%d ",numLista));
            }          
        }
        
        //Exibição da soma e dos maiores-menores
        System.out.println(String.format("Soma de todos os números que você digitou: %d", somaNumeros));
        System.out.println(String.format("Menor número que você digitou: %d",menorNumeroLista));
        System.out.println(String.format("Maior número que você digitou: %d", maiorNumLista));
        
    }

}
