

public class Consulta_Deposito extends Cajero_Automatico{

    private int Transacciones;
     @Override
     public void Transacciones (){
         System.out.print("Cuanto desea depositar?");
         deposito();
         
         
         Transacciones = getSaldo();
         setSaldo(Transacciones + Deposito);
         System.out.println("----------------------------------------");
         System.out.println("Dinero depositado $ + " + Deposito);
         System.out.println("Su saldo actual es de $  " + getSaldo());
         System.out.println("----------------------------------------");
         
     }
    
}
