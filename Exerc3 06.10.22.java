/*Exercício3 Desenvolva um programa que receba três palavras e imprima as três 
*palavras em ordem inversa.

*exemplo:
*entrada: Carlos, Vitor e Ana
Saída: Ana, Vitor e Carlos*/


package exerc13;
import java.util.Scanner;
public class Exerc13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String nomes[]= new String [3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digiter o "+(i+1)+"o. nome");
            nomes [i]=entrada.nextLine();
            
        }
        System.out.println("Ordem Inversa");
        for (int i = 2; i >=0; i--) {
            System.out.println(nomes[i]);
        }
        
    }
    
}
