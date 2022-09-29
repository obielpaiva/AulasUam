package aula2909;
public class classeAula2909 {
    //atributos
    private int numero;
    private double saldo;
    private String nome;
    //métodos acessores
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    //comportamento
    public void deposita(double valor){
        this.saldo+=valor*1.1;
        }
    public void sacar(double valor){
        if(this.saldo>=valor){
        this.saldo-=valor;
       }else System.out.println("Saldo insuficiente");

    }
            
        public double getSaldo(){
        return this.saldo;       
        }
}
