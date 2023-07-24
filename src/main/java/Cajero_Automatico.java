
import java.util.*;
public abstract class Cajero_Automatico {
   // 
int Deposito;
int Retiro;
int Saldo;
int Operaciones;
int Salir;
Scanner entrada = new Scanner (System.in);
    private int retiro;
    private int deposito;
    private int saldo;
    private int operaciones;

public void Operaciones () {
    int opcion = 0;
    int seleccion = 0;
// Este es el menu de usuario que ve en pantalla
do{
    System.out.println("-----------------------------------------");
    System.out.println("Por Favor seleccione una opcion: ");
    System.out.println("        1.Deposito");
    System.out.println("        2.Retiro");
    System.out.println("        3.Saldo");
    System.out.println("        4.Operaciones");
    System.out.println("        5.Salir");
    System.out.println("-----------------------------------------");
 seleccion = entrada.nextInt();
 
 if (seleccion >=  1 && seleccion <= 5){
     opcion = 1;
 } else {
     System.out.println("-----------------------------------------");
     System.out.println("Opcion no disponible, Elija una correcta");
     System.out.println("-----------------------------------------");
 }while (opcion == 0);
 if (opcion == 1){
     
     Cajero_Automatico mensaje = new Consulta_Deposito ();
     mensaje.Transacciones();
     
 } else if (opcion == 2){
     Cajero_Automatico mensaje = new Consulta_Retiro ();
     mensaje.Transacciones();
     
 }else if (opcion == 3){
     
     Cajero_Automatico mensaje = new Consulta ();
     mensaje.Transacciones();
     
 }else if (opcion == 5){
     System.out.println("-----------------------------------------");
     System.out.println(" Gracias por usar nuestro sistema");
     System.out.println("-----------------------------------------");
     opcion = 2;
 }
 
 
}while (opcion != 2);
}

//inicio nueva parte del bloque
public void deposito (){
    deposito = entrada.nextInt();
    
}
public void retiro (){
    retiro = entrada.nextInt();
    
}

public void operaciones (){
    operaciones = entrada.nextInt();
}

public abstract void Transacciones();

public int getSaldo (){
    return saldo;
}
public void setSaldo (int saldo){
    this.Saldo = saldo;
}


}



