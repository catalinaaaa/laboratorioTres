/**
 * @author catas
 * @version 1
 */
package aplicacion;

import logicadenegocios.Cuenta;

public class AplCuenta {
     
  public static void main(String[] args){
    // Cuenta unaCuenta = new Cuenta();
    // unaCuenta.setDuenio("Odo Smith");
    // unaCuenta.setNumCuenta(1);
    
    // System.out.println(unaCuenta.depositar(2000));
    // System.out.println(unaCuenta.retirar(500));
    // System.out.println(unaCuenta.toString());
    
    Cuenta cuentaUno = new Cuenta("George Takei", 2000);
    Cuenta cuentaDos = new Cuenta("Luna Hamull", 5000);
    
    System.out.println(cuentaUno.depositar(2000));
    System.out.println(cuentaUno.retirar(500));
    System.out.println();
    System.out.println(cuentaUno.toString());
    System.out.println(cuentaDos.toString());
    }
}
