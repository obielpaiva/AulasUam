package jogo;
import java.util.Scanner;
public class Jogo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        personagem perso = new personagem("Biel");
        
        String nomeChar, classes, opcao;
        
        System.out.println(perso.nome + ", digite o nome do seu pergonagem");
        nomeChar = entrada.next();
        
        System.out.println("Bem vindo, " + nomeChar + " !");
        
        System.out.println(nomeChar + ", escolha um das classes: cacador, comilao, dorminhoco");
        classes = entrada.next();
        
        switch (classes){
            case "cacador":
                System.out.println("Classe cacador escolhida!!!");
                perso.setStatus(10, 0, 0);
                perso.getStatus();
                break;
                
            case "comilao":
            System.out.println("Classe comilao escolhida!!!");
            perso.setStatus(6, 5, 2);
            perso.getStatus();
            break;
            
            case "dorminhoco":
                System.out.println("Classe dorminhoco esclhida!!!");
                perso.setStatus(1, 4, 7);
                perso.getStatus();
                break;
            default:
                System.out.println("Opcao invalida, digite uma opcao valida(cacador, comilao, dorminhoco)");
                
        }
System.out.println(nomeChar + ", digite o que desejar relizar: cacar, comer, dormir");
opcao = entrada.next();

switch (opcao){
    case "cacar":
        perso.cacar();
        perso.getStatus();
        break;
    case "comer":
        perso.comer();
        perso.getStatus();
        break;
    case "dormir":
            perso.dormir();
            perso.getStatus();
            break;
    default:
        System.out.println("Opcao invalida, digite uma opcao valida: cacar, comer, dormir.)");
}
   entrada.close();     
        
    }
    
}
