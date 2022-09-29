package aula2909;
public class Aula2909 {
    
    public static void main(String[] args) {
        
      classeAula2909 cc = new classeAula2909();
      cc.setNome("João");
      cc.deposita(1000);
      //%10 do saldo é do banco
      cc.sacar(10);
        System.out.println(cc.getSaldo());
        
    }
    
}
