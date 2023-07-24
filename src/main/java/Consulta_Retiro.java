
public class Consulta_Retiro extends Cajero_Automatico{

    private int Transacciones;
    
    @Override
    public void Transacciones (){
        System.out.println("Cuanto desea retirar: ");
        Retiro();
        if (Retiro <= getSaldo()){
            Transacciones = getSaldo();
            setSaldo (Transacciones - Retiro);
            System.out.println("-----------------------------------------");
            System.out.println("Retiro : $  " + Retiro);
            System.out.println("Tu Saldo actual es : $  " + getSaldo() );
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("Tu Saldo es insuficiente.");
            System.out.println("-------------------------");
        }
    }

    private void Retiro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
