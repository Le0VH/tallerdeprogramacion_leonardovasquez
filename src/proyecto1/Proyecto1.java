/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;
import proyecto1.CuentaBancaria;
import java.util.Scanner;
/**
 *
 * @author Haxxor Bunny
 */
public class Proyecto1 {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    CuentaBancaria CB = new CuentaBancaria();

//modificar nombre
CB.settitular("Leonardo");
//mostrar nombre con mensaje
System.out.println("El nombre del titular de la cuenta es: " + CB.gettitular());
//agregar saldo
CB.setsaldo(5000000);
//retirar saldo
System.out.println("ingrese monto a retirar");
     int retiro =  sc.nextInt();
int saldoactual = CB.getsaldo() - retiro;
if(retiro > CB.getsaldo()){
System.out.println("Su saldo es insuficiente, se sugiere cargar mas");
}
else{CB.setsaldo(saldoactual);
System.out.println("Transaccion completa, su nuevo saldo es de: " + CB.getsaldo());
}
//System.out.println(CB.getsaldo());

}

}

