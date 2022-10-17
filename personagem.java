public class personagem {

//atributos
String nome;

int energia, fome, sono;

//métodos
public void getStatus() {
    System.out.println("Energia:" +this.energia + "\nFome:" + this.fome + "\nSono:" +this.sono);
}
public void setStatus(int energia, int fome, int sono){
this.energia = energia;
this.fome - fome;
this.sono = sono;
}

//comportamentos

public void cacar(){
    if (this.energia> 2){
        this.energia -= 2;
        this.fome += 1;
        this.fome += 1;
    }else {
        System.out.println("Nao pode cacar!");
    }
}

public void comer() {
    if(this.fome > 1){
        this.fome = 0;
        this.energia -= 1;
        this.sono += 2;
    }else {
        System.out.println("Fome insuficiente!");
    }
}

public void dormir(){
    if(this.sono > 3){
        this.sono = 0;
        this.energia += 10;
        this.fome +=2;
    }else{
        System.out.print("Voce nao esta com tanto sono!");
    }
}

//contrutor 

personagem(String nome) {
    this.nome = nome;
}
}