//criar 2 dados de 6 faces
//se a soma der 7 ou 2 => voce ganhou
//se a soma dos dados der 10 => voce perdeu
//se a soma dos dados for 6 => empate
//qualquer outro valor, o jogador rola os dados novamente

package aulaa2309;

import java.util.Random;

public class Aulaa2309 {
    public static void main(String[] args) {
        Random randao = new Random();
        
        
        for (int i = 0;; i++ ){
        
        int numero1 = randao.nextInt(6);
        int numero2 = randao.nextInt(6);
        int soma=1;
        
        System.out.println("\nKassinooo");
        System.out.println("\nSe as somas dos dados for 7 ou 2, você vence");
        System.out.println("\nSe as somas dos dados for 10, você perde.");
        System.out.println("\nSe a soma dos dados for 6, empate.");
        
        
           System.out.println("===========================================================");
        System.out.println("Iniciado rodada......");
           System.out.println("===========================================================");
           
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println("a soma do seus dados são: " + ( numero1 + numero2)) ;
        
        soma =  numero1 + numero2;
        
        if (soma == 7 ||  soma ==2){
            System.out.println("Você venceu!!!");
            break;
        }
                if (soma == 10 ){
            System.out.println("Você perdeu trouxakkkkkk");
            break;
                }
                
                if (soma == 6){
                    System.out.println("oxi, empatou");
                break;
                }else {
        System.out.println(numero1);
        System.out.println(numero2);
                }
        }
    }
}
                
    

